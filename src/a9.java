// String型からint型への変換方法(parseInt)
// IntegerクラスのparsIntやvalueOfを使うことでint型に変換が可能です
public class a9 {
    public static void main(String[] args) {

	String hoge = "1"; // String 1
	int num = Integer.parseInt(hoge);
	System.out.println("numに交換された: " + num);
    }
}