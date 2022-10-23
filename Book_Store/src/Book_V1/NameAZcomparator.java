package Book_V1;

import java.util.Comparator;

public class NameAZcomparator implements Comparator<Book> {

//	@Override
//	public int compare(Object o1, Object o2) {


	@Override
	public int compare(Book bookobj1, Book bookobj2) {
//		Book bookobj1 = (Book) o1;
//		Book bookobj2 = (Book) o2;
		return bookobj1.getName().compareToIgnoreCase(bookobj2.getName());

	}

}
