package jp.co.hjn.merryapi.application.controller.employee;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;

import jp.co.hjn.merryapi.application.controller.common.dto.ResultResponse;
import jp.co.hjn.merryapi.application.controller.dayoff.dto.DayOffRequest;
import jp.co.hjn.merryapi.application.controller.dayoff.dto.DayOffResponse;
import jp.co.hjn.merryapi.common.enums.ResultCode;
import jp.co.hjn.merryapi.domain.dto.DayOffDto;
import jp.co.hjn.merryapi.domain.service.DayOffService;

/**
 * 休暇コントローラー
 *
 */
@RestController
@RequestMapping("/day-off")
public class DayOffController {

    /** 休暇サービス */
    private DayOffService dayOffService;

    /**
     * コンストラクタ
     *
     * @param dayOffService 休暇サービス
     */
    public DayOffController(DayOffService dayOffService) {
        this.dayOffService = dayOffService;
    }

    /**
     * 休暇取得
     *
     * @param ids IDリスト
     * @return 休暇リスト
     */
    @GetMapping("/find")
    public ResponseEntity<List<DayOffResponse>> find(@RequestParam List<Integer> ids) {
        return ResponseEntity.ok(
                this.dayOffService.find(ids)
                        .stream()
                        .map(dto -> new DayOffResponse(dto))
                        .toList());
    }

    /**
     * 休暇登録
     *
     * @param request リクエスト
     * @return 結果
     */
    @PostMapping("/create")
    public ResponseEntity<ResultResponse> create(
            @RequestBody @Validated DayOffRequest request,
            Errors errors) {

        if (errors.hasErrors()) {
            errors.getAllErrors().stream()
                    .forEach(e -> System.out.println(e.getDefaultMessage()));

            return ResponseEntity.badRequest()
                    .body(new ResultResponse(ResultCode.NG.getCode()));
        }

        return ResponseEntity.ok(
                this.dayOffService.create(new DayOffDto(request))
                        ? new ResultResponse(ResultCode.OK.getCode())
                        : new ResultResponse(ResultCode.NG.getCode()));
    }

    /**
     * 休暇更新
     *
     * @param request リクエスト
     * @return 結果
     */
    @PutMapping("/update")
    public ResponseEntity<ResultResponse> update(
            @RequestBody @Validated DayOffRequest request,
            Errors errors) {

        if (errors.hasErrors()) {
            errors.getAllErrors().stream()
                    .forEach(e -> System.out.println(e.getDefaultMessage()));

            return ResponseEntity.badRequest()
                    .body(new ResultResponse(ResultCode.NG.getCode()));
        }

        return ResponseEntity.ok(
                this.dayOffService.update(new DayOffDto(request))
                        ? new ResultResponse(ResultCode.OK.getCode())
                        : new ResultResponse(ResultCode.NG.getCode()));
    }

    /**
     * 休暇削除
     *
     * @param request リクエスト
     * @return 結果
     */
    @DeleteMapping("/delete")
    public ResponseEntity<ResultResponse> delete(
            @RequestBody DayOffRequest request) {
        return ResponseEntity.ok(
                this.dayOffService.delete(new DayOffDto(request))
                        ? new ResultResponse(ResultCode.OK.getCode())
                        : new ResultResponse(ResultCode.NG.getCode()));
    }
}