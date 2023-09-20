package stack.imp;

public class Stack {

	private int capacity;
	private int[] array;
	private int top;
	private int size;
	
	public Stack() {
		// TODO Auto-generated constructor stub
		System.out.println("STACK USING ARRAY");
		
		this.capacity=100;
		this.array=new int[capacity];
		this.top=-1;
	}
	
	public void push(int item) {
		if(isFull()) {
			throw new RuntimeException("Stack is Full");
		}
		array[++top]=item;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty.");
		}
		return array[top--];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==capacity-1;
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return array[top];
	}

}
