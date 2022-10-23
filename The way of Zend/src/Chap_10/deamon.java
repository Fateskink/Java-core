package Chap_10;

public class deamon extends Thread {
@Override
public void run() {
while (1==1) {
	System.out.println("Thread deamon");
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
}
