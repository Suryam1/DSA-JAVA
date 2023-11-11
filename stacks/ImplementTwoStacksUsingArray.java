package stacks;

public class ImplementTwoStacksUsingArray {

	private int arr[];
	private int top1,top2,capacity;
	public ImplementTwoStacksUsingArray(int capacity) {
		this.capacity=capacity;
		arr=new int[capacity];
		top1=-1;
		top2=capacity;
	}
	public boolean push1(int value){
		if(top1+1<top2){
			arr[++top1]=value;
			return true;
		}else{
			return false;
		}
	}
	public boolean push2(int value){
		if(top1<top2-1){
			arr[--top2]=value;
			return true;
		}else{
			return false;
		}
	}
	public int pop1(){
		if(!isEmpty1()){
			return arr[top1--];
		}
		else{
			throw new IllegalStateException("Stack1 is empty");
		}
	}
	public int pop2(){
		if(!isEmpty2()){
			return arr[top2++];
		}
		else{
			throw new IllegalStateException("Stack2 is empty");
		}
	}
	public int peek1(){
		if(!isEmpty1()){
			return arr[top1];
		}
		else{
			throw new IllegalStateException("Stack1 is empty");
		}
	}
	public int peek2(){
		if(!isEmpty2()){
			return arr[top2];
		}
		else{
			throw new IllegalStateException("Stack2 is empty");
		}
	}
	public boolean isEmpty1(){
		return top1==-1;
	}
	public boolean isEmpty2(){
		return top2==capacity;
	}
	public static void main(String[] args) {
		ImplementTwoStacksUsingArray stack=new ImplementTwoStacksUsingArray(10);
		
		stack.push1(5);
		stack.push1(4);
		stack.push1(3);
		stack.push1(2);
		stack.push1(1);
		
		stack.push2(1);
		stack.push2(2);
		stack.push2(3);
		stack.push2(4);
		stack.push2(5);
		stack.push2(6);      //not added as stack gets full
		
		
		while(!stack.isEmpty1()){
			System.out.print(stack.pop1()+" ");
		}
		
		System.out.println();
		
		while(!stack.isEmpty2()){
			System.out.print(stack.pop2()+" ");
		}
		
	}

}
