package package3;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		s.add(5);
		s.add(10);
		s.add(2);
		s.add(1);
		s.add(3);
		s.add(7);
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet(3));
		System.out.println(s.tailSet(3));
		System.out.println(s.subSet(3,7));
		System.out.println(s.comparator());
	
	}

}
