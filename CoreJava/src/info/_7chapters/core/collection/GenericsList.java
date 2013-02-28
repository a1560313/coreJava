package info._7chapters.core.collection;

import java.util.ArrayList;
import java.util.List;

public class GenericsList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> listOfString = new ArrayList<String>();
		listOfString.add("hello");
		listOfString.add("how");
		listOfString.add("are");
		listOfString.add("you");
//		listOfString.add(new Integer(10));
		System.out.println("GenericsList.main()" + listOfString);
		
	}
}