package package3;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		
		//ArrayList ala = new ArrayList(Collection c);
		
		al.add("aj");
		al.add(true);
		al.add(10);
		System.out.println();
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		System.out.println(al.get(1));

		ArrayList<String> strList = new ArrayList<String>();
		

	}

}
