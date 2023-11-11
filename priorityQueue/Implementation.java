package priorityQueue;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;

public class Implementation {
	/*
	 * add(int n)
	 * peek
	 * poll  //to delete top value
	 * contains(int n)
	 * remove(int n)
	 * clear()  // to remove all values
	 */

	public Implementation() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> iMinHeapPQ;
		iMinHeapPQ=new PriorityQueue<>();   //by default of size 11
		
//		iMinHeapPQ=new PriorityQueue<>(size,Comparator); 
		
		for(int i=1;i<=11;i++){
			int data=new Random().nextInt(100)+1;
			System.out.print(data+" ");
			iMinHeapPQ.add(data);
		}
		System.out.println("\n"+iMinHeapPQ);
		Iterator<Integer> it=iMinHeapPQ.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		
		
		System.out.println("\n\nNow to store in reverse order");
		
		
		PriorityQueue<Integer> pQ=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=1;i<=11;i++){
			int data=new Random().nextInt(100)+1;
			pQ.add(data);
		}
		System.out.println(pQ);
		
		System.out.println("Size: "+pQ.size());
		System.out.println("Poll: "+pQ.poll());
		System.out.println("Peek: "+pQ.peek());
		System.out.println("Peek: "+pQ.contains(57));
		
		
		

	}

}
