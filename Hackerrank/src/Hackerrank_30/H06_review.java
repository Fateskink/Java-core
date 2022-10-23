package Hackerrank_30;

import java.util.Scanner;

public class H06_review {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int i = 1; i <= T; i++) {
			String a = scan.next();
			for (int j = 0; j < a.length(); j++) {
				if (j % 2 == 0)
					System.out.print(a.charAt(j));
			}
			System.out.print(" ");
			for (int j = 0; j < a.length(); j++) {
				if (j % 2 != 0)
					System.out.print(a.charAt(j));
			}
			System.out.println();
		}
	}
}
