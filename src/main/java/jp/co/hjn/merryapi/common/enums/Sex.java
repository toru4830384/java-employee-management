package jp.co.hjn.merryapi.common.enums;

/**
 * 性別
 *
 */
public enum Sex {

    /** 男性 */
    MAN(1, "男性"),
    /** 女性 */
    WOMAN(2, "女性"),
    /** その他 */
    OTHERS(0, "その他"),;

    /** コード */
    int code;
    /** 名称 */
    String name;

    /** コンストラクタ */
    Sex(int code, String name) {
        this.code = code;
        this.name = name;
    }

    /** コード取得 */
    public int getCode() {
        return this.code;
    }

    /** 名称取得 */
    public String getName() {
        return this.name;
    }

    /**
     * コードと一致するオブジェクト取得
     *
     * @param code コード
     * @return オブジェクト
     */
    public static Sex getObject(int code) {
        for (Sex e : Sex.values()) {
            if (e.getCode() == code)
                return e;
        }
        return null;
    }

    /**
     * Nameと一致するオブジェクト取得
     *
     * @param name Name
     * @return オブジェクト
     */
    public static Sex getObject(String name) {
        for (Sex e : Sex.values()) {
            if (e.getName().equals(name))
                return e;
        }
        return null;
    }
}