package jp.co.hjn.merryapi.domain.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import jp.co.hjn.merryapi.application.controller.employee.dto.EmployeeRequest;
import jp.co.hjn.merryapi.common.enums.EmployeePosition;
import jp.co.hjn.merryapi.common.enums.Sex;
import jp.co.hjn.merryapi.common.enums.SystemRole;
import lombok.Data;

/**
 * 社員Dtoクラス
 *
 */
@Data
public class EmployeeDto {
        /** ID */
        private Integer id;
        /** 名前 名 */
        private String nameFirst;
        /** 名前 性 */
        private String nameLast;
        /** 名前 名 カナ */
        private String nameFirstKana;
        /** 名前 性 カナ */
        private String nameLastKana;
        /** 役職 */
        private EmployeePosition employeePosition;
        /** システムロール */
        private SystemRole systemRole;
        /** 郵便番号 */
        private String postalCode;
        /** 都道府県 */
        private String prefectures;
        /** 市区町村 */
        private String municipalities;
        /** 住所1 */
        private String address1;
        /** 住所2 */
        private String address2;
        /** 電話番号 */
        private String phoneNumber;
        /** 生年月日 */
        private LocalDate birthday;
        /** 性別 */
        private Sex sex;

        /**
         * コンストラクタ
         * ※初期化なし
         */
        public EmployeeDto() {
        }

        /**
         * コンストラクタ
         *
         * @param request 社員リクエスト
         */
        public EmployeeDto(EmployeeRequest request) {
                this.id = request.getId();
                this.nameFirst = request.getNameFirst();
                this.nameLast = request.getNameLast();
                this.nameFirstKana = request.getNameFirstKana();
                this.nameLastKana = request.getNameLastKana();
                Optional<String> optEmployeePosition = Optional.ofNullable(request.getEmployeePosition());
                this.employeePosition = optEmployeePosition.isPresent()
                                ? EmployeePosition.getObject(Integer.parseInt(optEmployeePosition.get()))
                                : null;
                Optional<String> optSystemRole = Optional.ofNullable(request.getSystemRole());
                this.systemRole = optSystemRole.isPresent()
                                ? SystemRole.getObject(Integer.parseInt(optSystemRole.get()))
                                : null;
                this.postalCode = request.getPostalCode();
                this.prefectures = request.getPrefectures();
                this.municipalities = request.getMunicipalities();
                this.address1 = request.getAddress1();
                this.address2 = request.getAddress2();
                this.phoneNumber = request.getPhoneNumber();
                Optional<String> optBirthday = Optional.ofNullable(request.getBirthday());
                this.birthday = optBirthday.isPresent()
                                ? LocalDate.parse(optBirthday.get(), DateTimeFormatter.ofPattern("yyyy/MM/dd"))
                                : null;
                Optional<String> optSex = Optional.ofNullable(request.getSex());
                this.sex = optSex.isPresent()
                                ? Sex.getObject(Integer.parseInt(optSex.get()))
                                : null;

        }
}