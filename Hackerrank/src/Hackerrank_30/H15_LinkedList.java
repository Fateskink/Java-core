package Hackerrank_30;

import java.util.Scanner;

//class declare
class Node {
	int data;
	Node next;
//constructor of Node
	Node(int d) {
		data = d;
		next = null;
	}
}

class Solution15 {
	//create a method to insert 2 new fields
	public static Node insert(Node head, int data) {
		//at initial list head is null, insert a "head" into data - constructor Node
		if (head == null) {
			head = new Node(data);
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(data);
		}
		return head;
	}

	private static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.println(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();
		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}
}
