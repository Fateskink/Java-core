package Chap_09;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class P03_randomAccess_Ex1 {
	private static final String filename = "H:\\English\\DES\\Ran02.dat";
	private static final String String = null;
	private static RandomAccessFile randomAccessFile;
	private static String name = null;
	private static int score = 0;
	private static int student_size = 36;
	private static String searchname;
	private static int valueScore;

	public static void main(String[] args) {
//		userInput();
//		writeFile(name, score);
//		listFile();
//		myprint(getname(searchname));
//		update(searchname, valueScore);
	}

	private static void userInput() {
		Scanner sc = new Scanner(System.in);
		myprint("Name : ");
		name = sc.next();
		myprint("Score : ");
		score = sc.nextInt();
		sc.close();

	}

	private static void writeFile(String name, int score) {
		// RandomAccessFile
		try {
			randomAccessFile = new RandomAccessFile(filename, "rw");

			// đặt vị trí con trỏ
			long filesize = randomAccessFile.length();
			// lấy vị trí con trỏ đặt ở đầu chuỗi để không bị ghi đè dữ liệu
			randomAccessFile.seek(filesize);
			randomAccessFile.writeUTF(name);

			for (int i = 0; i < 30 - name.length(); i++)
				randomAccessFile.writeByte(30);
			randomAccessFile.writeInt(score);
			randomAccessFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void update(String searchname, int valueScore) {
		Scanner sc = new Scanner(System.in);
		myprint("Name : ");
		searchname = sc.next();
		myprint("Score : ");
		valueScore = sc.nextInt();
		sc.close();

		try {
			randomAccessFile = new RandomAccessFile(filename, "rw");
			int totalstudent = (int) randomAccessFile.length() / student_size;
			for (int i = 0; i < randomAccessFile.length() / student_size; i++) {
				String studentName = randomAccessFile.readUTF();
				for (int j = 0; j < 30 - studentName.length(); j++)
					randomAccessFile.readByte();
//				int studentScore = randomAccessFile.readInt();

				if (studentName.equalsIgnoreCase(searchname)) {
					randomAccessFile.writeInt(valueScore);

//					strResult.append(studentName).append(" : ").append(studentScore).append("\n");
					myprint((i + 1) + "." + searchname + " : " + valueScore);
				} else {
					randomAccessFile.readInt();
				}

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//getname để tìm kiếm thông tin	
	private static String getname(String searchname) {
		Scanner sc = new Scanner(System.in);
		myprint("Name : ");
		searchname = sc.next();
		StringBuilder strResult = new StringBuilder();
		try {
			randomAccessFile = new RandomAccessFile(filename, "r");
			int totalstudent = (int) randomAccessFile.length() / student_size;
			for (int i = 0; i < randomAccessFile.length() / student_size; i++) {
				String studentName = randomAccessFile.readUTF();
				for (int j = 0; j < 30 - studentName.length(); j++)
					randomAccessFile.readByte();
				int studentScore = randomAccessFile.readInt();

				if (studentName.equalsIgnoreCase(searchname)) {
					strResult.append(studentName).append(" : ").append(studentScore).append("\n");
//					myprint((i+1)+"."+ studentName + " : "+ studentScore);
				}

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return strResult.toString();
	}

	private static void listFile() {
		try {
			randomAccessFile = new RandomAccessFile(filename, "r");
			int totalstudent = (int) randomAccessFile.length() / student_size;
			for (int i = 0; i < randomAccessFile.length() / student_size; i++) {
				String studentName = randomAccessFile.readUTF();
				for (int j = 0; j < 30 - studentName.length(); j++)
					randomAccessFile.readByte();
				int studentScore = randomAccessFile.readInt();
				myprint((i + 1) + "." + studentName + " : " + studentScore);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void myprint(String content) {
		System.out.println(content);

	}
}
