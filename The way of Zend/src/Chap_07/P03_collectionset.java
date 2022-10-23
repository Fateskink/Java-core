package Chap_07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class P03_collectionset {
	public static void main(String[] args) {
	hashSet();
	System.out.println("========================");
	linkedhashset();
	System.out.println("========================");
	treeset();

	}

//thứ tự các phần tử thêm vào bởi hashSet bị thay đổi
// không lưu trữ các phần tử trùng nhau
	private static void hashSet() {
		Set setobj = new HashSet();
		setobj.add(3);
		setobj.add(34);
		setobj.add(22);
		setobj.add(15);
		setobj.add(53);
		setobj.add(12);
		setobj.add(11);
		setobj.add(2);
		setobj.add(1);
		setobj.add(1);
		Iterator itr = setobj.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	//LinkHashSet sắp xếp phần tử theo thứ tự insert
	//không lưu trữ phaafnt ử trùng nhau
	private static void linkedhashset() {
		Set setobj = new LinkedHashSet();
		setobj.add(3);
		setobj.add(34);
		setobj.add(22);
		setobj.add(15);
		setobj.add(53);
		setobj.add(12);
		setobj.add(11);
		setobj.add(2);
		setobj.add(1);
		setobj.add(1);
		Iterator itr = setobj.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	//TreeSet sắp xếp phần tử từ nhỏ đến lớn
	//không lưu trữ phần tử trùng nhau
	private static void treeset() {
		Set setobj = new TreeSet();
		setobj.add(3);
		setobj.add(34);
		setobj.add(22);
		setobj.add(15);
		setobj.add(53);
		setobj.add(12);
		setobj.add(11);
		setobj.add(2);
		setobj.add(1);
		setobj.add(1);
		Iterator itr = setobj.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
