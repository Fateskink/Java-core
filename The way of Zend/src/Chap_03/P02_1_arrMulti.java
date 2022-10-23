package Chap_03;

import java.util.Arrays;
import java.util.Iterator;

public class P02_1_arrMulti {
	public static void main(String[] args) {
		study001();
	}

	private static void study001() {
		int[][] arrMul = { { 2, 9, 1 }, { 3, 7, 8 } };
//	arrMul[0][0] = 2;
//	arrMul[0][1] = 9;
//	arrMul[0][2] = 1;
//	arrMul[1][0] = 3;
//	arrMul[1][1] = 7;
//	arrMul[1][2] = 8;
		System.out.println("Test : " + arrMul[0].length);
		//System.out.println("Dòng 2 cột 3 : " + arrMul[1][2]);
		int row = arrMul.length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < arrMul[i].length; j++) {
//System.out.printf("Dòng %d cột %d : %d \n", i+1, j+1, arrMul[i][j]);
//System.out.print(arrMul[i][j]+" ");
			}System.out.println();
			
		}System.out.println(Arrays.deepToString(arrMul));
	}
}
