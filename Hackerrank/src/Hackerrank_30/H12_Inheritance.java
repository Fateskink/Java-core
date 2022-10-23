package Hackerrank_30;

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}
}

class Student extends Person {
	private int[] testScores;
	private int sum = 0;
	double avg;

	public Student(String fistname, String lastname, int identification, int[] testScores) {
		super(fistname, lastname, identification);
		this.testScores = testScores;
	}

	public char calculate() {
		for (int i = 0; i < testScores.length; i++) {
			sum += testScores[i];
		}
		avg = sum / (testScores.length);
		if (avg >= 90)
			return 'O';
		else if (80 <= avg)
			return 'E';
		else if (70 <= avg)
			return 'A';
		else if (55 <= avg)
			return 'P';
		else if (40 <= avg)
			return 'D';
		else
			return 'T';
	}
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}