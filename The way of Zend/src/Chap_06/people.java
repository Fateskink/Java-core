package Chap_06;

public interface people {
	public void eat();

	public void sleep();

	public default void defaultAbstract() {
		System.out.println("deAbstract");
	}

	public static void staticAbstract() {
		System.out.println("staAbstract");
	}
}
