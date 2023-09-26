package stack.example;

import java.util.Stack;

public class SortAStack {
	
	private Stack<Integer> stack;

	public SortAStack() {
		// TODO Auto-generated constructor stub
		this.stack = new Stack<Integer>();
	}
	
	public void addValuesInStack() {
		stack.add(5);
		stack.add(2);
		stack.add(7);
		stack.add(3);
		stack.add(8);
		stack.add(1);
		stack.add(6);
	}
	
	public Stack<Integer> getStack(){
		return stack;
	}
	
	public void sortStack(Stack<Integer> stack) {
		Stack<Integer> temp_stack = new Stack<Integer>();
		while(!stack.empty()) {
			int currentPoppedValue = stack.pop();
			while(!temp_stack.empty()&&temp_stack.peek()>currentPoppedValue) {
				stack.push(temp_stack.pop());
			}
			temp_stack.push(currentPoppedValue);
		}
		while(!temp_stack.empty()) {
			stack.push(temp_stack.pop());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortAStack obj = new SortAStack();
		obj.addValuesInStack();
		obj.sortStack(obj.getStack());
		System.out.println(obj.getStack());
	}

}
/*		Original																Temp
 * 	5,2,7,3,8,1,6																5
 * 	2,7,3,8,1,6																	2
 * 	5,7,3,8,1,6																	2,5
 * 	7,3,8,1,6																	2,5,7
 * 	3,8,1,6																		2,3
 * 	5,7,8,1,6																	2,3,5
 * 	7,8,1,6																		2,3,5,7
 * 	8,1,6																		2,3,5,7,8
 * 	1,6																			1
 * 	2,3,5,7,8,6																	1,2
 * 	3,5,7,8,6																	1,2,3
 * 	5,7,8,6																		1,2,3,5
 * 	7,8,6																		1,2,3,5,7
 * 	8,6																			1,2,3,5,7,8
 * 	6																			1,2,3,5,6
 * 	7,8																			1,2,3,5,6,7
 * 	8																			1,2,3,5,6,7,8
 * 	Empty
 */	


