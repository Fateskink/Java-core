package Hackerrank_30;

import java.util.Scanner;

class Calculator {
	int power(int n, int p) throws Exception {
		int result = 1;
		if (n >= 0 && p >= 0) {
			for (int i = 0; i < p; i++) {
				result *= n;
			}
			if (p == 0) {
				result = 1;
			}
			return result;
		}else {
			throw new Exception("n and p should be non-negative");
		}
	}
}

class solution17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			Calculator mycalculator = new Calculator();
			try {
				int ans = mycalculator.power(n, p);
				System.out.println(ans);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		sc.close();
	}
}
