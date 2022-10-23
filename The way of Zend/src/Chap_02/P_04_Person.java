package Chap_02;

import java.util.Calendar;

public class P_04_Person {
	public String name;
	public String code;
	public int birthday;
	// CONTRUCSTOR
	/*
	 * public P_04_Person(String name, String code, int birthday) { super();
	 * this.name = name; this.code = code; this.birthday = birthday; }
	 */
	// GETTER - SETTER AUTO-TOOL-RIGHT CLICK SOURSE (Alt + Shift + S)

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.YEAR) - this.getBirthday();

	}
	// Show student info

	public void showInfo() {
		System.out.println("Name : " + this.getName());
		System.out.println("Code : " + this.getCode());
		System.out.println("DoB  : " + this.getBirthday());
		System.out.println("Age  : " + this.getAge());
	}
}
