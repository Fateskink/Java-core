package Open_Work;

import java.util.Scanner;
import java.util.Arrays;

public class OW_matrix {
	public static void main(String[] args) {
		int rows, culumns;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ma trận");
		rows = sc.nextInt();
		System.out.println("Rows: " + rows);
		sc.nextLine();
		culumns = sc.nextInt();
		System.out.println("Culumns: " + culumns);
		sc.nextLine();
		int arrmatrix[][] = new int[rows][culumns];
		int length = arrmatrix.length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < culumns; j++) {
				System.out.printf("Dòng %d cột %d : ", i + 1, j + 1);
				arrmatrix[i][j] = sc.nextInt();
				sc.nextLine();
			}
		}sc.close();
		// in ma trận
		System.out.println(Arrays.deepToString(arrmatrix));
		//sắp xếp ma trận
		Arrays.sort(arrmatrix);
		// in đư�?ng chéo
		System.out.println("Phần tử trong đư�?ng chéo: ");
		for (int a = 0; a < length; a++) {
			System.out.println(arrmatrix[a][a]);
		}
		// phần tử trên đư�?ng chéo
		System.out.println("Phần tử trên đư�?ng chéo:");
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				System.out.println(arrmatrix[i][j]);
			}
		}
		// phần tử dưới đư�?ng chéo
		System.out.println("Phần tử dưới đư�?ng chéo: ");
		for (int i = 0; i < arrmatrix.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				System.out.println(arrmatrix[i][j]);
			}
		}
	}
}
