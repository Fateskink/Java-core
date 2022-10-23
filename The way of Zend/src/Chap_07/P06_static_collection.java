package Chap_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class P06_static_collection {
	public static void main(String[] args) {
		ArrayList listobj = new ArrayList();
		listobj.add(01);
		listobj.add(33);
		listobj.add(23);
		listobj.add(11);
		listobj.add(42);
		listobj.add(21);
		listobj.add(63);
		
		//sort
		Collections.sort(listobj);
		//reverse - đảo ngược
		Collections.reverse(listobj);
		//find
		int index = Collections.binarySearch(listobj, 3);
		System.out.println(index);
		Iterator itr = listobj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
