// endsWithで後方一致
// 後方一致で検索するには、endsWithメソッドを使います
public class a11 {

    public static void main(String[] args) {

	String str = "appleorangemelon";

	if (str.endsWith("melon")) {
	    System.out.println("後方一致しました");
	} else {
	    System.out.println("後方一致しませんでした");
	}
    }

}