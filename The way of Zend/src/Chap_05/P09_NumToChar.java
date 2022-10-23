package Chap_05;

import java.util.Scanner;

public class P09_NumToChar {
	public static void main(String[] args) {
		boolean flag = false;
		String input = "";
		Scanner sc = new Scanner(System.in);
		String result = "";
		String str000 = "";
		String str00 = "";
		String str0 = "";
		String[] dictionary = { "không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };
//		int digit000, digit00, digit0;
		do {
			System.out.println("Input : ");
			input = sc.nextLine();
			if (input.matches("\\d{3}") == true) {
				// 01 - lấy số
				int digit000 = Integer.parseInt(input.substring(0, 1));
				int digit00 = Integer.parseInt(input.substring(1, 2));
				int digit0 = Integer.parseInt(input.substring(2));
				// 02 - Hàng trăm
				str000 = dictionary[digit000] + " trăm";
				// 03 - Hàng chục
				str00 = " " + dictionary[digit00] + " mươi";
				if (digit00 == 0)
					str00 = " linh";
				if (digit00 == 1)
					str00 = " mười";
				// 04 - Hàng đơn vị
				str0 = " " + dictionary[digit0];
				if (digit0 == 1 && digit00 > 1)
					str0 = " mốt";
				if (digit0 == 5 && digit00 > 0)
					str0 = " lăm";
				if (digit0 == 0 && digit00 == 0) {
					str00 = "";
					str0 = "";
				}
				if (digit0 == 0) {
					str0 = "";
				}

//				System.out.println(str000+ str00+ str0);
				result = str000 + str00 + str0;
				System.out.println(result);
				flag = true;
			} else {
				System.out.println("Dữ liệu không hợp lệ");
			}
		} while (flag = false);
		sc.close();
	}
}
