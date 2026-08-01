package jp.co.hjn.merryapi.application.controller.employee.dto;

import java.util.List;

import jp.co.hjn.merryapi.domain.dto.EmployeeDto;
import lombok.Data;

/**
 * 社員レスポンス
 *
 */
@Data
public class EmployeeGetResponse {
    /** 社員DTOリスト */
    private List<EmployeeResponse> employeeList;

    /**
     * コンストラクタ
     *
     * @param employeeDtoList 社員DTOリスト
     */
    public EmployeeGetResponse(List<EmployeeDto> employeeDtoList) {
        this.employeeList = employeeDtoList.stream().map(dto -> new EmployeeResponse(dto)).toList();
    }
}