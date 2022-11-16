package package3;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		//TreeSet ts1 = new TreeSet(Comparator c);
		
		SortedSet s = new TreeSet();
		TreeSet ts2 = new TreeSet(s);
		
		HashSet hs = new HashSet();
		TreeSet ts3 = new TreeSet(hs);
		
		TreeSet<Employee> ts4 = new TreeSet<Employee>();
		ts4.add(new Employee("John",30000));
	}

}
