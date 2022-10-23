package Hackerrank_30;

import java.util.Scanner;

public class H11_2D_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[6][6];
		int sum, max = -63;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				sum = array[i][j] + array[i - 1][j - 1] + array[i - 1][j] + array[i - 1][j + 1] + array[i + 1][j - 1]
						+ array[i + 1][j] + array[i + 1][j + 1];
				if (sum > max) {
					max = sum;
				}
			}
		}
		System.out.println(max);
		sc.close();
	}
}
