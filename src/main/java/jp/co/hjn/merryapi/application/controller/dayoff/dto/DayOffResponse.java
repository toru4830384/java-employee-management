package jp.co.hjn.merryapi.application.controller.dayoff.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jp.co.hjn.merryapi.domain.dto.DayOffDto;
import lombok.Data;

/**
 * 休暇レスポンスクラス
 *
 */
@Data
public class DayOffResponse {

    /** ID */
    private Integer id;

    /** 社員ID */
    private Integer employeeId;

    /** 休暇開始日 */
    private String startDate;

    /** 休暇終了日 */
    private String endDate;

    /**
     * コンストラクタ
     *
     * @param dto 休暇DTO
     */
    public DayOffResponse(DayOffDto dto) {
        this.id = dto.getId();
        this.employeeId = dto.getEmployeeId();
        this.startDate = formatDate(dto.getStartDate());
        this.endDate = formatDate(dto.getEndDate());
    }

    /**
     * 日付をレスポンス形式に変換
     *
     * @param date 日付
     * @return yyyy/MM/dd形式の日付
     */
    private String formatDate(LocalDate date) {
        if (date == null) {
            return null;
        }

        return date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    }
}