package Hackerrank_30;

import java.util.Scanner;

public class H10_Binary {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	char[]BinaryArray = Integer.toBinaryString(n).toCharArray();
	int Count = 0;
	int Max = 0;
	for (int i = 0; i < BinaryArray.length; i++) {
		if(BinaryArray[i] == '1') Count++;
		else {
			Count = 0;
		}
		if(Count>Max) {
			Max = Count;
		}
		
	}
	System.out.println(Max);sc.close();
}
}
