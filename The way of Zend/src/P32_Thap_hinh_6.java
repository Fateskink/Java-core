
public class P32_Thap_hinh_6 {
public static void main(String[] args) {
	String record = "";
	String result = "";
	String space  = "";
	String left   = "";
	String right  = "";

	int n = 1;
		while (n<=5) {
			space  = "";
			left   = "";
			right  = "";
			for (int j = 1; j <= (5-n); j++) space +=" ";  //System.out.print(" ");
			for (int l = n; l >= 2 ; l--) left += l;
			for (int r = 2; r <= n ; r++) right += r;	
			record		  = space + left + "1" + right +"\n";
			result		  = result + record;
			n++;}
			//for (int i = 1; i <= n; i++) {
				System.out.print(result); 
			
				//System.out.println();
		
		}
}

