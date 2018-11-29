import java.util.ArrayList;

class a16 {
    public static void main(String args[]) {
	ArrayList<String> array = new ArrayList<String>();

	array.add("001");
	array.add("001");
	array.add("001");
	array.add("002");
	array.add("002");
	array.add("002");
	array.add("003");
	array.add("003");

	for (int i = 0; i < array.size(); i++) {
	    String country = array.get(i);
	    System.out.println(country);
	}

	String word = "001";
	int first = array.indexOf(word);

	System.out.println(word + "について検索します");

	if (first != -1) { // 検索結果が0の場合 -1が変えてくる
	    System.out.println("最初のインデックス番号は " + first);
	}

	int last = array.lastIndexOf(word);
	if (last != -1) {
	    System.out.println("最後のインデックス番号は " + last + "　番目です");
	}
    }
}