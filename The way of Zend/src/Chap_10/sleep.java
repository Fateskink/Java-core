package Chap_10;

public class sleep extends Thread {
	@Override
	public void run() {
		while (P02_thread.isRunning()) {
			System.out.println("Sleep....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
