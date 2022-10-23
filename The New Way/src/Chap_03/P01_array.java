package Chap_03;

import java.util.Iterator;
import java.util.Scanner;

public class P01_array {
	public static void main(String[] args) {
		study001();
		study002();
	}

	private static void study001() {
		// khai báo mảng
		// int arrOne[];
		// int[] arrTwwo;
		// khai báo mảng và cấp vùng nhớ cho nó
		// int arrInt[] = new int[5];
		int arrInt[] = { 25, 23, 65, 45, 33 };
		/*
		 * System.out.println(arrInt[3]); System.out.println(arrInt.length);
		 * System.out.println(arrInt[arrInt.length - 1]);
		 * System.out.println(arrInt[(arrInt.length - 1)/2]);
		 */
		int length = arrInt.length;
		for (int i = 0; i < length; i++) {
			System.out.printf("phần tử thứ %d : %d %n", i, arrInt[i]);
		}
		int arrInt3[] = { 21, 22, 23, 24, 25 };
		for (int n : arrInt3) {
			System.out.println(n);
		}
	}

	private static void study002() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Length :");
		int length = scan.nextInt();
		scan.nextLine();
		int arrNumber[] = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.printf("số phần tử %d :%n", i);
			arrNumber[i] = scan.nextInt();
			scan.nextLine();
		}
		scan.close();
		for (int j = 0; j < length; j++) {

			System.out.printf("phần tử %d : %d%n",j, arrNumber[j]);
		}
		int min = arrNumber[0];
		int max = arrNumber[0];
		int sum = 0;
		for (int number : arrNumber) {
			sum = sum + number;
			if (min > number)
				min = number;
			if (max < number)
				max = number;
		}
		System.out.println("Sum :" + sum);
		System.out.println("Min :" + min);
		System.out.println("Max :" + max);
	}

}
