package Chap_09;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class P04_FileStream {
	private static final String filename = "H:\\English\\DES\\FileStream.txt";

	public static void main(String[] args) {
//		myprint("FileStream");
//		writeFile(" Exactly, truely handsome \n");
//		readFile();
//		String pathA = "H:\\English\\DES\\pathA.jpg";
//		String pathB = "H:\\English\\DES\\pathA_copy.jpg";
//		copyfile(pathA, pathB);
//		writefilewithbuffer("Fucking handsome");
//		myprint(readFilewithbuffer());
		writeLine(null);
		myprint(readline());
	}

	public static String readFile() {
		StringBuffer stringbuffer = new StringBuffer();
		try {
			FileInputStream fileInputStream = new FileInputStream(filename);
			int i = 0;
			while ((i = fileInputStream.read()) != -1) {
				myprint((char) i + "");
				stringbuffer.append((char) i);
			}
//			fileInputStream.write(data.getBytes());
			fileInputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stringbuffer.toString();
	}

	public static void copyfile(String pathA, String pathB) {
		try {
			FileInputStream fileInputStream = new FileInputStream(pathA);
			FileOutputStream fileOutputStream = new FileOutputStream(pathB);
			int i = 0;
			while ((i = fileInputStream.read()) != -1) {
				fileOutputStream.write((byte) i);
			}
			fileOutputStream.close();
			fileInputStream.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void writeFile(String data) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(filename, true);
			fileOutputStream.write(data.getBytes());
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void writefilewithbuffer(String data) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(filename, false);
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			bufferedOutputStream.write(data.getBytes());
			bufferedOutputStream.flush();
			bufferedOutputStream.close();
			fileOutputStream.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String readFilewithbuffer() {
		StringBuffer stringbuffer = new StringBuffer();
		try {
			FileInputStream fileInputStream = new FileInputStream(filename);
			BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
			int i = 0;
			while ((i = bufferedInputStream.read()) != -1) {
				myprint((char) i + "");
				stringbuffer.append((char) i);
			}
//			fileInputStream.write(data.getBytes());
			bufferedInputStream.close();
			fileInputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stringbuffer.toString();
	}

	public static void filewriter(String data) {
		try {
			FileWriter fileWriter = new FileWriter(filename, true);
			fileWriter.write(data);
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String readfile() {
		StringBuffer stringbufer = new StringBuffer();
		FileReader fileReader;
		try {
			fileReader = new FileReader(filename);
			int i = 0;
			while ((i = fileReader.read()) != -1) {
				stringbufer.append((char) i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stringbufer.toString();
	}

	public static void writeLine(String data) {
		FileWriter fileWriter;
		PrintWriter printWriter;
		try {
			fileWriter = new FileWriter(filename, true);
			printWriter= new PrintWriter(fileWriter);
			printWriter.println("Fate");
			printWriter.println("E.Kink");
			
//			fileWriter.write(data);
			printWriter.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String readline() {
		StringBuffer stringBuffer = new StringBuffer();
		try {
			FileReader fileReader = new FileReader(filename);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = null;
			while((line = bufferedReader.readLine())!=null) {
				stringBuffer.append(line).append(System.getProperty("line.separator"));
			}
			bufferedReader.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stringBuffer.toString();
			
		
	}
	
	public static void myprint(String content) {
		System.out.println(content);
	}
}
