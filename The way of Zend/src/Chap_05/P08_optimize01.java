package Chap_05;

public class P08_optimize01 {
	// Chuỗi chuẩn hóa dạng 1
	public static void main(String[] args) {
		study001();
//	study002();
	}

//chuỗi cơ bản
//ko có khoảng trắng ở đầu và cuối chuỗi
//giữa các từ chỉ có 1 khoảng trắng
//Ký tự đầu tiên ở dạng in hoa
//Các ký tự còn lại dạng chữ thường
//kết thúc chuỗi bằng 1 dấu "."

	private static void study001() {
		String str = "  " + "fAte is  verY vEry    HanDsome ." + "   ";
		System.out.println(str.length());
		// không có khoảng trắng ở đầu và cuối chuỗi
		str = str.trim();
		System.out.println(str.length());
		System.out.println(str);
		// length đã rút hết khoảng cách ở 2 đầu chuỗi

		// Giữa các khoảng trắng chỉ có 1 dấu cách duy nhất
		str = str.replaceAll("\\s+", " ");
		str = str.replaceAll("\\s+\\.", ".");
		System.out.println(str);

		// Ký tự đầu tiên ở dạng in hoa
		// Các ký tự còn lại dạng chữ thường
		String first = str.substring(0, 1).toUpperCase();
		String end = str.substring(1).toLowerCase();
		str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
		// str = first + end;
		System.out.println(str);
		if (str.charAt(str.length() - 1) != '.')
			str = str + ".";
		// Các ký tự đầu tiên là chữ in hoa
		String[] strarr = str.split(" ");
		StringBuilder strResult = new StringBuilder();
//		for (String elm : strarr) {
//			System.out.println(elm);
//			String strTrm = elm.substring(0, 1).toUpperCase() + elm.substring(1).toLowerCase();
//			// strResult += strTrm + " ";
//			strResult.append(strTrm).append(" ");
//		}
		for (int i = 0; i < strarr.length; i++) {
			String strTrm = strarr[i].substring(0, 1).toUpperCase() + strarr[i].substring(1).toLowerCase();
//			if(i == strarr.length - 1) {
//				strResult.append(strTrm);
//			}else {
//				strResult.append(strTrm).append(" ");
//			}
			// Optimize
			strResult.append(strTrm);
			if (i != strarr.length - 1)
				strResult.append(" ");
		}
		System.out.println(strResult);
	}
}
