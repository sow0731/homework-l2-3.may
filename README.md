 modify-homework-l2-3.may
# 課題修正

## 修正内容
### 1.
"Main"クラスの"inputRating"に"0~2"以外の数値が入力された場合。"InputMismatchException"をthrowするよう追加修正。

### 2.
"MovieList"クラスにStaticメソッド(Staticイニシャライザ)を作成し、他クラスからListの内容を書き換えられないように修正

# 5月度課題　第2回と第３回分

## 課題内容
### 第２回課題内容
オリジナルのクラスを作成  
for文を使った繰り返し処理を実装  
if文を使った条件分岐処理を実装  

### 第３回課題内容
ListかMapを作成して、その内容をコンソール画面に表示(内容は複数)  
任意のプログラムで例外を起こしてみる　　
　　
## 提出課題の概要　　
映画情報を表示させるコードを書きました

## 提出課題の説明  
*オリジナルのクラス"MovieInfo"を作成し、"title","filmDirector","releaseYear","rating"フィールドを追加  

*"MovieInfo"をList要素の型に使い、Listを作成  

*MainクラスでforEachを使い、Listの一覧を表示、次いでListの要素である"rating"の数値が高い順に一覧表示を並び替え(stream,sortedを使用)  

*"ratingの数値(0,1,2)"を検索条件にし、条件にあったList要素を抽出(stream,filter使用)  
Scannerを使いコンソールに"0,1,2"の数値を入力するよう指示。if文による条件分岐で表示する要素を切り替え。"0,1,2"以外が入力された場合には"try-catch"で例外を出力

### 実行結果
![通常処理](https://user-images.githubusercontent.com/103630732/171875025-f3634eb1-023e-4d4f-b6a3-66ba9d3a2ef5.png)  
  
![例外処理](https://user-images.githubusercontent.com/103630732/171875111-c7623131-5b7d-4933-a80a-a2d5f139315d.png)

