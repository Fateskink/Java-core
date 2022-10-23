package Chap_08;

public class CourseAV<T1,T2> {
	private String name = "";
	private T1 time;
	private T2 chap;
//	public CourseAV(String name,T1 time, T2 chap) {
//		this.name = name;
//		this.time = time;
//		this.chap = chap;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T1 getTime() {
		return time;
	}
	public void setTime(T1 time) {
		this.time = time;
	}
	public T2 getChap() {
		return chap;
	}
	public void setChap(T2 chap) {
		this.chap = chap;
	}
	
}
