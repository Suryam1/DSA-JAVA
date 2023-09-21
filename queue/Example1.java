package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Example1 {

	public Example1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> waitingQueue = new LinkedList<String>();
		
		waitingQueue.add("Jennifer");
		waitingQueue.add("Angelina");
		waitingQueue.add("Johnny");
		waitingQueue.add("Sachin");
		
		System.out.println("Waiting Queue : "+waitingQueue);
		
		//Check if a queue is empty
		System.out.println("Is waitingQueue emmpty? : "+waitingQueue.isEmpty());
		
		//Find the size of the queue
		System.out.println("Size of Waiting Queue : "+waitingQueue.size());
		
		//Check if a Queue contains an element
		String name = "Johnny";
		if(waitingQueue.contains(name)) {
			System.out.println("Waiting Queue Contains "+name);
		}
		else {
			System.out.println("Waiting Queue doesn't contain "+ name);
		}
		
		//Get the elements at the front of the Queue without removing it using element()
		//The element() method throws NoSuchElementException if the queue is empty
		String firstPersonInTheWiatingQueue = waitingQueue.element();
		System.out.println("Fist Person in the Waiting Queue (element()) : "+firstPersonInTheWiatingQueue);
		
		//Get the element at the front of the queue without removing it using peek()
		//The peek() method is similar to element () except that it returns null if the queue is empty
		firstPersonInTheWiatingQueue = waitingQueue.peek();
		System.out.println("First Person in the Waiting Queue : "+firstPersonInTheWiatingQueue);
		
		/*
		 * Iterating over  a Queue
		 */
		
		Iterator<String> waitingQueueIterator = waitingQueue.iterator();
		while(waitingQueueIterator.hasNext()) {
			String data = waitingQueueIterator.next();
			System.out.println(data);
		}
		System.out.println();
		for(String data:waitingQueue) {
			System.out.println(data);
		}
	}

}
