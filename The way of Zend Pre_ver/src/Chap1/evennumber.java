package Chap1;

public class evennumber {
	public static void main(String[] args) {
		int n = -4;
		String result ="Nguyên";
		String str1   =" dương";
		String str2   = " chẵn";
//		n >= 0  n%2=0 nguyên dương chẵn
//		n >= 0  n%2=1 nguyên dương lẻ
//		n <  0  n%2=0 nguyên âm chẵn
//		n <  0  n%2=0 nguyên âm lẻ
			System.out.println(n);
//		if 		(n >= 0 && n %2 == 0 ) 	{ result = "Nguyên dương chẵn";}
//		else if (n >= 0 && n %2 ==1) 	{result = "Nguyên dương lẻ";}
//		else if (n <= 0 && n %2 == 0) 	{result = "Nguyên âm chẵn";}
//		else 							{result = "Nguyên âm lẻ";}
			if (n < 0) { str1 = " âm";}
			if (n %2 ==1) { str2 = " lẻ";}
			System.out.println(result + str1 +str2);
		
		
		
		
		
// if 15 is even number
	// 15 % 2 is 1
	// 14 % 2 is 0
	//int 		number = 12;
	//String 		result = "Là số chẵn";
	//int 		tmb    = number % 2;
//		System.out.println(number);
//		
//		if 			(number == 0) 			{System.out.println(" Là số không");}
//		else if 	(number % 2 == 1) 		{System.out.println(" Là số lẻ");}
//		else 								{System.out.println(" Là số chẵn");}
//	}
//		
	
	//if (tmb == 0) result = "Là số chẵn";
	//if (number % 2 == 0) 
		//result = "Là số lẻ";
		//{System.out.println("Là số chẵn");}
	//else {System.out.println("Là số lẻ");}
		
		/*
		 * if (tmb == 0) {
			System.out.println("Là số chẵn");
		}
		if (tmb == 1) {
			System.out.println("Là số lẻ");
		}
		 */
		//	if (tmb == 0)  System.out.println("Là số chẵn");
		//	if (tmb == 1)  System.out.println("Là số lẻ");
	
		//if (tmb == 1) {}
//		public static void main001(String[] args) {
//			
//			// if 15 is even number
//				// 15 % 2 is 1
//				// 14 % 2 is 0
//				int 		number = 12;
//				//String 		result = "Là số chẵn";
//				//int 		tmb    = number % 2;
//					System.out.println(number);
//					
//					if 			(number == 0) 			{System.out.println(" Là số không");}
//					else if 	(number % 2 == 1) 		{System.out.println(" Là số lẻ");}
//					else 								{System.out.println(" Là số chẵn");}
		
}
}