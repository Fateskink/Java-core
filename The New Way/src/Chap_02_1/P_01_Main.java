package Chap_02_1;

public class P_01_Main {
	public static void main(String[] args) {
		/*
		 * P_02_Counter count01 = new P_02_Counter(); P_02_Counter count02 = new
		 * P_02_Counter(); P_02_Counter count03 = new P_02_Counter(); //
		 * count01.showCount(); // count02.showCount(); // count03.showCount();
		 * P_02_Counter.showCount(); //System.out.println(P_02_Counter.count);
		 */

		P_03_Fraction FractionA = new P_03_Fraction(1, 4);
		P_03_Fraction FractionB = new P_03_Fraction(3, 9);
		System.out.println(FractionA.print());
		FractionA.normalize();
		System.out.println(FractionA.print());
		
		//FractionB.UCLN(4,8);
		/*
		 * if (FractionA.checkNomalize() == true) { System.out.println(FractionA.print()
		 * + "ở dạng tối dản");} else { System.out.println(FractionA.print() +
		 * " không ở dạng tối dản"); }
		 */
		//System.out.println(FractionA.print());
		//System.out.println(FractionB.print());
	}
}