class a4 {
    public static void main(String args[]) {

	for (int num = 2; num < 6; num++) {
	    System.out.println("num = " + num);

	    // におけるラベルは処理
	    switch (num) {
	    case 1:
	    case 2:
		System.out.println("不満あり");
		break;
	    case 3:
		System.out.println("どちらでもない");
		break;
	    case 4:
	    case 5:
		System.out.println("満足している");
	    }
	}
    }

}