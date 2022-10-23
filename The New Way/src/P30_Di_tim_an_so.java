import java.util.Scanner;

public class P30_Di_tim_an_so {
	public static void main(String[] args) {
		// game đi tìm ẩn số

		final int maxnumber = 1000;
		final int minnumber = 1;
		int range = maxnumber - minnumber;

		int secretnumber = (int) (Math.random() * range + minnumber); // Math.random() //+ minnumber
		// secretnumber = 0;
		int yournumber = 0;
		int score = 10; // điểm
		// System.out.println(secretnumber);
		Scanner sc = new Scanner(System.in);

		while (secretnumber != yournumber) {
			System.out.println(" The secret number is from 1 to 1000");
			yournumber = sc.nextInt();
			sc.nextLine();

			if (yournumber > secretnumber) {
				System.out.println(" + Greater than secret number");
				if ((yournumber - secretnumber) <= 50) {
					System.out.println(" + It's so close");
				}
			}

			else if (yournumber < secretnumber) {
				System.out.println(" + Less than secret number");
				if ((secretnumber - yournumber) <= 50)
				{
					System.out.println(" + It's so close");
				}
			}

			else if (yournumber == secretnumber) {
				System.out.println(" You found the secret number");
			}
			score--;
			System.out.println(" - Your Score is " + score);
			if (score == 0) {
				System.out.println(" -_- Game over!! You Fucking Idiot! "); // điểm về 0 thì kết thúc trò chơi
				System.out.println( "\t *** Secret number :" + secretnumber +  " ***");
				break;
			}
		}
		sc.close();

//		final int maxnumber =100;
//		final int minnumber =1;
//	int range    	= 	maxnumber-minnumber+1;
//	int mynumber 	=  (int)(Math.random()*(double)range + minnumber);
//	int yournumber  = 0;
//		Scanner scan = new Scanner(System.in);
//			while (yournumber != mynumber ) {
//				System.out.println(" + Vui lòng nhập ẩn số + ");}
//			yournumber = scan.nextInt();
//			scan.nextLine();
//				if (yournumber > mynumber) {
//					System.out.println(" - Số bạn nhập lớn hơn ẩn số");
//					
//				} else if (yournumber < mynumber) { 
//					System.out.println(" - Số bạn nhập nhỏ hơn ẩn số");}
//		else { System.out.println(" - Bạn đã tìm thấy ẩn số");
//				}
//			scan.close();
	}
}
