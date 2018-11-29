// 配列でforEachメソッドを使う方法
// 配列でforEachメソッドを使う場合は”Stream API”を使う必要があります

// Arrays.stream(配列の変数名).forEach(引数 -> 繰り返し行う処理(引数));

import java.util.Arrays;

public class a14 {

    public static void main(String[] args) {

	String[] strArray = { "サ", "ム", "ラ", "イ" };
	Arrays.stream(strArray).forEach(s -> System.out.println(s));
    }
}