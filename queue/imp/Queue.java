package queue.imp;

public class Queue {

	private int capacity;
	private int[] array;
	private int front;
	private int rear;
	private int size;
	
	public Queue() {
		// TODO Auto-generated constructor stub
		System.out.println("QUEUE USING ARRAY");
		
		this.capacity=100;
		this.array=new int[capacity];
		this.front=0;
		this.rear=-1;
		this.size=0;
	}

	public void enqueue(int item) {
		if(isFull()) {
			System.out.println("Queue is Full");
			return ;
		}
		rear++;
		array[rear] = item;
		size++;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int item = array[front];
		front++;
		size--;
		return item;
	}
	
	public int front() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return array[front];
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public boolean isFull() {
		return rear==array.length-1;
	}
	
	public int size() {
		return size;
	}

}
