package package3;


import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push(10);
		s.push(30);
		s.push(true);
		Object o = s.pop();
		System.out.println(s);
		Object obj=s.peek();
		System.out.println(obj);
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.search(10));
	}

}
