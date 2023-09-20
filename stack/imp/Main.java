package stack.imp;


public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack obj = new Stack();
		
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		
		int top =obj.peek();
		System.out.println(top);
		
		System.out.println(obj.isEmpty());
		
		System.out.println(obj.peek());
		
		System.out.println(obj.pop());
		
		System.out.println(obj.peek());
	}

}
