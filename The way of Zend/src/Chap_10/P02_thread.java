package Chap_10;

import java.util.Scanner;

public class P02_thread {
	private static boolean running = true;

	public static boolean isRunning() {
		return running;
	}

	public static void setRunning(boolean running) {
		P02_thread.running = running;
	}

	public static void main(String[] args) {
		System.out.println("hello thread");
//		star01();
//		study001();
//		study002();
//		study003();
//		study004();
		study005();

//		for (int i = 0; i < 10; i++) {
//			System.out.println("Fate");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

	}

	private static void star01() {
		Scanner sc = new Scanner(System.in);
		String inputstr = null;
		System.out.println("Enter y to stop...");
		inputstr = sc.nextLine();
		if (inputstr.equalsIgnoreCase("y")) {
			running = false;
		}
		sc.close();
	}

	private static void study005() {
		Project[] projects = new Project[5];
		Deverloper deverloper = new Deverloper();
		projects[0] = new Project(deverloper);
		projects[1] = new Project(deverloper);
		projects[2] = new Project(deverloper);
		projects[3] = new Project(deverloper);
		projects[4] = new Project(deverloper);
		projects[0].start();
		projects[1].start();
		projects[2].start();
		projects[3].start();
		projects[4].start();
	}

	private static void study004() {
		sleep sleep01 = new sleep();
		sleep01.start();

	}

	private static void study003() {
		deamon deamonthread = new deamon();
		deamonthread.setDaemon(true);
		deamonthread.start();
	}

	private static void study002() {

		Thread thread = new Thread(new check());
		thread.start();
	}

	private static void study001() {
		P021_Userinput userinputthread = new P021_Userinput();
		userinputthread.start();

	}
}
