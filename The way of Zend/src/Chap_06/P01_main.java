package Chap_06;

import Chap_06.Course.courseOnline;

public class P01_main {
	public static void main(String[] args) {
//		study001();
//		study002();
//		study003();
//		study004();
//		study005();
//		study006();
		study007();
	}

//Abstract class
	private static void study001() {
		Laptop laptopobj = new LaptopDell();
		laptopobj.keyboard();
		laptopobj.mainboard("kink");
		laptopobj.chipset();

		laptopobj = new LaptopAcer();
		laptopobj.keyboard();
		laptopobj.mainboard("the first");
		laptopobj.chipset();
	}

//Interface
	private static void study002() {
		Kink peopleobj = new Kink();
		peopleobj.eat();
		peopleobj.sleep();
		peopleobj.fly();
		peopleobj.chipset();
	}

//equals
	private static void study003() {
		P04_class_object CourseJava = new P04_class_object("Java", 20);
		P04_class_object CoursePHP = new P04_class_object("PHP", 20);
		System.out.println(CourseJava);

		if (CourseJava.equals(CoursePHP)) {
			System.out.println("Bằng nhau");
		} else {
			System.out.println("Không bằng nhau");
		}
//		CourseJava.showInfo();
//		CoursePHP.showInfo();

	}

//Giảm thiểu sự phụ thuộc vào class
	private static void study004() {
		Playstation playobj = new Playstation();
		mario marioobj = new mario();
		fifa fifaobj = new fifa();
		playobj.play(marioobj);
		playobj.play(fifaobj);

	}

	private static void study005() {
		Course coursrObj = new Course();
//		Course.courseOnline courseObj2 = courseObj2.new courseOnline();
	}

//Anonimous class
	private static void study006() {
		people peopleobj = new people() {

			@Override
			public void sleep() {
				// TODO Auto-generated method stub

			}

			@Override
			public void eat() {
				// TODO Auto-generated method stub

			}
		};
	}

	private static void study007() {
		// TODO Auto-generated method stub

	}
}
