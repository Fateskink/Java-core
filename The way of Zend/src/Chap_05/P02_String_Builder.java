package Chap_05;

public class P02_String_Builder {
public static void main(String[] args) {
	StringBuilder strBuilderObj = new StringBuilder("Java");
	
	//append >> nối thêm
	strBuilderObj.append("easy");	//Java + easy
	System.out.println(strBuilderObj);
	
	//insert
	//0 1 2 3 4 5 6 7
	//J a v a e a s y
	strBuilderObj.insert(4, " is fucking ");
	System.out.println(strBuilderObj);
	
	//deleteCharAt >> xóa 1 phần tử
	strBuilderObj.deleteCharAt(strBuilderObj.length()-1);
	System.out.println(strBuilderObj);
	
	//Java is fucking easy
	//0123456789
	//delete >> xóa nhiều phần tử
	strBuilderObj.delete(4, 6+1);
	System.out.println(strBuilderObj);
}
}
