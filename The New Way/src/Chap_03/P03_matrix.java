package Chap_03;

import java.util.Arrays;
import java.util.Scanner;

public class P03_matrix {
	public static void main(String[] args) {
		study();
	}

//khai báo ma trận
	public static void study() {
		int rows, columns;
		Scanner sc = new Scanner(System.in);
		System.out.println("Rows : ");
		rows = sc.nextInt();
		sc.nextLine();
		System.out.println("Columns : ");
		columns = sc.nextInt();
		sc.nextLine();
		int[][] arrmulti = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.printf("Dòng %d cột %d : ", i + 1, j + 1);
				arrmulti[i][j] = sc.nextInt();
				sc.nextLine();
				// tìm max cách 1
				int max = arrmulti[i][j];
				if (max < arrmulti[i][j])
					max = arrmulti[i][j];
				{
					System.out.println("Max : " + max);
				}
				// tìm max cách 2
				System.out.println(Arrays.toString(arrmulti[i]));
				Arrays.sort(arrmulti[i]);
				int length1 = arrmulti.length;
				if (max < arrmulti[i][length1 - 1])
					max = arrmulti[i][length1 - 1];
				{
					System.out.println(max);
				}
			}
		}
		sc.close();
		// in ma trận
		System.out.println(Arrays.deepToString(arrmulti));
		// tổng 1 hàng trong ma trận
		int sum = 0;
		int length = arrmulti.length;
		for (int number : arrmulti[rows - 1]) {
			sum += number;
		}
		System.out.println("Tổng phần tử hàng 1 :" + sum);
		// tổng 1 cột trong ma trận
		int sum2 = 0;
		for (int n = 0; n < length; n++) {
			System.out.println("Phần tử cột" + arrmulti[n][columns - 1]);
			sum2 += arrmulti[n][columns - 1];
			System.out.println("Tổng phần tử cột: " + sum2);
		}
		// đường chéo trong ma trận
		int sum3 = 0;
		for (int a = 0; a < length; a++) {
			System.out.println("phần tử đường chéo: " + arrmulti[a][a]);
			sum3 += arrmulti[a][a];
			System.out.println("Tổng phần tử đường chéo: " + sum3);
		}

	}
}
