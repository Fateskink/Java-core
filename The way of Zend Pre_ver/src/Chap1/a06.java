package Chap1;

public class a06 {
	public static void main(String[] args) {
	int no1 = 20;
	int no2 = 10;
	int no3 = 15;
	boolean result=false;
	result = (no1 > no2) && (no2> no3);
	System.out.println(no1 + ">"+ no2 +" & "+ no2 + ">"+ no3 +" is "+ result);
	result = (no1 > no2) && (no2> no3);
	System.out.println(no1 + ">"+ no2 +" & "+ no2 + ">"+ no3 +" is "+ result);
	result = (no2 >no1 && no3 <no2);
	System.out.println(no2+">"+ no1 +" is "+ result);
	
}
}
