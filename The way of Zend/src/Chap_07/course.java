package Chap_07;

public class course implements Comparable {
	private String Name = "";
	private int Time;

	public course(String Name, int Time) {
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
		// TODO Auto-generated method stub
		return this.getName() + " - " + this.getTime();
	}

	@Override
	public int compareTo(Object o) {
		course courseobj = (course) o;
		if(this.getTime()> courseobj.getTime()) return 1;
		else if(this.getTime() < courseobj.getTime())return -1;
		return 0;
	}
}
