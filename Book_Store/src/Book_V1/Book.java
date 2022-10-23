package Book_V1;

public class Book {
	private String bookName;
	private String bookId;
	private double bookPrice;

	public Book(String Name, String id, double price) {
		this.setName(Name);
		this.setId(id);
		this.setPrice(price);
	}

//Các phương thức getter và setter
	public String getName() {
		return bookName;
	}

	public void setName(String name) {
		this.bookName = name;
	}

	public String getId() {
		return bookId;
	}

	public void setId(String id) {
		this.bookId = id;
	}

	public double getPrice() {
		return bookPrice;
	}

	public void setPrice(double price) {
		this.bookPrice = price;
	}

//Phương thức giao diện thao tác với sách
	@Override
	public String toString() {
		String result = "Book info \n"
						+"- Id \t :" + this.getId()+"\n"
						+"- Name \t :" + this.getName()+"\n"
						+"- Price \t :" + this.getPrice();
		return result;
	}

	/* phương thức showinfo cũ
	 * void showInfo() { System.out.println("Book info");
	 * System.out.println("- Id \t :" + this.getId());
	 * System.out.println("- Name \t :" + this.getName());
	 * System.out.println("- Price \t :" + this.getPrice()); }
	 */
}
