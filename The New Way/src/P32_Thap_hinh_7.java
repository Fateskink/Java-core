
public class P32_Thap_hinh_7 {
public static void main(String[] args) {
	int n = 1;
	final int lengh= 15;
	while (n<=lengh) {
		for (int i = 1; i <= lengh; i++) { //System.out.print("2  ");
			if (i>=2 && i<=lengh-1 && n>=2 && n<=lengh-1)
				System.out.print("  ");
				else System.out.print("* ");}
		System.out.println();
		n++;
	}	
}
}
