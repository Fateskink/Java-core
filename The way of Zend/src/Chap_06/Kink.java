package Chap_06;

public class Kink extends LaptopAcer implements people, bird {

	@Override
	public void eat() {
		System.out.println("must eat");
	}

	@Override
	public void sleep() {
		System.out.println("must sleep");
	}

	@Override
	public void fly() {
		System.out.println("can fly");
	}

}
