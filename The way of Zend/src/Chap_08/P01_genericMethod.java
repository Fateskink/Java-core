package Chap_08;

public class P01_genericMethod {
	public static void main(String[] args) {
		Integer[] arrInt = { 10, 20, 30, 40, 50 };
		String[] arrstr = { "Java", "PHP", "Note", "Fate", "Kink" };
//		printarint(arrInt);
//		printarrstr(arrstr);
		array(arrInt);
	}

	private static void printarint(Integer[] arrInt) {
		for (Integer elm : arrInt) {
			System.out.println(elm);
		}

	}

	private static  void printarrstr(String[] arrstr) {
		for (String elm : arrstr) {
			System.out.println(elm);
		}

	}

	private static <T extends Integer> void array(T[] array) {
		for (T elm : array) {
			System.out.println(elm);
		}

	}
}
