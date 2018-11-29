// 前方一致と後方一致の検索
// startsWithで前方一致
// 前方一致で検索するには、startsWithメソッドを使います
public class a10 {

    public static void main(String[] args) {

	String str = "appleorangemelon";

	if (str.startsWith("apple")) {
	    System.out.println("前方一致しました");
	} else {
	    System.out.println("前方一致しませんでした");
	}
    }

}