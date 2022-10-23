package Chap_09;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class P02_randomAccess {
	private static final String filename = "H:\\English\\Ecopy01.txt";

	public static void main(String[] args) {
		writeFile();
		readFile();
	}

	private static void readFile() {
		try {
			RandomAccessFile randomAccessFile = new RandomAccessFile(filename, "r");
			myprint(randomAccessFile.readInt() + "");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void writeFile() {
		try {
			RandomAccessFile randomAccessFile = new RandomAccessFile(filename, "rw");
			randomAccessFile.writeInt(1209);
			randomAccessFile.close();
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
