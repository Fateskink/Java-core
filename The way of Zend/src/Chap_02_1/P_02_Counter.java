package Chap_02_1;

public class P_02_Counter {
	public static int count = 0;
	public static String college = "UTT";

	public P_02_Counter() {
		count++;
	}

	public int getCount() {
		return count;
	}

	public static void showCount() {
		System.out.println("Count: " + count);
		System.out.println("College: " + college);

	}

}
