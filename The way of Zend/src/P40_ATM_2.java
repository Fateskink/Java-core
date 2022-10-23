import java.text.DecimalFormat;
import java.util.Scanner;

public class P40_ATM_2 {
	public static void main(String[] args) {
		// Hiển thị phân biệt hàng nghìn
		DecimalFormat formater = new DecimalFormat("#,###");
		System.out.println("Số dư tài khoản: " + formater.format(36500000));
		int money = 0;
		final int FIVE_HTD = 500000;
		final int TWO_HTD = 200000;
		final int ONE_HTD = 100000;
		final int FIF_TD = 50000;
		final int TWE_TD = 20000;
		final int TEN_TD = 10000;
		int fivehtd = 0;
		int twohtd = 0;
		int onehtd = 0;
		int fiftd = 0;
		int twetd = 0;
		int tentd = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Your money:");
			money = sc.nextInt();
		} while (money % 10000 != 0);
		sc.close();
		System.out.println(money);
		// 500.000
		if (money >= FIVE_HTD) {
			fivehtd = money / FIVE_HTD;
			money = money % FIVE_HTD;
			System.out.printf("Mệnh giá %s : %d %n", formater.format(FIVE_HTD), fivehtd); // System.out.println();
		}
		// 200.000
		if (money >= TWO_HTD) {
			twohtd = money / TWO_HTD;
			money = money % TWO_HTD;
			System.out.printf("Mệnh giá %s : %d %n", formater.format(TWO_HTD), twohtd); // System.out.println();
		}
		// 100.000
		if (money >= ONE_HTD) {
			onehtd = money / ONE_HTD;
			money = money % ONE_HTD;
			System.out.printf("Mệnh giá %s : %d %n", formater.format(ONE_HTD), onehtd); // System.out.println();
		}
		// 50.000
		if (money >= FIF_TD) {
			fiftd = money / FIF_TD;
			money = money % FIF_TD;
			System.out.printf("Mệnh giá %s : %d %n", formater.format(FIF_TD), fiftd); // System.out.println();
		}
		// 20.000
		if (money >= TWE_TD) {
			twetd = money / TWE_TD;
			money = money % TWE_TD;
			System.out.printf("Mệnh giá %s : %d %n", formater.format(TWE_TD), twetd); // System.out.println();
		}
		// 10.000
		if (money >= TEN_TD) {
			tentd = money / TEN_TD;
			money = money % TEN_TD;
			System.out.printf("Mệnh giá %s : %d %n", formater.format(TEN_TD), tentd); // System.out.println();
		}
	}
}
