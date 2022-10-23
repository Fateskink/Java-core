package Chap_05;

public class P01_String {
	public static void main(String[] args) {
		// study001();
		// study002();
		// study003();
		// study004();
		//study005();
		study006();
	}

//Khởi tạo đối tượng chuỗi
	private static void study001() {
//case1
		String st1 = "Java is not difficult";
		// case2
		String st2 = new String();
		st2 = "Java is not difficult";
		// case3
		String st3 = new String("Java is not difficult");
		System.out.println(st3);
	}

//Nối chuỗi
	private static void study002() {
		String st21 = "Java";
		String st22 = "is not difficult";
		String st23 = st21 + " " + st22;
		String st24 = st21.concat(" ").concat(st22);
//case1
		System.out.println(st21 + " " + st22);
//		||	System.out.println(st23);
//case2
		System.out.println(st21.concat(" ").concat(st22));
//		|| System.out.println(st24);	
	}

//CHuyển đổi chuỗi số thành giá trị số		
	private static void study003() {
		String st31 = "1900";
		String st32 = st31 + 4;
		// System.out.println(st31 + st32);
		// parse >> Phân tích cú pháp >> Integer >> st31
		int number = Integer.parseInt(st31);
		System.out.println(number + 4);
	}

//So sánh chuỗi
	// toán tử "==" sẽ so sánh vùng nhớ của biến
	private static void study004() {
		String st41 = "Java"; // st41 có vùng nhớ example là a1234
		String st42 = "Java"; // st42 có vùng nhớ example là a1234 = st41
		String st43 = "JAVA"; // st43 có vùng nhớ example là a5678 != st41
		String st44 = new String("Java"); // st43 được tạo vùng nhớ mới example là b9876 != st41
		if (st41 == st42) {
			System.out.println("Equal");
		} else
			System.out.println("Not equal");
	}

//So sánh chuỗi sử dụng equal và equalsIgnoreCase
	// equal >> So sánh phân biệt chữ hoa chữ thường
	// equalsIgnoreCase >>So sánh không phân biệt chữ hoa chữ thường
	private static void study005() {
		String st51 = "FATE	";
		String st52 = "fate";
		System.out.println("So sánh phân biệt chữ hoa chữ thường: " + st51.equals(st52));
		System.out.println("So sánh không phân biệt chữ hoa chữ thường: " + st51.equalsIgnoreCase(st52));
	}

//Sự dư thừa vùng nhớ
	//String Builder
	private static void study006() {

	}
}
