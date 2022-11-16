package package3;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		//specified capacity
		Vector vec = new Vector(60);
		
		//specified capacity and incremental capacity
		Vector vec1 = new Vector(100,5);
		
		
		//Vector vec2 = new Vector(Collection c);
		
		v.add(10);
		v.addElement("Hello");
		System.out.println(v);
		
		v.remove(0);
		System.out.println(v);
		System.out.println(v.elementAt(0));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.get(0));
		
	}

}
