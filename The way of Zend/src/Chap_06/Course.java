package Chap_06;

public class Course {
	private String name = "";
	private int time;
	static int chap;

	static class staticclass {
		public void showinfo() {
			System.out.println(chap);
//			System.out.println(time);
		}
	}
}

class courseOnline {
	private double cost = 20;

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void showOnlineinfo() {
		System.out.println("Price: " + this.getCost());
	}

	

	public void showinfo() {
		System.out.println();
	}

}
