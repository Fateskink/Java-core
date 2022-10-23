package Chap_05;

import java.util.Scanner;

public class P05_check_input_data {
	public static void main(String[] args) {
//		study001();
//		study002();
//		study003();
		study004();
//	study005();
	}

//Kiểm tra munber
//Dữ liệu đầu vào phải từ (0-99)
	private static void study001() {
		boolean flag = false;
		String input = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Input : ");
			input = sc.nextLine();
			// "\d" là biểu thức của phần tử số
			// {1,2} là số lần xuất hiện của \d
			if (input.matches("\\d{1,2}") == true) {
				System.out.println("Dữ liệu hợp lệ");
				flag = true;
			} else {
				System.out.println("Dữ liệu không hợp lệ");
			}
		} while (flag = false);
		sc.close();
	}

	// Kiểm tra Id hợp lệ
	// Id có định dạng xxx-yyy
	// xxx là [A-z]
	// yyy là [2-8]
	// ^[A-z]{3}-[2-8]{3}$
	private static void study002() {
		boolean flag2 = false;
		String input2 = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Id : ");
			input2 = sc.nextLine();
			if (input2.matches("^[A-z]{3}-[2-8]{3}$") == true) {
				System.out.println("Id hợp lệ");
				flag2 = true;
			} else {
				flag2 = false;
				System.out.println("Id không hợp lệ");
			}
		} while (flag2 = false);
		sc.close();
	}

// Kiểm tra User name hợp lệ
	private static void study003() {
		boolean flag3 = false;
		String input3 = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nanme: ");
			input3 = sc.nextLine();
			if (input3.matches("[A-z_][\\w\\.]{4,31}") == true) {
				System.out.println("Tên hợp lệ");
				flag3 = true;
			} else {
				System.out.println("Tên không hợp lệ");
			}
		} while (flag3 = false);
		sc.close();
	}

	private static void study004() {
		boolean flag4 = false;
		String input4 = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("website: ");
			input4 = sc.nextLine();
			if (input4.matches("(https?://(www\\.)?|(www\\.))[\\w\\-]{3,30}(\\.[a-z]{2,4}){1,2}") == true) {
				// (https?:\/\/(www\.)?|(www\.))[\w-]{3,30}(\.[A-z]{2,4}){1,2}
				System.out.println("Trang web hợp lệ");
				flag4 = true;
			} else {
				System.out.println("Trang web không hợp lệ");
			}
		} while (flag4 = false);
	}
}
