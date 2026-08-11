package jp.co.hjn.merryapi.domain.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import jp.co.hjn.merryapi.application.controller.dayoff.dto.DayOffRequest;
import lombok.Data;

/**
 * 休暇Dtoクラス
 *
 */
@Data
public class DayOffDto {

    /** ID */
    private Integer id;

    /** 社員ID */
    private Integer employeeId;

    /** 休暇開始日 */
    private LocalDate startDate;

    /** 休暇終了日 */
    private LocalDate endDate;

    /**
     * コンストラクタ
     * ※初期化なし
     */
    public DayOffDto() {
    }

    /**
     * コンストラクタ
     *
     * @param request 休暇リクエスト
     */
    public DayOffDto(DayOffRequest request) {
        this.id = request.getId();
        this.employeeId = request.getEmployeeId();

        Optional<String> optStartDate = Optional.ofNullable(request.getStartDate());
        this.startDate = optStartDate.isPresent()
                ? LocalDate.parse(
                        optStartDate.get(),
                        DateTimeFormatter.ofPattern("yyyy/MM/dd"))
                : null;

        Optional<String> optEndDate = Optional.ofNullable(request.getEndDate());
        this.endDate = optEndDate.isPresent()
                ? LocalDate.parse(
                        optEndDate.get(),
                        DateTimeFormatter.ofPattern("yyyy/MM/dd"))
                : null;
    }
}