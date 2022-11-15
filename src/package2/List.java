package package2;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listStrings = new ArrayList<String>();
		listStrings.add("One");
		listStrings.add("Two");
		
		System.out.println(listStrings);
		
		List<Object> listAnything = new ArrayList<Object>();
		List<String> listWords = new ArrayList<String>();
		List<Integer> listNumbers = new ArrayList<Integer>();
		List<String> linkedWords = new LinkedList<String>();
		
		List<Integer> listNumbers2 = new ArrayList<>();
		List<String> linkedWords2 = new LinkedList<>();
		
		List<Number> linkedNumbers = new LinkedList<>();
		linkedNumbers.add(new Integer(123));
		linkedNumbers.add(new Float(3.1415));
		linkedNumbers.add(new Double(299.988));
		linkedNumbers.add(new Long(67000));
		
		LinkedList<Number> numbers = new LinkedList<Number>();
		
		Number first = numbers.getFirst();
		Number last = numbers.getLast();
		
		List<String> listStrings = new ArrayList<String>();
		listStrings.add("D");
		listStrings.add("C");
		listStrings.add("E");
		listStrings.add("A");
		listStrings.add("B");
		System.out.println("listStrings before sorting: " + listStrings);
		Collections.sort(listStrings);
		System.out.println("listStrings after sorting: " + listStrings);
	}

}
