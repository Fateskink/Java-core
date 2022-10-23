package Chap_06;

public class mario implements character {
	@Override
	public void run() {
		System.out.println("mario.run");
	}

	@Override
	public void jump() {
		System.out.println("mario.jump");
	}
}
