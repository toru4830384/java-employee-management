package jp.co.hjn.merryapi.common.enums;

/**
 * 結果コード
 *
 */
public enum ResultCode {

    /** 成功 */
    OK(0),
    /** 失敗 */
    NG(9),;

    /** コード */
    int code;

    /** コンストラクタ */
    ResultCode(int code) {
        this.code = code;
    }

    /** コード取得 */
    public int getCode() {
        return this.code;
    }
}
