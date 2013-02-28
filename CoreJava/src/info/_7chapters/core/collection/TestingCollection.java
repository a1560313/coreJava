package info._7chapters.core.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestingCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List list = new LinkedList();
		list.add("ONE");
		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		list.add("FOUR");
		System.out.println("LinkedList.main()" + list);
		System.out.println("LinkedList.main()" + list.get(3));
		list.remove(3);
		System.out.println("LinkedList.main()" + list);
		
		list = new ArrayList();
		list.add("ONE");
		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		list.add("FOUR");
//		list.add(new Integer(200));
		
		System.out.println("TestingCollection.main()"+ list);
		System.out.println("TestingCollection.main()" + list.get(3));
		list.remove(3);
		list.add(3, "NINE");
		
		System.out.println("TestingCollection.main()"+ list);
		/*
//		Collections.sort(list);
		
		System.out.println("TestingCollection.main()"+ list);
		
		for(Object j : list){
			System.out.println("TestingCollection.main()" + ((String)j));
		}
		
		System.out.println("TestingCollection.main()"+ list);
		
		
		Set set = new HashSet();
		set.add("ONE");
		set.add("TWO");
		set.add("THREE");
		set.add("FOUR");
		set.add("FIVE");
		System.out.println("HashSet=========" + set);
		
		set = new TreeSet();
		set.add("ONE");
		set.add("TWO");
		set.add("THREE");
		set.add("FOUR");
		set.add("FIVE");
		
		System.out.println("TreeSet==============" + set);
		/*Map map = new HashMap();
		map.put("1", "TEN");
		map.put("2", "TWO");
		map.put("3", "THREE");
		map.put("4", "FOUR");
		map.put("4", "2ndFour");
		map.put(null, null);
		map.put(null, null);
		
		System.out.println("HashMap=" + map);
		
		System.out.println("HashMap==========" + map.get("4"));
		
		Map tmap = new Hashtable();
		tmap.put("1", "ONE");
		tmap.put("2", "TWO");
		tmap.put("3", "THREE");
		tmap.put("4", "FOUR");
		tmap.put("", "");
//		tmap.put("", null); // No Room for null key or null value
		
		System.out.println("HashTable==========" + map);
		*/
	}

}
