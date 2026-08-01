package jp.co.hjn.merryapi.application.controller.employee.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import jp.co.hjn.merryapi.common.enums.EmployeePosition;
import jp.co.hjn.merryapi.common.enums.Sex;
import jp.co.hjn.merryapi.common.enums.SystemRole;
import jp.co.hjn.merryapi.domain.dto.EmployeeDto;
import lombok.Data;

/**
 * 社員レスポンスクラス
 *
 */
@Data
public class EmployeeResponse {
    /** 名前 名 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("id")
    private Integer id;
    /** 名前 名 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("nameFirst")
    private String nameFirst;
    /** 名前 性 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("nameLast")
    private String nameLast;
    /** 名前 名 カナ */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("nameFirstKana")
    private String nameFirstKana;
    /** 名前 性 カナ */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("nameLastKana")
    private String nameLastKana;
    /** 役職 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("employeePosition")
    private String employeePosition;
    /** システムロール */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("systemRole")
    private String systemRole;
    /** 郵便番号 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("postalCode")
    private String postalCode;
    /** 都道府県 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("prefectures")
    private String prefectures;
    /** 市区町村 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("municipalities")
    private String municipalities;
    /** 住所1 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("address1")
    private String address1;
    /** 住所2 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("address2")
    private String address2;
    /** 電話番号 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    /** 生年月日 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("birthday")
    private String birthday;
    /** 性別 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("sex")
    private String sex;

    public EmployeeResponse(EmployeeDto dto) {
        this.id = dto.getId();
        this.nameFirst = dto.getNameFirst();
        this.nameLast = dto.getNameLast();
        this.nameFirstKana = dto.getNameFirstKana();
        this.nameLastKana = dto.getNameLastKana();
        Optional<EmployeePosition> optEmployeePosition = Optional.ofNullable(dto.getEmployeePosition());
        this.employeePosition = optEmployeePosition.isPresent() ? optEmployeePosition.get().getName() : null;
        Optional<SystemRole> optSystemRole = Optional.ofNullable(dto.getSystemRole());
        this.systemRole = optSystemRole.isPresent() ? optSystemRole.get().getName() : null;
        this.postalCode = dto.getPostalCode();
        this.prefectures = dto.getPrefectures();
        this.municipalities = dto.getMunicipalities();
        this.address1 = dto.getAddress1();
        this.address2 = dto.getAddress2();
        this.phoneNumber = dto.getPhoneNumber();
        Optional<LocalDate> optBirthday = Optional.ofNullable(dto.getBirthday());
        this.birthday = optBirthday.isPresent() ? dto.getBirthday().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"))
                : null;
        Optional<Sex> optSex = Optional.ofNullable(dto.getSex());
        this.sex = optSex.isPresent() ? optSex.get().getName() : null;
    }
}