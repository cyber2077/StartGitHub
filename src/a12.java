// equalsで文字列の完全一致を判定
public class a12 {
    public static void main(String[] args) throws Exception {

	// String型を宣言
	String str = "appleorangemelon";

	// equalsで文字列の完全一致を確認
	if (str.equals("appleorangemelon")) { // equalsメソッドでできることは、あくまで文字列全体の完全一致です
	    System.out.println(str + " matched");
	}
    }
}