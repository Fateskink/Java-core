package Chap_10;

public class Deverloper {
	synchronized void coding() {
		for (int i = 1; i < 5; i++) {
			System.out.println("Coding..."+ i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Finish!-----------------");

	}
}
