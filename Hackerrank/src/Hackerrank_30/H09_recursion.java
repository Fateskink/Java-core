package Hackerrank_30;

public class H09_recursion {
	private static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}

	}
}
