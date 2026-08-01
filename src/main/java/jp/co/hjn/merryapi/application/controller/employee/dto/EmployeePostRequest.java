package jp.co.hjn.merryapi.application.controller.employee.dto;

import jp.co.hjn.merryapi.domain.dto.EmployeeDto;
import lombok.Data;

/**
 * 社員作成レスポンス
 *
 */
@Data
public class EmployeePostRequest {
    /** 社員DTO */
    private EmployeeDto employeeDto;

    /**
     * コンストラクタ
     *
     * @param employeeDto 社員DTO
     */
    public EmployeePostRequest(EmployeeDto employeeDto) {
        this.employeeDto = employeeDto;
    }
}
