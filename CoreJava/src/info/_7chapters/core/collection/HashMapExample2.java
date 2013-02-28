package info._7chapters.core.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample2{
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
//		Map map = new HashMap();
		map.put("1", "ONE");
		map.put("2", "TWO");
		map.put("3", "THREE");
		map.put("4", "FOUR");
		map.put("5", "FIVE");
//		map.put("6", new Integer(6));
		
//		Set  entry = map.entrySet();
//		for(Object entObj : entry){
//			Entry ent = (Entry)entObj;
//			System.out.println("Key = "+ ent.getKey() +" Value = "+ent.getValue());
//		}
		Set<Entry<String, String>>  entry = map.entrySet();
		for(Entry<String,String> ent : entry){
			System.out.println("Key = "+ ent.getKey() +" Value = "+ent.getValue());
		}
	}
}