package Chap1;

public class a07 {
	public static void main(String[] args) {
	//int no1 = 20;
	int no2 = 10;   //Max number
	//int no4 = 2;
	int no5 = 5;	//Min number
//	int result1 = Math.max(no1, no2);
//	int result2 = Math.max(result1, no4);
//	int result3 = Math.max(result2, no5);
	//double no3 = 0.98;
	int range = (no2-no5)+1;
	  //System.out.println((int)(Math.random()));
	double random = Math.random();
	int randomno = (int)(Math.random()*range+no5);
	  //System.out.println("random number :"+randomno);
		System.out.println("=" +"(" + "(" + no2 + "-" + no5+ ")" + "+" + 1 +")" + random + " + " +no5);
		System.out.println("=" + "(" + (int) (no2-no5) + "+" + 1 +")" + random + " + " +no5);
		System.out.println("=" + (int) (no2-no5+1) + "*" + random + " + " +no5);
		System.out.println("=" + (int) ((no2-no5+1)*random) + " + " + no5);
		System.out.println("=" + (int) (((no2-no5+1)*random) + no5));
		
}
}
