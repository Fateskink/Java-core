package Hackerrank_30;

import java.util.Scanner;

public class H01_datatype {
	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int a = scan.nextInt();
		double b = scan.nextDouble();
		scan.nextLine();
		String ch = scan.nextLine();

		a += i;
		b += d;
		ch += s;

		/* Read and save an integer, double, and String to your variables. */
		// Note: If you have trouble reading the entire String, please go back and
		// review the Tutorial closely.
		System.out.println(a);
		/* Print the sum of both integer variables on a new line. */
		System.out.println(b);

		/* Print the sum of the double variables on a new line. */
		System.out.println(ch);
		/*
		 * Concatenate and print the String variables on a new line; the 's' variable
		 * above should be printed first.
		 */

		scan.close();
	}
}
