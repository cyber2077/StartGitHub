
// どこに 配列の値があるかを 調べたい場合は  indexOf  を使うことで場所を知ることができ
import java.util.ArrayList;
import java.util.List;

public class a8 {

    public static void main(String[] args) {
	List<Integer> foo = new ArrayList<Integer>();
	foo.add(10);
	foo.add(20);
	foo.add(30);

	System.out.println("10のインデックスは" + foo.indexOf(10) + "です");
	System.out.println("20のインデックスは" + foo.indexOf(20) + "です");
	System.out.println("30のインデックスは" + foo.indexOf(30) + "です");
	System.out.println("40のインデックスは" + foo.indexOf(40) + "です"); // List内に存在しない値を引数に渡すと-1が返ってきます
    }

}