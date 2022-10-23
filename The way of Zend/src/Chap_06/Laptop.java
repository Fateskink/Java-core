package Chap_06;

abstract public class Laptop {
	
	public void keyboard() {
		System.out.println("Laptop.keyboard");
	}

	abstract public void mainboard(String fate);

	public void chipset() {
		System.out.println("Laptop.chipset");
	}
}
