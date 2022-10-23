package Chap_10;

public class Project extends Thread {
	Deverloper deverlopers;

	public Project(Deverloper deverlopers) {
		this.deverlopers = deverlopers;
	}

	@Override
	public void run() {
		this.deverlopers.coding();
	}
}
