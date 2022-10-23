package Chap1;

public class switc {
	public static void main(String[] args) {
	int number = 90;
	String result = "";
	switch (number) {
			case 2:  result ="Thứ hai";
		break;
			case 3: result ="Thứ ba";
		break;
			case 4: result ="Thứ tư";
		break;
			case 5: result ="Thứ năm";
		break;
			case 6: result ="Thứ sáu";
		break;
			case 7: result ="Thứ bảy";
		break;
		//case 8: System.out.println("Chủ nhật");
		//break;
			case 1:
			case 8: result ="Chủ nhật";
		break;
			default:  result ="Không hợp lệ";
		break;}
	System.out.println(result);
}
}
