package Hackerrank_30;

import java.util.Scanner;

public class H16_Exception {
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			String S = sc.next();
			int I = Integer.parseInt(S);
			System.out.println(I);
		} catch (Exception e) {
			System.out.println("Bad String");
		}

	}
}
