package info._7chapters.core.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		List<String> listOne = new ArrayList<String>();
//		listOne.add("ONE");
//		listOne.add("NINE");
//		listOne.add("TWO");
//		listOne.add("THREE");
//		listOne.add("FOUR");
//		
//		System.out.println("LinkedList.main() Before sort =" + listOne);
//		Collections.sort(listOne);
//		System.out.println("LinkedList.main() After Sort = " + listOne);
//		System.out.println("================================================");
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("Jay","HYD","Soft"));
		list.add(new Person("Ajay","Ban","Hunter"));
		list.add(new Person("Rajeev","Ori","Govt"));
		list.add(new Person("Padma","Bari","Scientist"));
		
		System.out.println("list of Persons before sorting = \n"+ list);
		
		Collections.sort(list);
		
		System.out.println("list of Persons After Normal sorting = \n"+ list);
		
		Collections.sort(list, new ProfSort());

		System.out.println("list of Persons After Profession sorting = \n"+ list);
		
		Collections.synchronizedList(list);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			Person p = (Person)itr.next();
			if("Ajay".equals(p.getName()))
				itr.remove();
			System.out.println("CollectionTest.main()" + p);
		}
		
//		System.out.println("Before sorting");
//		for(Person per : list)
//			System.out.print(per);
//
//		Collections.sort(list);
//		
//		System.out.println("after sorting =================");
//		for(Person per : list)
//			System.out.print(per);
	}

}