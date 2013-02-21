package info._7chapters.core.collection;

import java.util.Comparator;

public class NameSort implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		return (((Person)o1).getName()).compareTo(((Person)o2).getName());
	}
}