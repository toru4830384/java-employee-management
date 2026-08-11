package jp.co.hjn.merryapi.application.controller.dayoff.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Pattern;
import lombok.Data;

/**
 * 休暇リクエストクラス
 *
 */
@Data
public class DayOffRequest {

    /** ID */
    @JsonProperty("id")
    private Integer id;

    /** 社員ID */
    @JsonProperty("employeeId")
    private Integer employeeId;

    /** 休暇開始日 */
    @JsonProperty("startDate")
    @Pattern(
            regexp = "^\\d{4}/\\d{2}/\\d{2}$",
            message = "日付はyyyy/MM/dd形式で入力してください。")
    private String startDate;

    /** 休暇終了日 */
    @JsonProperty("endDate")
    @Pattern(
            regexp = "^\\d{4}/\\d{2}/\\d{2}$",
            message = "日付はyyyy/MM/dd形式で入力してください。")
    private String endDate;
}