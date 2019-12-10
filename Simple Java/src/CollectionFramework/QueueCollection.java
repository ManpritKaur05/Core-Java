package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

//Queue interface follows First In First Out

public class QueueCollection {
	
	public static void main(String[] args) {
		
//		
		Queue<String> q = new PriorityQueue<>(); //it does not orders the elements in FIFO.
		
		//prints alphabet wise
		q.add("Amit");  
		q.add("Vijay");  
		q.add("Karan");  
		q.add("Jai");  
		q.add("Rahul");
		
		System.out.println(q.element()); //it is used to retrieve the head of queue and don't remove
		
		//it is used to retrieve the head of queue but don't remove and returns null if the queue is empty
		System.out.println(q.peek()); 
		
		System.out.println("Elements in queue");
		Iterator<String> itr = q.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(q.remove()); // it retrieves and removes the head of queue
		
		//it retrieves and removes head of queue and if queue is empty it returns null
		System.out.println(q.poll());
		
		System.out.println("Elements in queue after removing two elements");
		Iterator<String> it = q.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		Deque<String> q = new ArrayDeque<>();
//		
//		q.add("Amit");  
//		q.add("Vijay");  
//		q.add("Karan");  
//		q.add("Jai");  
//		q.offerFirst("Rahul");
//		
//		for(String s : q) {
//			System.out.println(s);
//		}
//		
//		q.pollLast();
//		
//		for(String s : q) {
//			System.out.println(s);
//		}
		
	}

}
