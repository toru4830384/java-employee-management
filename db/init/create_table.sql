/* create all table */
CREATE TABLE IF NOT EXISTS merry_db.employee (
      id                MEDIUMINT   NOT NULL    AUTO_INCREMENT
    , name_first        VARCHAR(64)
    , name_last         VARCHAR(64)
    , name_first_kana   VARCHAR(64)
    , name_last_kana    VARCHAR(64)
    , employee_position INT
    , system_role       INT
    , postal_code       VARCHAR(8)
    , prefectures       VARCHAR(16)
    , municipalities    VARCHAR(64)
    , address1          VARCHAR(64)
    , address2          VARCHAR(64)
    , phone_number      VARCHAR(16)
    , birthday          DATETIME
    , sex               INT
    , created_at        DATETIME    NOT NULL    DEFAULT CURRENT_TIMESTAMP
    , updated_at        DATETIME    NOT NULL    DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
    , deleted_at        DATETIME
    , PRIMARY KEY (id)
);