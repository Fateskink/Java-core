package Chap1;

import java.util.Scanner;

public class cacul {
	public static void main(String[] args) {
		
		int Numberfirst ;				//khai báo biến
		int Numbersecond ;
		int result=0 ;
		String caculate;
		
	Scanner sc =new Scanner(System.in);		//scan số liệu nhập vào  -  new cấp bộ nhớ cho đối tượng
		System.out.println("Numberfirst: "); 
	Numberfirst = sc.nextInt();				// next quét văn bản
	sc.nextLine();
	
		System.out.println("Numbersecond: ");
	Numbersecond = sc.nextInt();
	sc.nextLine();
	
		System.out.println("Caculate: ");
	caculate = sc.nextLine();
	
	sc.close();
	
		System.out.println("Numberfirst: "+ Numberfirst);		//in số liệu nhập vào
		System.out.println("Numbersecond: "+ Numbersecond);
		System.out.println("Caculate: "+ caculate);
	
	switch (caculate) {											// hiện phép tính
	
	case "+":
		result = Numberfirst + Numbersecond;break;
		
	case "-":
		result = Numberfirst - Numbersecond;break;
		
	case "*":
	case "x":	
		result = Numberfirst * Numbersecond;break;
		
	case "/":
	case ":":	
		result = Numberfirst / Numbersecond;break;
		
	case "%":
		result = Numberfirst % Numbersecond;	
		break;

	default: result = Numberfirst + Numbersecond; caculate ="+";
		break;
	}
		System.out.printf("%d %s %d = %d", Numberfirst, caculate ,Numbersecond , result);
}
}
