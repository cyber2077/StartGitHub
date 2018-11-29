
// 文字列が”a”のときに continue文 で表示する処理をスキップしているので、”a”以外の文字列が表示されています
// continue文は ループ処理の途中で、残りの処理を スキップして 次のループ処理に移るときに使います
public class a5 {
    public static void main(String[] args) {

	String[] strArray = { "s", "a", "m", "u", "r", "a", "i" };
	String str = "a";

	for (int i = 0; i < strArray.length; i++) {
	    if (strArray[i].equals(str)) {
		System.out.println("i　がstrと同じなので　skipします　：" + i + "番目文字");
		continue; // continue文でループをスキップする
	    }
	    System.out.println(strArray[i]);
	}
    }
}