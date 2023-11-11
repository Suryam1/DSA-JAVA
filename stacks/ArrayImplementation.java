package stacks;

public class ArrayImplementation {
	
	private int capacity;
	private int[] array;
	private int top;

	public ArrayImplementation() {
		// TODO Auto-generated constructor stub
		System.out.println("STACK USING ARRAY");
		
		this.capacity=100;
		this.array=new int[capacity];
		this.top=-1;
	}
	
	public void push(int item){
		if(isFull()){
			throw new RuntimeException("Stack is full");
		}
		array[++top]=item;
	}
	
	public int pop(){
		if(isEmpty()){
			throw new RuntimeException("Stack is empty");
		}
		return array[top--];
	}
	
	public boolean isFull(){
		return top==capacity;
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public int peek(){
		if(isEmpty()){
			throw new RuntimeException("Stack is empty");
		}
		return array[top];
	}
	
	public static void main(String[] args){
		
		ArrayImplementation obj=new ArrayImplementation();
		
		obj.push(10);
		obj.push(16);
		obj.push(100);
		obj.push(31);
		
		System.out.println(obj.peek());
		
		obj.pop();
		System.out.println(obj.peek()+"\n");
		
		System.out.println("Elements of stack are");
		while(!obj.isEmpty()){
			System.out.println(obj.pop());
		}
		
	}

}
