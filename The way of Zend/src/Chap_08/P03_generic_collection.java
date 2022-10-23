package Chap_08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class P03_generic_collection {
	public static void main(String[] args) {
		collectionlist();
	}

	private static void collectionlist() {
		List<Integer> listobj = new ArrayList<Integer>();
		listobj.add(1);
		listobj.add(2);
		listobj.add(3);
		listobj.add(4);
		Iterator<Integer> itr = listobj.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
