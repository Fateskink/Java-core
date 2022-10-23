package Chap_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class P08_comparator {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList<course>();
		arr.add(new course("PHP", 5));
		arr.add(new course("Java", 10));
		arr.add(new course("Fuck", 45));
		Collections.sort(arr, new time08());
		Iterator itr = arr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
