package Chap_07;

import java.util.Comparator;

public class time08 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		course courseobj1 = (course) o1;
		course courseobj2 = (course) o2;
		if (courseobj1.getTime() > courseobj2.getTime())
			return 1;
		else if (courseobj1.getTime() < courseobj2.getTime())
			return -1;
		return 0;
		//so sánh bằng tên theo alphabet
		//return courseobj1.getName().compareTo(courseobj2.getName());
	}

}
