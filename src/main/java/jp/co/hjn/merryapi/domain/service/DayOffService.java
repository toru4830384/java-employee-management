package jp.co.hjn.merryapi.domain.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import jp.co.hjn.merryapi.domain.dto.DayOffDto;
import jp.co.hjn.merryapi.infrastructure.mapper.DayOffMapper;
import jp.co.hjn.merryapi.infrastructure.model.DayOff;
import jp.co.hjn.merryapi.infrastructure.model.DayOffExample;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * 休暇サービス
 *
 */
@RequiredArgsConstructor
@Service
public class DayOffService {

    /** ModelMapper */
    @NonNull
    private final ModelMapper modelMapper;

    /** 休暇Mapper */
    @NonNull
    private final DayOffMapper dayOffMapper;

    /**
     * 休暇取得
     *
     * @param idList IDリスト
     * @return 休暇リスト
     */
    public List<DayOffDto> find(List<Integer> idList) {
        if (CollectionUtils.isEmpty(idList)) {
            return new ArrayList<DayOffDto>();
        }

        DayOffExample example = new DayOffExample();
        example.createCriteria().andIdIn(idList).andDeletedAtIsNull();

        List<DayOff> dayOffList = this.dayOffMapper.selectByExample(example);

        return dayOffList.stream()
                .map(e -> this.modelMapper.map(e, DayOffDto.class))
                .toList();
    }

    /**
     * 休暇作成
     *
     * @param dto 休暇DTO
     * @return true:OK、false:NG
     */
    public boolean create(DayOffDto dto) {
        if (ObjectUtils.isEmpty(dto)) {
            return false;
        }

        DayOff dayOff = this.modelMapper.map(dto, DayOff.class);

        Date nowDate = new Date();
        dayOff.setCreatedAt(nowDate);
        dayOff.setUpdatedAt(nowDate);

        return this.dayOffMapper.insert(dayOff) > 0;
    }

    /**
     * 休暇更新
     *
     * @param dto 休暇DTO
     * @return true:OK、false:NG
     */
    public boolean update(DayOffDto dto) {
        if (ObjectUtils.isEmpty(dto) || dto.getId() == null) {
            return false;
        }

        DayOff dayOff = this.modelMapper.map(dto, DayOff.class);
        dayOff.setUpdatedAt(new Date());

        DayOffExample example = new DayOffExample();
        example.createCriteria().andIdEqualTo(dayOff.getId());

        return this.dayOffMapper.updateByExampleSelective(dayOff, example) > 0;
    }

    /**
     * 休暇削除
     *
     * @param dto 休暇DTO
     * @return true:OK、false:NG
     */
    public boolean delete(DayOffDto dto) {
        if (ObjectUtils.isEmpty(dto) || dto.getId() == null) {
            return false;
        }

        // 論理削除
        Date nowDate = new Date();

        DayOff dayOff = new DayOff();
        dayOff.setUpdatedAt(nowDate);
        dayOff.setDeletedAt(nowDate);

        DayOffExample example = new DayOffExample();
        example.createCriteria().andIdEqualTo(dto.getId());

        return this.dayOffMapper.updateByExampleSelective(dayOff, example) > 0;
    }
}