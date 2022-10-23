package Hackerrank_30;

import java.util.Scanner;

public class H07_array {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
     int length = scan.nextInt(); scan.nextLine();
     int[] number = new int[length];
     for(int i = 0; i<length; i++){
         number[i] = scan.nextInt();
         scan.nextLine();
     }
     scan.close();
     for(int i = (length-1); i>= 0; i--){
      System.out.print(number[i]+" ");}
}
}
