package jp.co.hjn.merryapi.application.controller.common.dto;

import java.util.List;
import lombok.Data;

/**
 * 結果レスポンス
 *
 */
@Data
public class ResultResponse {
    /** 社員DTOリスト */
    private Integer resultCode;
    
    /** エラーメッセージ */
    private List<String> errorMessages;

    /**
     * コンストラクタ
     *
     * @param resultCode 結果コード
     */
    public ResultResponse(Integer resultCode) {
        this.resultCode = resultCode;
    }
    
    /**
     * コンストラクタ
     * 
     * @param resultCode 結果コード
     * @param errorMessazges エラーコード
     */
    public ResultResponse(Integer resultCode, List<String> errorMessages) {
    	this.resultCode = resultCode;
    	this.errorMessages = errorMessages;
    }
}
