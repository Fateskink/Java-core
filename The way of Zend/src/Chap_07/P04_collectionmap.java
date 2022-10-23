package Chap_07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class P04_collectionmap {
	public static void main(String[] args) {
		hashmap();
		System.out.println("===============");
		linkedhashmap();
		System.out.println("===============");
		treemap();
	}

	private static void hashmap() {
		Map mapobj = new HashMap();
		mapobj.put("Kink the 1", "Fate01");
		mapobj.put("Kink the 53", "Fate034");
		mapobj.put("Kink the 31", "Fate41");
		mapobj.put("Kink the 53", "Fate51");
		mapobj.put("Kink the 92", "Fate03");
		mapobj.put("Kink the 2", "Fate0");
		mapobj.put("Kink the 72", "Fate92");
		mapobj.put("Kink the 49", "Fate53");
		mapobj.put("Kink the 17", "Fate82");
		System.out.println(mapobj.toString());
		Iterator itr = mapobj.keySet().iterator();
		while (itr.hasNext()) {
			Object key = itr.next();
			Object value = mapobj.get(key);
			System.out.println(key + " : " + value);
		}
	}

	private static void linkedhashmap() {
		Map mapobj2 = new LinkedHashMap();
		mapobj2.put("Kink the 1", "Fate01");
		mapobj2.put("Kink the 53", "Fate034");
		mapobj2.put("Kink the 31", "Fate41");
		mapobj2.put("Kink the 53", "Fate51");
		mapobj2.put("Kink the 92", "Fate03");
		mapobj2.put("Kink the 2", "Fate0");
		mapobj2.put("Kink the 72", "Fate92");
		mapobj2.put("Kink the 49", "Fate53");
		mapobj2.put("Kink the 17", "Fate82");
		System.out.println(mapobj2.toString());
		Iterator itr = mapobj2.keySet().iterator();
		while (itr.hasNext()) {
			Object key = itr.next();
			Object value = mapobj2.get(key);
			System.out.println(key + " : " + value);

		}
	}

	private static void treemap() {
		Map mapobj3 = new TreeMap();
		mapobj3.put("Kink the_01", "Fate01");
		mapobj3.put("Kink the_53", "Fate034");
		mapobj3.put("Kink the_31", "Fate41");
		mapobj3.put("Kink the_53", "Fate51");
		mapobj3.put("Kink the_92", "Fate03");
		mapobj3.put("Kink the_02", "Fate0");
		mapobj3.put("Kink the_72", "Fate92");
		mapobj3.put("Kink the_49", "Fate53");
		mapobj3.put("Kink the_17", "Fate82");
		System.out.println(mapobj3.toString());
		Iterator itr = mapobj3.keySet().iterator();
		while (itr.hasNext()) {
			Object key = itr.next();
			Object value = mapobj3.get(key);
			System.out.println(key + " : " + value);

		}

	}
}
