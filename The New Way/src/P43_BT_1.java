
public class P43_BT_1 {
	public static void main(String[] args) {

		int n = 1;
		// final int height = 7;
		String space = "";

		String record = "";

		while (n <= 7) {
			space = "";
			record = "";
			if (n >= 2 && n <= 6) {
				for (int i = 1; i <= (n - 1); i++)
					space += " ";
				record = space + "*";
				System.out.print(record);
			} else {
				for (int j = 1; j <= 7; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
			n++;

		}
	}
}
