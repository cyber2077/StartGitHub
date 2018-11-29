import java.util.ArrayList;

class a02 {
    public static void main(String args[]) {
	ArrayList<String> array = new ArrayList<String>();

	array.add("日本");
	array.add("ブラジル");
	array.add("イングランド");
	array.add("ポルトガル");
	array.add("フランス");

	System.out.println("登録データ数:" + array.size());

	for (int i = 0; i < array.size(); i++) { // 格納されている要素数 取得 .size();
	    String country = array.get(i); // 格納されている要素からi番目 取得 .get(i)
	    System.out.println(country);
	}
    }
}