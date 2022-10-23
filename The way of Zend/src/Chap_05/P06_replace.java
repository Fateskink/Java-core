package Chap_05;

public class P06_replace {
public static void main(String[] args) {
//	study001();
//	study002();
	study003();
}
//replace
private static void study001() {
String str = "I'm vary vary handsome";
System.out.println("Input: "+ str);
str = str.replace("a", "e");

System.out.println("Output: "+ str);
}

//repalceAll >> sử dụng được Regular Expression
private static void study002() {
	String str = "I'm v2ary var6y hand7some";
	System.out.println("Input: "+ str);
	str = str.replaceAll("\\d", "");

	System.out.println("Output: "+ str);
	
}

//replaceAll chỉ giữ lại số
private static void study003() {
	String str = "siw4237*^$Ươ-n?,huw423750?<hwuubd4=";
	System.out.println("Input: "+ str);
	str = str.replaceAll("\\D", "");

	System.out.println("Output: "+ str);
	
}
}
