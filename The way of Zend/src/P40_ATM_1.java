import java.util.Scanner;

public class P40_ATM_1 {
public static void main(String[] args) {
	int money = 0;
	final int FIVE_HTD = 500000;
	final int TWO_HTD  = 200000;
	final int ONE_HTD  = 100000;
	final int FIF_TD   = 50000;
	final int TWE_TD   = 20000;
	final int TEN_TD   = 10000;
	int fivehtd = 0;
	int twohtd  = 0;
	int onehtd  = 0;
	int fiftd   = 0;
	int twetd   = 0;
	int tentd   = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Your money:");
			money =  sc.nextInt();
			} while (money % 10000 != 0);
		sc.close();
		System.out.println(money);
} 
}
