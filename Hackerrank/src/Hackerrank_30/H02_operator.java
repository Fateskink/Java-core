package Hackerrank_30;

import java.util.Scanner;

public class H02_operator {
	public static void main(String[] args) {
		System.out.println("Let me see...");
		Scanner scan = new Scanner(System.in);
		System.out.println("Your meal cost is:");
		double meal_cost = scan.nextDouble();
		System.out.println("Tip for waiter...");
		int tip_percent = scan.nextInt();
		System.out.println("and tax...");
		int tax_percent = scan.nextInt();
		scan.close();
		double tip;
		tip = meal_cost * tip_percent / 100;
		double tax;
		tax = meal_cost * tax_percent / 100;
		int total = (int) (meal_cost + (int) tip + (int) tax);
		int price = (int) Math.round(total);
		System.out.println("The total meal cost is " + price + " dollars");
	}
}
