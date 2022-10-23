package Book_V1;

import java.util.Scanner;

import javax.swing.tree.VariableHeightLayoutCache;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int funtionId;
		boolean flag = true;
		do {
			showmenu();
			// Tạo Exception cho funtionId
			try {
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
					findBook("Id");
					break;
				case 5:
					listBook("Price", 0);
					break;
				case 6:
					listBook("Price", 1);
					break;
				case 7:
					listBook("Name", 1);
					break;
				case 8:
					listBook("Name", 0);
					break;
				case 9:
					findBook("Max");
					break;
				case 10:
					findBook("Min");
					break;
				case 11:
				default:
					flag = false;
					break;
				}
			} catch (Exception e) {
				System.out.println("Lỗi rồi b ei!!! \nẤn nhầm chữ r");
				flag = true;
				sc.nextLine();
			}

		} while (flag == true);
		sc.close();
	}

//Phương thức giao diện chính
	private static void showmenu() {
		System.out.println("********* BOOK MANAGER *********");
		System.out.println("1. Add Book.");
		System.out.println("2. Edit Book.");
		System.out.println("3. Delete Book.");
		System.out.println("4. Find Book.");
		System.out.println("5. List Book (Price: Hight - Low)");
		System.out.println("6. List Book (Price: Low - Hight)");
		System.out.println("7. List Book (Name: A - z)");
		System.out.println("8. List Book (Name: Z - a)");
		System.out.println("9. List Book (Expensive)");
		System.out.println("10. List Book (Cheap)");
		System.out.println("11. Exit!");
		System.out.println("You fucking input from 1 to 6 or Ur Idiot");
	}

//Phương thức giao diện sách phụ
	private static Book bookObj = null;
//Phương thức kho lưu trữ
	private static Bookstore storeObj = new Bookstore();

//Phương thức thêm sách
	private static void addBook() {
		if (storeObj.checkFull() == false) {
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

//check Id, name, price theo định dạng chi tiết
			Validate validateobj = new Validate();
			boolean flagId = validateobj.checkId(bookId);
			boolean flagName = validateobj.checkName(bookName);
			boolean flagPrice = validateobj.checkPrice(bookPrice);
			if (flagId && flagName && flagPrice) {
				Book bookObj = new Book(bookName, bookId, bookPrice);
				storeObj.add(bookObj);
			} else {
				validateobj.getError();
			}

//			bookObj = new Book(bookName, bookId, bookPrice);
//			bookObj.showInfo();
		} else
			System.out.println(":((( No more further man! \n >>> The store is full");
	}

//Phương thức sửa sách
	private static void editBook() {
//		 if (bookObj != null) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Edit Book");

		String bookId = "";
		String bookName = "";
		double bookPrice = 0;
		System.out.println(" - Id :");
		bookId = sc.nextLine();
		System.out.println(" - Name :");
		bookName = sc.nextLine();
		System.out.println(" - Price :");
		bookPrice = sc.nextDouble();

		// bookObj.showInfo();
		storeObj.edit(bookId, bookName, bookPrice);
//			bookObj.setName(bookName);
//			bookObj.setPrice(bookPrice);

//		} else
//			System.out.println("\t You know what? \n >>>>> Your book is not exist \n >>>>> Fooler");
	}

//Phương thức xóa sách
	private static void deleteBook() {
		Scanner sc = new Scanner(System.in);
		String bookId = "";
		System.out.println("Id :");
		bookId = sc.nextLine();
		storeObj.delete(bookId);
	}

//Phương thức tìm sách
	private static void findBook(String type) {
		switch (type) {
		case "Id": {
			Scanner sc = new Scanner(System.in);
			String bookId = "";
			System.out.println("Id: ");
			bookId = sc.nextLine();
			storeObj.find(bookId);
			break;
		}
		case "Max":
			storeObj.findMax();
			break;
		case "Min":
			
		default:
			storeObj.findMax();
		}

	}

//Phương thức xem danh sách
	private static void listBook(String property, int type) {
		if (property.equals("Name") && type == 1)
			storeObj.sortNameAZ();
		if (property.equals("Name") && type == 0)
			storeObj.sortNameZA();
		if (property.equals("Price") && type == 0)
			storeObj.sortPriceLH();
		if (property.equals("Price") && type == 1)
			storeObj.sortPriceHL();
		storeObj.list();
	}
}
