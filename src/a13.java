//コレクション名(Listなどの変数名).forEach(引数 -> 繰り返し行う処理(引数))
//list.forEach(s -> System.out.println(s))
// forEachメソッドに出てくる「->」はラムダ式の文法

// ListでforEachメソッドを使う方法
// Listのループ処理でforEachメソッドを使う方法を解説
// Listのすべての要素を取得する方法を、拡張for文とforEachメソッドを比較したサンプルコードで確認してみましょう

import java.util.ArrayList;
import java.util.List;

public class a13 {

    public static void main(String[] args) {

	List<String> list = new ArrayList<>();
	list.add("サ");
	list.add("ム");
	list.add("ラ");
	list.add("イ");

	// 拡張for文
	System.out.println("拡張for文の場合");
	for (String s : list) {
	    System.out.println(s);
	}

	// forEachメソッド
	System.out.println("forEachメソッドの場合");
	list.forEach(s -> System.out.println(s));
    }
}