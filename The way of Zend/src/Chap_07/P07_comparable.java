package Chap_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class P07_comparable {
	public static void main(String[] args) {
		course courseJava = new course("Java", 50);
		course coursePHP = new course("PHP", 30);
		course courseFuck = new course("Fuck", 45);

		ArrayList arr = new ArrayList();
		arr.add(coursePHP);
		arr.add(courseJava);
		arr.add(courseFuck);
		Collections.sort(arr);
		Iterator itr = arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
