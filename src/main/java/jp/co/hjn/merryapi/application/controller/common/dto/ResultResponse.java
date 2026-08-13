package jp.co.hjn.merryapi.application.controller.common.dto;

import lombok.Data;

/**
 * 結果レスポンス
 *
 */
@Data
public class ResultResponse {
    /** 社員DTOリスト */
    private Integer resultCode;

    /**
     * コンストラクタ
     *
     * @param resultCode 結果コード
     */
    public ResultResponse(Integer resultCode) {
        this.resultCode = resultCode;
    }
}
