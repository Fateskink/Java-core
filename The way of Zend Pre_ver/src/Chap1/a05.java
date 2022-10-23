package Chap1;

public class a05 {
public static void main(String[] args) {
	int number01 = 15;
	int number02 = 31;
	boolean result = false;
	result = number01 > number02;
	System.out.println(number01 + ">" + number02 +  " is "  +  result);
	result = number01 >= number02;
	System.out.println(number01 + ">=" + number02 +  " is "  +  result);
	result = number01 <= number02;
	System.out.println(number01 + "<=" + number02 +  " is "  +  result);
//	int cros =number01+number02;
//	number01 +=10;
//	System.out.println(number01 + "+" + number02 +"=" + cros);	
//	System.out.println(number01);
	result = number01 == number02;
	System.out.println(number01 + "==" + number02 +  " is "  +  result);
	result = number01 != number02;
	System.out.println(number01 + "!=" + number02 +  " is "  +  result);
}
}
