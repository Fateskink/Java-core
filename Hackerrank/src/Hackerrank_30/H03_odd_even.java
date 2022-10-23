
package Hackerrank_30;

import java.util.Scanner;

public class H03_odd_even {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("give me a number");
		int n = scan.nextInt();
		String as = "";
		scan.nextLine();
		scan.close();
		if (n % 2 == 1) {
			as = "Weird";
		} else {
			if (n >= 2 && n <= 5) {
				as = "not weird";
			} else if (n >= 6 && n <= 20) {
				as = "Weird";
			} else if(n>20 && n<=100) {
				as = "not weird";}
//			} else {
//				as = "fuck off";
//			}
		}
		System.out.println(as);
	}
}
