import java.util.ArrayList;

class a01 {
    public static void main(String args[]) {
	ArrayList<String> array = new ArrayList<String>();

	array.add("0.日本");
	array.add("1.ブラジル");
	array.add("2.イングランド");
	array.add("3.ポルトガル");
	array.add("4.フランス");

	for (int i = 0; i < array.size(); i++) {
	    String country = array.get(i);
	    System.out.println(country);
	}

	System.out.println("¥r¥n2.イングランドを　2.イタリアへ置き換えます¥r¥n");

	array.set(2, "入れ替えた国　 2.イタリア"); // 指定したインデックス番号に格納されている要素を新しい要素に置き換える

	for (int i = 0; i < array.size(); i++) {
	    System.out.println("country :" + i);
	    String country = array.get(i);
	    System.out.println(country);
	}
    }
}