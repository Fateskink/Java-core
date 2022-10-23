package Book_V1;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Book_V1.Book;

public class Bookstore implements Store_interface {
//	private static int totalitem = 0;	-	Dùng List r nên total ko còn cần thiết
	private final int MaxItems = 10;
	private List<Book> listItem = null;

	public Bookstore() {
		listItem = new LinkedList<Book>();
	}

//Lấy vị trí sách
	private int getItemPositions(String bookId) {
//		for (int i = 0; i < getTotalitem(); i++) {	có thể dùng listitem.size() thay cho get
//			Book bookobj = (Book) listItem.get(i); tạo ms vùng nhớ cho bookobj để gọi getId
//			if (bookId.equals(bookobj.getId()))
//				return i;
		// thay thế bằng Iterator bên dưới
		Iterator<Book> itr = listItem.iterator();
		int j = 0;
		while (itr.hasNext()) {
//			Book bookobj = (Book) itr.next(); - thêm generic vào Iterator nên có thể bỏ
			if (bookId.equals(itr.next().getId()))
				return j;
			j++;
		}
		return -1;
	}

//Kiểm tra slot dung lượng danh sách
	public boolean checkFull() {
		if (getTotalitem() == MaxItems)
			return true;
		return false;
	}

//Kiểm tra độ rỗng danh sách
	public boolean checkEmpty() {
//		if (getTotalitem() == 0)
//			return true;
//		return false;
// thay thế hoàn toàn bởi isEmpty.
		return listItem.isEmpty();
	}

//Thêm sách
//	public void add(Book bookObj) {
//
//	}
	@Override
	public void add(Object Obj) {
		Book bookObj = (Book) Obj;
		if (checkFull() == false) {
//			this.listItem[getTotalitem()] = bookObj;
//			Bookstore.setTotalitem(Bookstore.getTotalitem() + 1);
			listItem.add(bookObj);
			System.out.println("Add succesfull!");
		} else {
			System.out.println("Bookstore is full!");
		}

	}

//Sửa sách
	public void edit(String bookId, String bookName, double bookPrice) {
		int bookgetitemposition = this.getItemPositions(bookId);
		if (bookgetitemposition == -1) {
			System.out.println("\t >>>>> Your book is not exist \n >>>>> Fooler");
		} else {
//			Book bookobj = (Book) listItem.get(bookgetitemposition);
			listItem.get(bookgetitemposition).setName(bookName);
			listItem.get(bookgetitemposition).setPrice(bookPrice);
			System.out.println(">>> Ok, now we get a new book!");
		}
	}

//Xóa sách
	public void delete(String bookId) {
		int bookgetitemposition = this.getItemPositions(bookId);
		if (bookgetitemposition == -1) {
			System.out.println("\t >>>>> Your book is not exist \n >>>>> Fooler");
		} else {
//			for (int i = bookgetitemposition; i < getTotalitem() - 1; i++) {
//				listItem[i] = listItem[i + 1];
//			}
//			Bookstore.setTotalitem(Bookstore.getTotalitem() - 1);
			listItem.remove(bookgetitemposition);
			System.out.println(" Delete succesfull!");
		}
	}

//Tìm sách
	public void find(String bookId) {
		int bookgetitemposition = this.getItemPositions(bookId);
		if (bookgetitemposition == -1) {
			System.out.println(">>> U get wrong Id man!");
		} else
			System.out.println(listItem.get(bookgetitemposition));
//		listItem[bookgetitemposition].showInfo();
	}

//Xem danh sách
	public void list() {
		if (this.checkEmpty() == false) {
//			for (int i = 0; i < getTotalitem(); i++) {
//				System.out.println(this.listItem.get(i));
			// this.listItem[i].showInfo();

			Iterator<Book> itr = listItem.iterator();
			int j = 0;
			while (itr.hasNext()) {
//				Book bookobj = (Book) itr.next();
				System.out.println(itr.next());
			}
		} else {
			System.out.println("These is no book, ur idiot!");
		}
	}

	public int getTotalitem() {
		return listItem.size();
	}

	// set ko còn cần thiết
//	public static void setTotalitem(int totalitem) {
//		Bookstore.totalitem = totalitem;
//	}
	public void sortNameAZ() {
		Collections.sort(listItem, new NameAZcomparator());
//		System.out.println("Bookstore.sortNameAZ");
	}

	public void sortNameZA() {
		Collections.sort(listItem, new NameZAcomparator());
//		System.out.println("Bookstore.sortNameZA");
	}

	public void sortPriceHL() {
		Collections.sort(listItem, new PriceHLcomparator());
		// System.out.println("Bookstore.sortPriceLH");
	}

	public void sortPriceLH() {
		Collections.sort(listItem, new PriceHLcomparator());
		Collections.reverse(listItem);
//		System.out.println("Bookstore.sortPriceHL");
	}

	public void findMax() {

//		Cách 1
		if (!this.checkEmpty()) {
//			Book bookobj = Collections.max(listItem, new PriceHLcomparator());
//			System.out.println(bookobj);
//		} else {
//			System.out.println("These is no book, ur idiot!");
//		}
//		Cách 2
			Comparator<Book> cmp = new Comparator<Book>() {

				@Override
				public int compare(Book bookobj1, Book bookobj2) {
					if (bookobj1.getPrice() > bookobj2.getPrice())
						return 1;
					else if (bookobj1.getPrice() < bookobj2.getPrice())
						return -1;
					return 0;
				}
			};
			Book bookobj = Collections.max(listItem, cmp);
		} else {
			System.out.println("These is no book, ur idiot!");
		}
	}

	public void findMin() {
		if (!this.checkEmpty()) {
			sortPriceLH();
			System.out.println(listItem.get(0));

		} else {
			System.out.println("These is no book, ur idiot!");
		}
	}
}
