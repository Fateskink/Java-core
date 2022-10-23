package Book_V2;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int funtionId;
		boolean flag = true;
		do {
			showmenu();
			funtionId = sc.nextInt();
			sc.nextLine();
			switch (funtionId) {
			case 1:
				addBook();
				break;
			case 2:
				editBook();
				break;
			case 3:
				deleteBook();
				break;
			case 4:
				findBook();
				break;
			case 5:
				listBook();
				break;
			case 6:
			default:
				flag = false;
				break;
			}
		} while (flag == true);
		sc.close();
	}
	

	private static void showmenu() {
		System.out.println("********* BOOK MANAGER *********");
		System.out.println("1. Add Book.");
		System.out.println("2. Edit Book.");
		System.out.println("3. Delete Book.");
		System.out.println("4. Find Book.");
		System.out.println("5. List Book.");
		System.out.println("6. Exit!");
		System.out.println("You fucking input from 1 to 6 or Ur Idiot");
	}

	private static Store bookObj = null;

	private static void addBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Add Book");
		String bookId = "";
		String bookName = "";
		double bookPrice = 0;
		System.out.println(" - Book Id: ");
		bookId = sc.nextLine();
		System.out.println(" - Book Name: ");
		bookName = sc.nextLine();
		System.out.println(" - Book Price: ");
		bookPrice = sc.nextDouble();
		// Book bookObj = new Book(bookName, bookId, bookPrice);
		// Store storeObj = new Store();
		bookObj = new Store(bookName, bookId, bookPrice);
		bookObj.showinfo();
	}

	private static void editBook() {
		if (bookObj != null) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" Edit Book");
			String bookName = "";
			double bookPrice = 0;
			System.out.println(" - Name :");
			bookName = sc.nextLine();
			System.out.println(" - Price :");
			bookPrice = sc.nextDouble();
			bookObj.showinfo();
			bookObj.setName(bookName);
			bookObj.setPrice(bookPrice);

		} else
			System.out.println("\t You know what? \n >>>>> Your book is not exist \n >>>>> Fooler");
	}

	private static void deleteBook() {

	}

	private static void findBook() {

	}

	private static void listBook() {

	}
}
