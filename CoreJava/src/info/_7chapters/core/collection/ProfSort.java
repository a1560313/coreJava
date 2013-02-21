package info._7chapters.core.collection;

import java.util.Comparator;

public class ProfSort implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		return (((Person)o1).getProfession()).compareTo(((Person)o2).getProfession());
	}
}