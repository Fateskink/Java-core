package Book_V1;

import java.util.Comparator;

public class PriceHLcomparator implements Comparator<Book> {

//	@Override
//	public int compare(Object o1, Object o2) {
//		Book bookobj1 = (Book) o1;
//		Book bookobj2 = (Book) o2;
//		if (bookobj1.getPrice() > bookobj2.getPrice())
//			return 1;
//		else if (bookobj1.getPrice() < bookobj2.getPrice())
//			return -1;
//		return 0;
//	}

	@Override
	public int compare(Book bookobj1, Book bookobj2) {
		if (bookobj1.getPrice() > bookobj2.getPrice())
			return 1;
		else if (bookobj1.getPrice() < bookobj2.getPrice())
			return -1;
		return 0;
	}
}
