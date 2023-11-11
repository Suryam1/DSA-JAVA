package queue;

public class ArrayImplementation {
	
	private int capacity;
	private int front;
	private int rear;
	private int size;
	private int[] array;

	public ArrayImplementation() {
		// TODO Auto-generated constructor stub
		
		this.capacity=100;
		this.array=new int[capacity];
		this.front=0;
		this.rear=-1;
		this.size=0;
	}
	
	public void enqueue(int item){
		if(isFull()){
			System.out.println("Queue is full");
			return;
		}
		rear++;
		array[rear]=item;
		size++;
	}
	public int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return -1;
		}
		int item=array[front];
		front++;
		size--;
		return item;
	}
	
	public int front(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return -1;
		}
		return array[front];
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	public boolean isFull(){
		return rear==array.length-1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayImplementation q=new ArrayImplementation();
		
		q.enqueue(20);
		q.enqueue(69);
		q.enqueue(30);
		q.enqueue(88);
		
		
		System.out.println("Front of queue: "+q.front());
		
		q.dequeue();
		System.out.println("Front of queue after dequeue: "+q.front()+"\n");
		
		System.out.println("Elements of queue are ");
		while(!q.isEmpty()){
			System.out.println(q.dequeue());
		}

	}

}
