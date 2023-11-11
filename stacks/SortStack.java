package stacks;

import java.util.Stack;

public class SortStack {

	public SortStack() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Stack<Integer> s=new Stack<>();
		
		//adding ele to stack
		s.push(6);
		s.push(1);
		s.push(8);
		s.push(3);
		s.push(7);
		s.push(2);
		s.push(5);
		
		//sorting the stack
		Stack<Integer> temp_stack=new Stack<>();
		while(!s.isEmpty()){
			int currPoppedValue=s.pop();
			
			while(!temp_stack.empty()&&temp_stack.peek()>currPoppedValue){
				s.push(temp_stack.pop());
			}
			temp_stack.push(currPoppedValue);
		}
		//filling original stack
		while(!temp_stack.empty()){
			s.push(temp_stack.pop());
		}
		
		//printing 
		while(!s.empty()){
			System.out.println(s.pop());
		}
		
		
		/*        Original 												Temp
		 *top->                                                          <-top
		 * 5,2,7,3,8,1,6
		 * 2,7,3,8,1,6													5
		 * 5,7,3,8,1,6													2
		 * 7,3,8,1,6													2,5
		 * 3,8,1,6														2,5,7
		 * 5,7,8,1,6													2,3
		 * 7,8,1,6														2,3,5
		 * 8,1,6														2,3,5,7
		 * 1,6															2,3,5,7,8
		 * 2,3,5,7,8,6													1
		 * 3,5,7,8,6													1,2
		 * 5,7,8,6														1,2,3
		 * 7,8,6														1,2,3,5
		 * 8,6															1,2,3,5,7
		 * 6															1,2,3,5,7,8
		 * 7,8															1,2,3,5,6
		 * 8															1,2,3,5,6,7
		 * Empty														1,2,3,5,6,7,8
		 */

	}

}
