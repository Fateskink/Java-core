
public class P43_BT_2 {
	public static void main(String[] args) {
		String space = "";
		String record = "";
		int n = 1;
		while (n <= 7) {
			if (n >= 2 && n <= 6) {
				space = "";
				for (int i = 1; i <= (7 - n); i++)
					space += " ";
				record = space + "*";
				System.out.print(record);
			} else {
				for (int j = 1; j <= 7; j++)
					System.out.print("*");
			}
			System.out.println();
			n++;
		}
	}
}
