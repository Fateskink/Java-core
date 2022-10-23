package Chap_03;

import java.util.Arrays;

public class P02_array_class {
	public static void main(String[] args) {
		study001();
		study002();
		study003();
		study004();
	}

	private static void study004() {
		int[] arr = {1,4,6,2,51,7,98};
		System.out.println(Arrays.toString(arr));
		
		//tăng dần
		Arrays.sort(arr);
		System.out.println(" Output" + Arrays.toString(arr));
		//giảm dần băng cách đảo thứ tự trong mảng tăng dần
		int length2 = arr.length;
		for (int i = 0; i < length2/2; i++) {
			int elm = arr[i];
			arr[i] = arr[length2 - 1 - i];
			arr[length2 - 1 - i] = elm;
			System.out.println(" Output" + Arrays.toString(arr));
		}
		
	}
	private static void study003() {
		String[] arString = { "Fate", "E", "the most", "Handsome Man" };
		int length = arString.length;
		for (int i = 0; i < length; i++) {
			System.out.printf("Phần tử thứ %d : %s \n", i, arString[i]);
		}
		for (String str : arString) {
			System.out.println(str);
		}
		System.out.println("-------------------------");
		System.out.println(Arrays.toString(arString));
	}

	private static void study001() {
		String[] arString = { "Fate", "E", "the most", "Handsome Man" };
		String newArr[] = Arrays.copyOfRange(arString, 0, 2);
		System.out.println(newArr[1]);
		System.out.println(newArr.length);
	}

//sao chép mảng
	private static void study002() {
		String[] arString = { "Fate", "E", "the most", "Handsome Man" };
		int length = arString.length;
		String newArr[] = Arrays.copyOf(arString, 5);
		newArr[4] = "best";
		System.out.println(newArr[4]);
	}
}
