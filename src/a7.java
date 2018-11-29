
// containsメソッド を使うことで配列内に 値が含まれているかどうかを調べることができます
import java.util.ArrayList;
import java.util.List;

public class a7 {

    public static void main(String[] args) {
	List<Integer> foo = new ArrayList<Integer>();
	foo.add(10);
	foo.add(20);
	foo.add(30);

	if (foo.contains(10)) {
	    System.out.println("配列内に値が存在しています。");
	}
    }

}