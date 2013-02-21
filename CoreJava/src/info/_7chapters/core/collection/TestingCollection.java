package info._7chapters.core.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TestingCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		list.add("FOUR");
		
		System.out.println("TestingCollection.main()"+ list);
		
		Collections.sort(list);
		
		System.out.println("TestingCollection.main()"+ list);
		
		Set set = new TreeSet();
		set.add("ONE");
		set.add("ONE");
		set.add("TWO");
		set.add("AND");
		
		System.out.println("TestingCollection.main()" + set);
		
		
		Map map = new HashMap();
		map.put("1", "ONE");
		map.put("2", "TWO");
		map.put("3", "THREE");
		map.put("4", "FOUR");
		map.put(null, null);
		map.put(null, null);
		
		
		System.out.println("HashMap=" + map);
		
		System.out.println("TestingCollection.main()" + map.get("1"));
		
		map = new Hashtable();
		map.put("1", "ONE");
		map.put("2", "TWO");
		map.put("3", "THREE");
		map.put("4", "FOUR");
		map.put("", "");
		
		System.out.println("HashTable" + map);
	}

}
