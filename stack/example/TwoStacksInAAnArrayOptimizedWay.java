package stack.example;

/*
 *Store the value of the two stacks in an array such that both stacks use same array for storing elements.
 *
 * Create 4 Methods -
 * 
 * push1(int x)
 * push2(int x)
 * pop1()
 * pop2()
 * 
 */

public class TwoStacksInAAnArrayOptimizedWay {

	private int[] arr;
	private int top1;//Top of Stack 1
	private int top2;//Top of Stack 2
	
	public TwoStacksInAAnArrayOptimizedWay(int capacity) {
		// TODO Auto-generated constructor stub
		arr = new int [capacity];
		top1=-1;
		top2=capacity;
	}
	
	public boolean push1(int value) {
		if(top1 + 1<top2) {
			arr[++top1]=value;
			return true;
		}
		else {
			return false;
		}
	}

	public boolean push2(int value) {
		if(top2-1>top1) {
			arr[--top2]=value;
			return true;
		}
		else {
			return false;
		}
	}
	
	public int pop1() {
		if(!isEmpty1()) {
			return arr[top1--];
		}
		else {
			throw new IllegalStateException("Stack 1 is Empty");
		}
	}
	

	public int pop2() {
		if(!isEmpty2()) {
			return arr[top2++];
		}
		else {
			throw new IllegalStateException("Stack 1 is Empty");
		}
	}
	
	public boolean isEmpty1() {
		// TODO Auto-generated method stub
		return top1==-1;
	}
	public boolean isEmpty2() {
		// TODO Auto-generated method stub
		return top2==arr.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
