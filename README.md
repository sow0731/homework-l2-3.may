modify-homework-l2-3.may

# 提出した課題について修正が必要な箇所があった為、Pull&Requestを作成

## 修正内容

### 1.) src/Main.javaに"InputMismatchException"をthrowするコードを追加

"src/Main.java"の"inputRating"に"0~2"以外の数値が入力された場合のハンドリングの追加が必要だった為、
"InputMismatchException"をthrowするよう追加修正。

### 2.) src/MovieList.javaにStaticイニシャライザを作成

Listの要素を他クラスで書き換えられる恐れがあった為、
"src/MovieList.java"にStaticメソッド(Staticイニシャライザ)を作成し、他クラスからListの内容を書き換えられないように修正。

### 3.) src/Main.java内のコードのフォーマットを修正

src/Main.java内に記述している等値演算子(==)の前後にスペースがなかった為、Intelli Jの設定から修正。

### 4.) src/Main.java内のコードの冗長化について対策

"MovieList.initMovieList"と記述していた箇所について、
コードが冗長化してしまう為、"List<MovieInfo>"を"movies"で変数化し記述することによって対策。

