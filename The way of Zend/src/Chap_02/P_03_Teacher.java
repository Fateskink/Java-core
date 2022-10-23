package Chap_02;

import java.util.Calendar;

public class P_03_Teacher extends P_04_Person {

	public double salary;
	// CONTRUCSTOR
	/*
	 * public P_03_Teacher(String name, String code, int birthday) { super();
	 * this.name = name; this.code = code; this.birthday = birthday; }
	 */

	// GETTER - SETTER AUTO-TOOL-RIGHT CLICK SOURSE (Alt + Shift + S)

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	// Show teacher info

}
