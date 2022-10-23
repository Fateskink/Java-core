package Chap_02;

public class P_01_main {

	public static void main01(String[] args) {
		/*
		 * P_02_Student studentOne = new P_02_Student("Kink", "66cdca", 1997);
		 * P_02_Student studentTwo = new P_02_Student("Fate", "66ca", 1997);
		 * P_03_Teacher Teacher = new P_03_Teacher("E.Kink", "69", 1987);
		 */
		P_04_Person Person = new P_04_Person();
		P_02_Student studentOne = new P_02_Student();
		P_02_Student studentTwo = new P_02_Student();
		P_03_Teacher Teacher = new P_03_Teacher();

		studentOne.setBirthday(1997);
		studentOne.setName("Kink");
		studentOne.setCode("66DCCA23238");

		studentTwo.setBirthday(1997);
		studentTwo.setName("Fate");
		studentTwo.setCode("66DCCA23239");

		studentOne.showInfo();

		System.out.println("-----------------------");

		studentTwo.showInfo();

		System.out.println("-----------------------");

		Teacher.showInfo();

		System.out.println("-----------------------");
	}

}
