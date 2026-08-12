package jp.co.hjn.merryapi.application.controller.employee;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jp.co.hjn.merryapi.application.controller.common.dto.ResultResponse;
import jp.co.hjn.merryapi.application.controller.employee.dto.EmployeeRequest;
import jp.co.hjn.merryapi.application.controller.employee.dto.EmployeeResponse;
import jp.co.hjn.merryapi.common.enums.ResultCode;
import jp.co.hjn.merryapi.domain.dto.EmployeeDto;
import jp.co.hjn.merryapi.domain.service.EmployeeService;

/**
 * 社員コントローラー
 *
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

        /** 社員サービス */
        private EmployeeService employeeService;

        /**
         * コンストラクタ
         *
         * @param employeeService 社員サービス
         */
        public EmployeeController(EmployeeService employeeService) {
                this.employeeService = employeeService;
        }

        /**
         * 社員取得
         *
         * @param request リクエスト
         * @return ResponseEntity EmployeeGetResponse
         */
        @GetMapping("/find")
        public ResponseEntity<List<EmployeeResponse>> find(@RequestParam List<Integer> ids) {
                return ResponseEntity.ok(
                                this.employeeService.find(ids)
                                                .stream()
                                                .map(dto -> new EmployeeResponse(dto))
                                                .toList());
        }

        /**
         * 役職指定で社員取得
         *
         * @param positions 役職IDリスト
         * @return ResponseEntity EmployeeResponse
         */
        @GetMapping("/findByPosition")
        public ResponseEntity<List<EmployeeResponse>> findByPosition(@RequestParam List<Integer> positions) {
                return ResponseEntity.ok(
                                this.employeeService.findByPosition(positions)
                                                .stream()
                                                .map(dto -> new EmployeeResponse(dto))
                                                .toList());
        }

        /**
         * 社員登録
         *
         * @param request       リクエスト
         * @param bindingResult 入力エラー結果
         * @return ResponseEntity ResultResponse
         */
        @PostMapping("/create")
        public ResponseEntity<ResultResponse> create(
                        @RequestBody @Validated({ EmployeeRequest.CreateEmployee.class }) EmployeeRequest request,
                        Errors errors) {
                if (errors.hasErrors()) {
                        List<String> errorMessages = errors.getAllErrors().stream().map(e -> e.getDefaultMessage()).toList();
                        return ResponseEntity.badRequest().body(new ResultResponse(ResultCode.NG.getCode(), errorMessages));
                }
                return ResponseEntity.ok(
                                this.employeeService.create(new EmployeeDto(request))
                                                ? new ResultResponse(ResultCode.OK.getCode())
                                                : new ResultResponse(ResultCode.NG.getCode()));
        }

        /**
         * 社員更新
         *
         * @param request リクエスト
         * @return ResponseEntity ResultResponse
         */
        @PutMapping("/update")
        public ResponseEntity<ResultResponse> update(
        		       @RequestBody @Validated({ EmployeeRequest.CreateEmployee.class }) EmployeeRequest request,
                       Errors errors) {
                if (errors.hasErrors()) {
                	List<String> errorMessages = errors.getAllErrors().stream().map(e -> e.getDefaultMessage()).toList();
                        return ResponseEntity.badRequest().body(new ResultResponse(ResultCode.NG.getCode(), errorMessages));
                }
                return ResponseEntity.ok(
                                this.employeeService.update(new EmployeeDto(request))
                                                ? new ResultResponse(ResultCode.OK.getCode())
                                                : new ResultResponse(ResultCode.NG.getCode()));
        }

        /**
         * 社員削除
         *
         * @param request リクエスト
         * @return ResponseEntity ResultResponse
         */
        @DeleteMapping("/delete")
        public ResponseEntity<ResultResponse> delete(
                        @RequestBody EmployeeRequest request) {
                return ResponseEntity.ok(
                                this.employeeService.delete(new EmployeeDto(request))
                                                ? new ResultResponse(ResultCode.OK.getCode())
                                                : new ResultResponse(ResultCode.NG.getCode()));
        }
}
