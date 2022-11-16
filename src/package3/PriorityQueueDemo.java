package package3;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		//default size is 11
		
		//with specified size
		PriorityQueue pq1 = new PriorityQueue(20);
		SortedSet s = new TreeSet();
		PriorityQueue pq3 = new PriorityQueue(s);
		List l = new ArrayList();
		PriorityQueue pq4 = new PriorityQueue(l);
		
	}

}
