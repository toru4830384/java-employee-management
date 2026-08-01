package jp.co.hjn.merryapi.common.enums;

/**
 * 役職
 *
 */
public enum EmployeePosition {

    /** その他 */
    OTHER(0, "その他"),
    /** 研修 */
    TRAINING(1, "研修"),
    /** 研修卒業 */
    TRAINING_GRADUATION(2, "研修卒業"),
    /** 一般 */
    GENERAL(3, "一般"),
    /** 準主任 */
    ASSOCIATE_CHIEF(4, "準主任"),
    /** 主任 */
    CHIEF(5, "主任"),
    /** 係長 */
    SUBSECTION_MANAGER(6, "係長"),
    /** 課長 */
    UNIT_MANAGER(7, "課長"),
    /** 部長 */
    MANAGER(8, "部長"),
    /** 社長 */
    PRESIDENT(9, "社長"),
    ;

    /** コード */
    int code;
    /** 名称 */
    String name;

    /** コンストラクタ */
    EmployeePosition(int code, String name) {
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
    public static EmployeePosition getObject(int code) {
        for (EmployeePosition e : EmployeePosition.values()) {
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
    public static EmployeePosition getObject(String name) {
        for (EmployeePosition e : EmployeePosition.values()) {
            if (e.getName().equals(name))
                return e;
        }
        return null;
    }
}
