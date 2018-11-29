class a3 {
    public static void main(String args[]) {

	outside: for (int i = 1; i < 10; i++) { // i = 1～10

	    for (int j = 1; j < 10; j++) { // j = 1～10

		if (i * j > 81) {
		    break outside;
		}

		System.out.println("外のfor1(i): " + i + " - " + "内のfor2(j): " + j + " = " + "IF文(i*j)：  " + (i * j));
	    }
	}
    }
}