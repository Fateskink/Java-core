package Chap_02_3_Test;

import java.util.Scanner;

public class Main_library {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int FuntionId = 0;
		boolean flag = true;
		do {
			showMenu();
			FuntionId = sc.nextInt();
			sc.nextLine();
			switch (FuntionId) {
			case 1:
				addBook();
				break;
			case 2:
				editBook();
				break;
			case 3:
				bookInfo();
				break;
			default:
				flag = false;
				break;
			}
			// System.out.println(FuntionId);
		} while (flag == true);
		sc.close();
	}

	private static Book bookobj = null;

	private static void showMenu() {
		myPrint("*************** BOOK MANAGER ***************");
		myPrint("1. ADD");
		myPrint("2. EDIT");
		myPrint("3. INFO");
		myPrint("4. EXIT");
		myPrint("Your Choice (1-4) :");
	}

	private static void myPrint(String content) {
		System.out.println(content);
	}

	private static void addBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Add book");
		String BookName = "";
		String BookId = "";
		double BookPrice = 0;
		myPrint("Id :");
		BookId = sc.nextLine();
		myPrint("Name :");
		BookName = sc.nextLine();
		myPrint("Price :");
		BookPrice = sc.nextDouble();
		bookobj = new Book(BookId, BookName, BookPrice);
		bookobj.showInfo();
	}

	private static void editBook() {
		System.out.println("Edit book");
		if (bookobj != null) {
			Scanner sc = new Scanner(System.in);
			String BookName = "";
			double BookPrice = 0;
			myPrint("Name :");
			BookName = sc.nextLine();
			myPrint("Price :");
			BookPrice = sc.nextDouble();
			bookobj.showInfo();
			bookobj.setName(BookName);
			bookobj.setPrice(BookPrice);

		} else {
			myPrint("Book is not exist");
		}
	}

	private static void bookInfo() {
		System.out.println("Book info");
		if (bookobj != null) {
			bookobj.showInfo();
		} else {
			myPrint("Book is not exist");
		}
	}

}
