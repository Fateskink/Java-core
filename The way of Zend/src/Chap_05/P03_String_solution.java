package Chap_05;

public class P03_String_solution {
	public static void main(String[] args) {
//		study001();
//		study002();
//		study003();
//		study004();
//		study005();
		study006();
	}

	// length - trả về độ dài chuỗi
	private static void study001() {
		String str = "Java";
		System.out.printf("Chiều dài chuỗi %s có độ dài: %d", str, str.length());

	}

	// charAt
	// lấy ra ký tự nằm ở vị trí index trong chuỗi
	private static void study002() {
		String str02 = "Fateskink";
		System.out.println("Phần tử ở vị trí đầu tiên: " + str02.charAt(0));
		System.out.println("Phần tử ở vị trí thứ 6: " + str02.charAt(6));
		System.out.println("Phần tử ở vị trí cuối cùng: " + str02.charAt(str02.length() - 1));
	}

	// toLowerCase - chuyển sang chữ thường
	private static void study003() {
		String str03 = "Fateskink";
		System.out.printf("Chuỗi %s chuyển về %s", str03, str03.toLowerCase());
	}

	// toUpperCase - chuyển sang chữ in hoa
	private static void study004() {
		String str04 = "Fateskink";
		System.out.printf("Chuỗi %s chuyển về %s", str04, str04.toUpperCase());

	}

	// trim loại bỏ khoảng chống 2 bên chuỗi
	private static void study005() {
		String str05 = "Fateskink";
		String strtrim = "    " + str05 + "    ";
		System.out.println("String's length: " + strtrim.length());
		strtrim = strtrim.trim();
		System.out.println("String after trim: " + strtrim);
		System.out.println("String's length: " + strtrim.length());
	}

	// subString trích xuất chuỗi con
	private static void study006() {
		String str06 = "Fateskink";
System.out.println("string từ vị trí:"+ str06.substring(5));
System.out.println("string từ vị trí:"+ str06.substring(4, 9));
	}
}
