package Chap_02_3_Test;

public class Book {
	private String name;
	private String Id;
	private double Price;

	public Book(String Id, String name, double Price) {
		this.setId(Id);
		this.setName(name);
		this.setPrice(Price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	void showInfo() {
		System.out.println("Book info");
		System.out.println(" - Id \t \t:" + this.getId());
		System.out.println(" - Name \t :" + this.getName());
		System.out.println(" - Price \t :" + this.getPrice());
	}
}
