package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class TestQueue {
	/*The queue is maintain 
	 * the order of the insertion 
	 * and the values can be reached by only a 
	 * specific way, the queue is not indexed.*/
	
	public static void main(String[] args) {
			//Linked list maintain the first in first out model(FIFO).
			//Note that this implementation is not synchronized.
			Queue<String> testQueue = new LinkedList<>();
			
			//LinkedList allow null value.
			testQueue.add(null);
			testQueue.add("Two");
			testQueue.add("Three");
			
			//the linked list implements the Iterable interface.
			for (String string : testQueue) {
				System.out.println(string);
			}
			
			System.out.println(testQueue.poll());
			System.out.println(testQueue.poll());
			System.out.println(testQueue.poll());
			
			System.out.println("\n");
		//-------------------------------------------------------------------
			//ArrayDeque can be accessed by both front and end.
			Deque<String> testQueue2 = new ArrayDeque<>();
			
			//ArrayDeque does NOT allow null value.
			testQueue2.add("One");
			testQueue2.add("Two");
			testQueue2.add("Three");
			
			//the ArrayDeque implements the Iterable interface.
			for (String string : testQueue2) {
				System.out.println(string);
			}
			
			System.out.println(testQueue2.poll());
			System.out.println(testQueue2.removeLast());
			System.out.println(testQueue2.poll());
	}
}
