package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;




public class Example01 {

	public Example01() {
		
	}

	public static void main(String[] args) {
		
		//Queue is not a class in JAVA,it's an interface introduced in 1.5
		
		Queue<Integer> q=new LinkedList<>();     //int will give error pass Integer
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		
		System.out.println("is Queue empty: "+q.isEmpty());
		
		System.out.println("size of Queue: "+q.size());
		
		int id=20;
		if(q.contains(id)){
			System.out.println("Found the ele");
		}else{
			System.out.println("Not found");
		}
		
		
		//Get element at front of Queue without removing it using element()
		//The element() will throw NoSuchElementException if Queue is empty
		int g=q.element();
		System.out.println("First ele: "+g);
		
		
		//Get element at front of Queue without removing it using peek()
		//The element() will gives null if Queue is empty
		int h=q.peek();
		System.out.println("First ele: "+h);
		
		q.remove();
		System.out.println("First ele: "+q.peek());
		
		Iterator<Integer> it=q.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		

	}

}
