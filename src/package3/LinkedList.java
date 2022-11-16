package package3;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l = new LinkedList();
		//LinkedList ll = new LinkedList(Collection c);

		//l.add("ak");
		//l.add("aj");
		//l.add(true);
		//l.add(10);
		l.set(1, 13);
		l.add(2, true);
		System.out.println(l);
		l.removeLast();
		System.out.println(l);

		l.addFirst(l);
		System.out.println(l);

		
		
	}

}
