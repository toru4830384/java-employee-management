package jp.co.hjn.merryapi.domain.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import jp.co.hjn.merryapi.domain.dto.EmployeeDto;
import jp.co.hjn.merryapi.infrastructure.mapper.EmployeeMapper;
import jp.co.hjn.merryapi.infrastructure.model.Employee;
import jp.co.hjn.merryapi.infrastructure.model.EmployeeExample;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * 社員サービス
 *
 */
@RequiredArgsConstructor
@Service
public class EmployeeService {

    /** ModelMapper */
    @NonNull
    private final ModelMapper modelMapper;

    /** ModelMapper */
    @NonNull
    private final EmployeeMapper employeeMapper;

    /**
     * 社員取得
     *
     * @param idList IDリスト
     * @return 社員リスト
     */
    public List<EmployeeDto> find(List<Integer> idList) {
        if (CollectionUtils.isEmpty(idList))
            return new ArrayList<EmployeeDto>();

        EmployeeExample example = new EmployeeExample();
        example.createCriteria().andIdIn(idList);
        List<Employee> employeeList = this.employeeMapper.selectByExample(example);

        return employeeList.stream().map(e -> this.modelMapper.map(e, EmployeeDto.class)).toList();
    }

    /**
     * 社員作成
     *
     * @param dto 社員DTO
     * @return true:OK、false:NG
     */
    public boolean create(EmployeeDto dto) {
        if (ObjectUtils.isEmpty(dto)) {
            return false;
        }

        // 社員エンティティへ変換
        Employee employee = this.modelMapper.map(dto, Employee.class);
        // 作成日、更新日設定
        Date nowDate = new Date();
        employee.setCreatedAt(nowDate);
        employee.setUpdatedAt(nowDate);

        return this.employeeMapper.insert(employee) > 0 ? true : false;
    }

    /**
     * 社員更新
     *
     * @param dto 社員DTO
     * @return true:OK、false:NG
     */
    public boolean update(EmployeeDto dto) {
        if (ObjectUtils.isEmpty(dto) || dto.getId() == null) {
            return false;
        }

        // 社員エンティティへ変換
        Employee employee = this.modelMapper.map(dto, Employee.class);
        // 更新日設定
        employee.setUpdatedAt(new Date());

        EmployeeExample example = new EmployeeExample();
        example.createCriteria().andIdEqualTo(employee.getId());
        return this.employeeMapper.updateByExampleSelective(employee, example) > 0 ? true : false;
    }

    /**
     * 社員削除
     *
     * @param dto 社員DTO
     * @return true:OK、false:NG
     */
    public boolean delete(EmployeeDto dto) {
        if (ObjectUtils.isEmpty(dto) || dto.getId() == null) {
            return false;
        }

        // 論理削除
        Date nowDate = new Date();
        Employee employee = new Employee();
        employee.setUpdatedAt(nowDate);
        employee.setDeletedAt(nowDate);

        EmployeeExample example = new EmployeeExample();
        example.createCriteria().andIdEqualTo(dto.getId());
        return this.employeeMapper.updateByExampleSelective(employee, example) > 0 ? true : false;
    }
}
