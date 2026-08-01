# 社員管理システム API

## 概要

社内統合システムのうち社員を管理するためのシステムの API です。

## 環境

- java

  openjdk 17.0.7

- db

  mysql 8.0.33

## 準備

### DB

ローカルで動かすために以下 SQL ファイルを実行してください。

- db/init/create_db.sql
- db/init/create_table.sql
- db/init/init_employee.sql

### テストツール

Postman をインストールして使用しましょう。

https://qiita.com/ponsuke0531/items/03483449ea0df505a540

## 機能

### 社員関連

#### 取得

##### 説明

社員情報を取得する。

##### URL

employee/find

##### IF

HTTP メソッド：GET

【Request】

- Query パラメーター

| No  | 項目名 | 説明           | 型   | 桁数 |
| --- | ------ | -------------- | ---- | ---- |
| 1   | ids    | 社員 ID リスト | なし | なし |

- Body

  なし

【Response】

| No  | 階層 | 項目名           | 説明           | 型          |
| --- | ---- | ---------------- | -------------- | ----------- |
| 1   | 1    | employeeList     | 社員リスト     | Object 配列 |
| 2   | 2    | nameFirst        | 氏名（名）     | 文字列      |
| 3   | 2    | nameLast         | 氏名（姓）     | 文字列      |
| 4   | 2    | nameFirstKana    | 氏名カナ（名） | 文字列      |
| 5   | 2    | nameLastKana     | 氏名カナ（姓） | 文字列      |
| 6   | 2    | employeePosition | 役職           | 文字列      |
| 7   | 2    | systemRole       | システムロール | 文字列      |
| 8   | 2    | postalCode       | 郵便番号       | 文字列      |
| 9   | 2    | prefectures      | 都道府県       | 文字列      |
| 10  | 2    | municipalities   | 区             | 文字列      |
| 11  | 2    | address1         | 市町村         | 文字列      |
| 12  | 2    | address2         | 番地           | 文字列      |
| 13  | 2    | phoneNumber      | 電話番号       | 文字列      |
| 14  | 2    | birthday         | 誕生日         | 文字列      |
| 15  | 2    | sex              | 性別           | 文字列      |

##### テスト方法

例）ID が 5、6、7 の社員取得

`http://localhost:8080/employee/find?ids=5&ids=6&ids=7`

Response

```json
{
  "employeeList": [
    {
      "nameFirst": "テスト名前１",
      "nameLast": "テスト苗字１",
      "nameFirstKana": "テストナマエ１",
      "nameLastKana": "テストミョウジ１",
      "employeePosition": null,
      "systemRole": null,
      "postalCode": "100-0001",
      "prefectures": "東京都",
      "municipalities": "千代田区",
      "address1": "テスト町",
      "address2": "テスト1-11-1",
      "phoneNumber": null,
      "birthday": null,
      "sex": null
    },
    {
      "nameFirst": "テスト名前２",
      "nameLast": "テスト苗字２",
      "nameFirstKana": "テストナマエ２",
      "nameLastKana": "テストミョウジ２",
      "employeePosition": null,
      "systemRole": null,
      "postalCode": "100-0002",
      "prefectures": "東京都",
      "municipalities": "千代田区",
      "address1": "テスト町",
      "address2": "テスト1-11-2",
      "phoneNumber": null,
      "birthday": null,
      "sex": null
    },
    {
      "nameFirst": "テスト名前３",
      "nameLast": "テスト苗字３",
      "nameFirstKana": "テストナマエ３",
      "nameLastKana": "テストミョウジ３",
      "employeePosition": null,
      "systemRole": null,
      "postalCode": "100-0003",
      "prefectures": "東京都",
      "municipalities": "千代田区",
      "address1": "テスト町",
      "address2": "テスト1-11-3",
      "phoneNumber": null,
      "birthday": null,
      "sex": null
    }
  ]
}
```

#### 作成

##### 説明

社員情報を登録する。

##### URL

employee/create

##### IF

HTTP メソッド：POST

【Request】

- Query パラメーター

なし

- Body

| No  | 階層 | 項目名           | 説明           | 型     | 桁数 | 制限       |
| --- | ---- | ---------------- | -------------- | ------ | ---- | ---------- |
| 1   | 1    | nameFirst        | 氏名（名）     | 文字列 | 64   | なし       |
| 2   | 1    | nameLast         | 氏名（姓）     | 文字列 | 64   | なし       |
| 3   | 1    | nameFirstKana    | 氏名カナ（名） | 文字列 | 64   | なし       |
| 4   | 1    | nameLastKana     | 氏名カナ（姓） | 文字列 | 64   | なし       |
| 5   | 1    | employeePosition | 役職           | 文字列 | 2    | なし       |
| 6   | 1    | systemRole       | システムロール | 文字列 | 2    | なし       |
| 7   | 1    | postalCode       | 郵便番号       | 文字列 | 8    | なし       |
| 8   | 1    | prefectures      | 都道府県       | 文字列 | 16   | なし       |
| 9   | 1    | municipalities   | 区             | 文字列 | 64   | なし       |
| 10  | 1    | address1         | 市町村         | 文字列 | 64   | なし       |
| 11  | 1    | address2         | 番地           | 文字列 | 64   | なし       |
| 12  | 1    | phoneNumber      | 電話番号       | 文字列 | 16   | なし       |
| 13  | 1    | birthday         | 誕生日         | 文字列 | なし | yyyy/MM/dd |
| 14  | 1    | sex              | 性別           | 文字列 | 2    | なし       |

【Response】

| No  | 階層 | 項目名     | 説明            | 型     |
| --- | ---- | ---------- | --------------- | ------ |
| 1   | 1    | resultCode | 0:成功、9：失敗 | 文字列 |

##### テスト方法

`http://localhost:8080/employee/create`

Request

例）

```json
{
  "nameFirst": "TestFirst",
  "nameLast": "TestLast",
  "nameFirstKana": "テストファースト",
  "nameLastKana": "テストラスト",
  "employeePosition": "1",
  "systemRole": "1",
  "postalCode": "100-0000",
  "prefectures": "東京都",
  "municipalities": "千代田区",
  "address1": "テスト1-1-1",
  "address2": "テストマンション101",
  "phoneNumber": "080-0000-0000",
  "birthday": "2000/01/01",
  "sex": "1"
}
```

Response

```json
{
  "resultCode": 0
}
```

### 更新

##### 説明

社員情報を更新する。

##### URL

employee/update

##### IF

HTTP メソッド：PUT

【Request】

- Query パラメーター

なし

- Body

| No  | 階層 | 項目名           | 説明           | 型     | 桁数 | 制限       |
| --- | ---- | ---------------- | -------------- | ------ | ---- | ---------- |
| 1   | 1    | id               | 社員 ID        | 文字列 | 64   | なし       |
| 2   | 1    | nameFirst        | 氏名（名）     | 文字列 | 64   | なし       |
| 3   | 1    | nameLast         | 氏名（姓）     | 文字列 | 64   | なし       |
| 4   | 1    | nameFirstKana    | 氏名カナ（名） | 文字列 | 64   | なし       |
| 5   | 1    | nameLastKana     | 氏名カナ（姓） | 文字列 | 64   | なし       |
| 6   | 1    | employeePosition | 役職           | 文字列 | 2    | なし       |
| 7   | 1    | systemRole       | システムロール | 文字列 | 2    | なし       |
| 8   | 1    | postalCode       | 郵便番号       | 文字列 | 8    | なし       |
| 9   | 1    | prefectures      | 都道府県       | 文字列 | 16   | なし       |
| 10  | 1    | municipalities   | 区             | 文字列 | 64   | なし       |
| 11  | 1    | address1         | 市町村         | 文字列 | 64   | なし       |
| 12  | 1    | address2         | 番地           | 文字列 | 64   | なし       |
| 13  | 1    | phoneNumber      | 電話番号       | 文字列 | 16   | なし       |
| 14  | 1    | birthday         | 誕生日         | 文字列 | なし | yyyy/MM/dd |
| 15  | 1    | sex              | 性別           | 文字列 | 2    | なし       |

【Response】

| No  | 階層 | 項目名     | 説明            | 型     |
| --- | ---- | ---------- | --------------- | ------ |
| 1   | 1    | resultCode | 0:成功、9：失敗 | 文字列 |

##### テスト方法

`http://localhost:8080/employee/update`

Request

例）

```json
{
  "id": "1",
  "nameFirst": "TestFirst",
  "nameLast": "TestLast",
  "nameFirstKana": "テストファースト",
  "nameLastKana": "テストラスト",
  "employeePosition": "1",
  "systemRole": "1",
  "postalCode": "100-0000",
  "prefectures": "東京都",
  "municipalities": "千代田区",
  "address1": "テスト1-1-1",
  "address2": "テストマンション101",
  "phoneNumber": "080-0000-0000",
  "birthday": "2000/01/01",
  "sex": "1"
}
```

Response

```json
{
  "resultCode": 0
}
```

### 削除

##### 説明

社員情報を論理削除する。

##### URL

employee/delete

##### IF

HTTP メソッド：DELETE

【Request】

- Query パラメーター

なし

- Body

| No  | 階層 | 項目名 | 説明    | 型     | 桁数 | 制限 |
| --- | ---- | ------ | ------- | ------ | ---- | ---- |
| 1   | 1    | id     | 社員 ID | 文字列 | 64   | なし |

【Response】

| No  | 階層 | 項目名     | 説明            | 型     |
| --- | ---- | ---------- | --------------- | ------ |
| 1   | 1    | resultCode | 0:成功、9：失敗 | 文字列 |

##### テスト方法

`http://localhost:8080/employee/delete`

Request

例）

```json
{
  "id": "1"
}
```

Response

```json
{
  "resultCode": 0
}
```
