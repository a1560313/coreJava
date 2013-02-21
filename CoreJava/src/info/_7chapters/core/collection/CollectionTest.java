package info._7chapters.core.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("Jay","HYD","Soft"));
		list.add(new Person("Ajay","Ban","Hunter"));
		list.add(new Person("Rajeev","Ori","Govt"));
		list.add(new Person("Padma","Bari","Scientist"));

		//		Collections.sort(list, new NameSort());
		Collections.sort(list, new ProfSort());
		
		Collections.synchronizedList(list);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			Person p = (Person)itr.next();
			if("Ajay".equals(p.getName()))
				itr.remove();
			//System.out.println("CollectionTest.main()" + p);
		}

		for(Person per : list)
			System.out.print(per);
	}

}