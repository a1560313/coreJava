package info._7chapters.core.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person per = new Person("Jayram","HYD","SW");
		
		List<Person> person = new ArrayList<>();
		person.add(new Person("Jay","HYD","SW"));
		person.add(new Person("Bob","ORI","GOVT"));
		person.add(new Person("Raju","US","Eng"));
		person.add(new Person("Dis","GAR","Kid"));
		person.add(new Person("Ram","Ku","BA"));
		
		System.out.println("GenericsExample.main()" + person);
	}
}
