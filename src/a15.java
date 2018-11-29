// MapでforEachメソッドを使う方法

// Mapのキー(key)と値(value)をforEachメソッドで取得する方法を解説

// forEachメソッドでMapのキー(key)と値(value)を表示する方法を次のサンプルコードで確認してみましょう

import java.util.HashMap;
import java.util.Map;

public class a15 {

    public static void main(String[] args) {

	Map<String, String> map = new HashMap<>();
	map.put("samurai", "サムライ");
	map.put("engineer", "エンジニア");
	map.put("juku", "塾");

	map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}

// forEachメソッドでMapのキー(key)と値(value)を表示することができました