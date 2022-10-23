package Hackerrank_30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class H08_long {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, Integer> hmap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int phone = sc.nextInt();
			hmap.put(name, phone);
	}

		while (sc.hasNext()) {
			String s = sc.nextLine();
			if (hmap.containsKey(s)) {
				System.out.println(s + "=" + hmap.get(s));
			} else {
				System.out.println("Not found");
			}
			sc.close();
		}
	}


}
