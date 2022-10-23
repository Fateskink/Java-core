package Chap_05;

import java.util.Scanner;
import java.util.StringTokenizer;

public class P07_dissesion {
	public static void main(String[] args) {
		// Scanner
//		study001();
//		study002();
//		study003();
//		study004();
//		study005();
		study006();
	}

	// delimiter là khoảng trắng
	private static void study001() {
		String str = "Fate is very very handsome";
		Scanner sc = new Scanner(str);
		while (sc.hasNext()) {
			String token = sc.next();
			System.out.println(token);
		}
//System.out.println(str);
		sc.close();
	}

	// delimiter là dấu "-"
	private static void study002() {
		String str2 = "Fate-is_very-handsome";
		Scanner sc = new Scanner(str2);
		sc.useDelimiter("-");
		while (sc.hasNext()) {
			String token = sc.next();
			System.out.println(token);
		}
	}

	// delimiter là nhiều dấu (" ", "-", "_")
	private static void study003() {
		String str3 = "Fate is_very-handsome";
		Scanner sc = new Scanner(str3);
		sc.useDelimiter("[- _]");
		while (sc.hasNext()) {
			String token = sc.next();
			System.out.println(token);
		}
	}

	// delimiter là số
	private static void study004() {
		String str4 = "Fate 14 is 6482   very 982 handsome";
		Scanner sc = new Scanner(str4);
		sc.useDelimiter("\\s+\\d+\\s+");
		while (sc.hasNext()) {
			String token = sc.next();
			System.out.println(token);
		}
	}

	// split - cắt chuỗi >> delimiter hỗn hợp + nhiều String
	private static void study005() {
		String str51 = "Fate 14 is 6482   very 982 handsome";
		String str52 = "Fate is very handsome";
		String str53 = "Fate-is-very-handsome";
		String str54 = "Fate_is_very_handsome";
//		Scanner sc = new Scanner(str4);
		String[] arrstr = str52.split(" ");
		System.out.println(arrstr.length);
//		sc.useDelimiter("\\s+\\d+\\s+");
//		while (sc.hasNext()) {
//			String token = sc.next();
//			System.out.println(token);
		for (String elm : arrstr) {
			System.out.println(elm);
		}
	}

	//String token
	private static void study006() {
		String str61 = "Fate 14 is 6482   very 982 handsome";
		String str62 = "Fate is very handsome";
		String str63 = "Fate-is-very-handsome";
		String str64 = "Fate_is_very_handsome";
		
		StringTokenizer arrtokenizer = new StringTokenizer(str62);
		while(arrtokenizer.hasMoreTokens()) {
			String token = arrtokenizer.nextToken();
			System.out.println(token);
		}
		
	}
}