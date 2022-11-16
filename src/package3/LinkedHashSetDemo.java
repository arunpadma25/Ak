package package3;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		//default capacity 16 
		LinkedHashSet lhs = new LinkedHashSet();
		
		//specified capacity
		LinkedHashSet lhs1 = new LinkedHashSet(30);
		
		//specified capacity and specified load factor
		LinkedHashSet lhs2 = new LinkedHashSet(20,1.00f);
		
	}

}
