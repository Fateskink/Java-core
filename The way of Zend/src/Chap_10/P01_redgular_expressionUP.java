package Chap_10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.GroupLayout.Group;

public class P01_redgular_expressionUP {
	public static void main(String[] args) {
//		study001();
//		study002();
//		study003();
//		study004();
//		study005();
//		study006();
		study007();
	}

//Pattern vs matches
	private static void study001() {
		String input = "abc_";
		if (input.matches("[A-z_]+")) {
			System.out.println("Dữ liệu hợp lệ");
		} else {
			System.out.println("Dữ liệu không hợp lệ");
		}
//case 2
		Pattern pattern = Pattern.compile("[A-z_]+");
		Matcher matcher = pattern.matcher(input);
		if (matcher.matches()) {
			System.out.println("Dữ liệu hợp lệ");
		} else {
			System.out.println("Dữ liệu không hợp lệ");
		}

// Case 3
		if (Pattern.matches("[A-z_]+", "akd")) {
			System.out.println("Dữ liệu hợp lệ!");
		} else {
			System.out.println("Dữ liệu không hợp lệ!");
		}
	}

//Case_Insensitive	reset
	private static void study002() {
		String input1 = "Fateskink";
		String input2 = "Kink is the 1";
		Pattern pattern = Pattern.compile("FatEs", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(input1);
		if (matcher.matches()) {
			System.out.println("Dữ liệu hợp lệ!");
		} else {
			System.out.println("Dữ liệu không hợp lệ!");
		}

		// lookingAt
		if (matcher.lookingAt()) {
			System.out.println("Dữ liệu hợp lệ");
		} else {
			System.out.println("Dữ liệu không hợp lệ");
		}
//		matcher.reset(input2);
//		if (matcher.matches()) {
//			System.out.println(input2 + "Dữ liệu hợp lệ");
//		} else {
//			System.out.println(input2 + " " + "Dữ liệu không hợp lệ");
//		}
	}

//replaceAll
	private static void study003() {
		String input3 = "Fate is handsome";
		Pattern pattern = Pattern.compile("\\s+");
		Matcher matcher = pattern.matcher(input3);
		System.out.println(matcher.replaceAll("\t"));
	}

//start - end - group
	private static void study004() {
		String input = "Fat--e---is-----handsome";
		Pattern pattern = Pattern.compile("-+");
		Matcher matcher = pattern.matcher(input);
		while (matcher.find()) {
//			matcher.start();
//			matcher.end();
//			matcher.group();
			System.out.printf("Start : \t %s \n", matcher.start());
			System.out.printf("End : \t %s \n", matcher.end());
			System.out.printf("Group : \t %s \n", matcher.group());
			System.out.println("---------------------");

		}

	}

//Đặt tên cho group
	private static void study005() {
		String input = "ntt-1997";
		Pattern pattern = Pattern.compile("[A-z]{3}-(?<id>\\d+)");
		Matcher matcher = pattern.matcher(input);
		System.out.println(matcher.groupCount());
		while (matcher.find()) {
			System.out.println("Group : " + matcher.group("id"));
			System.out.printf("Group : " + matcher.group());

		}
	}

//Giới hạn sự tham ăn
	private static void study006() {
		String input = "Fate > Kink > Handsome";
		Pattern pattern = Pattern.compile("(?<filename>.*?)>");
		Matcher matcher = pattern.matcher(input);
		while (matcher.find()) {
			System.out.println(matcher.group("filename"));
		}
	}

//Exercise
	private static void study007() {
		String input = "Fate=100,E=90,Kink=101";
		Pattern pattern = Pattern.compile("(?<name>[A-z]+)=(?<time>\\d+);?");
		Matcher matcher = pattern.matcher(input);
		Map<String, Integer> courseobj = new HashMap<String, Integer>();
		while (matcher.find()) {
//			System.out.print(matcher.group("name")+"\t");
//			System.out.println(matcher.group("time"));
			
			String name = matcher.group("name");
			Integer time = Integer.parseInt(matcher.group("time")) ;
			courseobj.put(name,time); 
//			System.out.println("---------------");
		}
//		System.out.println(courseobj.toString());
		Iterator<String> itr = courseobj.keySet().iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			Integer value = courseobj.get(key);
			System.out.println(key + " : "+ value);
		}
	}
}
