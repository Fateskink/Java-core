package Chap_06;

public class P04_class_object {
	private String Name = "";
	private int Time;

	public P04_class_object(String Name, int Time) {
		this.setName(Name);
		this.setTime(Time);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getTime() {
		return Time;
	}

	public void setTime(int time) {
		Time = time;
	}

	@Override
	public String toString() {
		String result = "Course Info: \n" + "Name: " + this.getName() + "\n" + "Time: " + this.getTime();
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		P04_class_object courseobj = (P04_class_object)obj;
		if(this.getTime() == courseobj.getTime()) return true;
		return false;
	}
//public void showInfo() {
//	System.out.println("Course Info : ");
//	System.out.println("Name : " + this.getName());
//	System.out.println("Time : "+ this.getTime());
//}
}
