package Chap_04;

public class P01_exception {
	public static void main(String[] args) {
//		study001();
//		study002();
//		study003();
//		study004();
//		study005();
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		try {
			myFuntion(2, 2);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//throws và throw
	private static void myFuntion(int num01, int num02) throws ArithmeticException, Exception {
		if (num02 == 0)
			throw new ArithmeticException("Lỗi chia cho 0");
		if (num01 % 2 == 0)
			throw new ArithmeticException("Lỗi chia cho số chẵn");
		System.out.println();
	}

	private static void study002() {
		int arr[] = { 1, 2, 3 };
		System.out.println("Nhận thẻ ATM");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println("Trả thẻ ATM");
	}

//phép chia cho 0 dừng phần tiến trình
	private static void study001() {
		System.out.println("Nhận thẻ ATM");
		System.out.println(5 / 2);
		System.out.println("Trả thẻ ATM");
	}

// thực hiện lệnh try
	private static void study003() {
		int number1 = 5;
		int number2 = 2;
		int arr[] = { 1, 2, 3 };
		System.out.println("Nhận thẻ ATM");
		try {
			System.out.println(number1 / number2);
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Trả thẻ ATM");
	}

//Exception runtime + checked
	private static void study004() {
		int num3 = 5;
		int num4 = 0;
		System.out.println(num3 / num4);

	}

//Finally
	private static void study005() {
		int num5 = 5;
		int num6 = 0;
		System.out.println("Nhận thẻ ATM");
		try {
			System.out.println(num5 / num6);
		} finally {
			System.out.println("Trả thẻ ATM");
		}
	}
}
