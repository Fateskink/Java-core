
public class P32_Thap_hinh_8 {
	public static void main(String[] args) {
	   final int height = 10;
	         int   line = 1;
	  String space 		= "";
	  String charactor 	= "";
	  String result 	= "";												
	  String record 	= "";												//space = height - line
	while (line<=height) {													//char = 2line -1
		space = "";
		charactor = "";
			for (int i = 1; i <= height - line; i++) space += " ";
			for (int j = 1; j <= 2*line -1; j++) charactor +="*" ;
		record = space + charactor + "\n";
		result += record;
		line++;
		} 
		System.out.print(result);
		} 
}

