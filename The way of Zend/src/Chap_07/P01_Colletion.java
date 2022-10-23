package Chap_07;

import java.util.*;

public class P01_Colletion {
	public static void main(String[] args) {
//		arrayList();
		linkedList();
	}

	public static void arrayList() {
		List listObj = new ArrayList();
		course courseobj = new course("Fate", 15);
		listObj.add("handsome");
		listObj.add(courseobj);
		listObj.add(15);
		listObj.add("Fucking handsome");

		// size() - tổng các phần tử
		System.out.println(listObj.size());
		// truy cập và in ra phần tử
		System.out.println(listObj.get(2));
		System.out.println(listObj.get(listObj.size() - 1));
		listObj.set(0, "holy shit");
		System.out.println(listObj.get(0));

		// in các phần tử
		// cách 1
		for (int i = 0; i < listObj.size(); i++) {
			System.out.println(listObj.get(i));
		}
		System.out.println("========");
		// cách 2
		for (Object elm : listObj) {
			System.out.println(elm);
		}
		System.out.println("=======");
		// cách 3
		Iterator itr = listObj.iterator();
		while (itr.hasNext() == true) {
			System.out.println(itr.next());
		}
		// remove - xóa phần tử trong chuỗi
		System.out.println("=========");
		listObj.remove(1);
		Iterator itr2 = listObj.iterator();
		while (itr2.hasNext() == true) {
			System.out.println(itr2.next());
		}
		System.out.println("=========");
		// xóa tất cả các phần tử
		listObj.clear();
		if (listObj.isEmpty() == false) {
			Iterator itr4 = listObj.iterator();
			while (itr4.hasNext() == true) {
				System.out.println(itr4.next());
			}
		} else {
			System.out.println("List is empty");
		}

	}

	private static void linkedList() {
		List listObj = new LinkedList();
		course courseObj = new course("fate", 69);
		listObj.add("handsome");
		listObj.add(courseObj);
		listObj.add(15);
		listObj.add("Fucking handsome");
		if(!listObj.isEmpty()) {
			Iterator itr = listObj.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}
}
