package Chap_02_2;

public class P01_Main {
//Tổng 2 phân số
	public static void main(String[] args) {
		P02_2_Fraction fractionA = new P02_2_Fraction(1, 3);
		P02_2_Fraction fractionB = new P02_2_Fraction(2, 3);
		P02_2_Fraction fractionC = new P02_2_Fraction(fractionA, fractionB, "+");
		System.out.printf("%s + %s = %s", fractionA.print(), fractionB.print(), fractionC.print());
	}
}
