package stacks;

import java.util.Arrays;

public class ImplementKStacksUsingArray {
	private int capacity;
	private int k;        //number of stacks
	private int free_slot;
	private int data[];
	private int top[];   //keeps track of top of individual k stacks
	private int next[];  //keeps track of next ele of stack(i.e. ele just below it in stack)
	
	public ImplementKStacksUsingArray(int capacity,int k) {
		this.capacity=capacity;
		this.k=k;
		free_slot=0;
		
		top=new int[k];
		Arrays.fill(top,-1);            //as every stack will be empty
		
		data=new int[capacity];
		
		next=new int[capacity];
		for(int i=0;i<capacity-1;i++){
			next[i]=i+1;
		}
		next[capacity-1]=-1;           //to indicate all are full no more insertions
		
	}
	void push(int stack_number,int element){
		
		if(free_slot==-1){
			throw new StackOverflowError("Stack "+stack_number+" is Full");
		}
		
		int index=free_slot;      //the index where element is to be inserted
		free_slot=next[index];    //updating the free_slot OR tells the position where next element is to be inserted
		next[index]=top[stack_number];  //updates to index of top of that stack OR tells where the prev element is present(needed for pop operation)
		top[stack_number]=index;	//updating the top of particular stack 
		data[index]=element;        //inserting the element
	}
	int pop(int stack_number){
		
		if(top[stack_number]==-1){
			throw new StackOverflowError("Stack "+stack_number+" is Empty");
		}
		
		int pop_index=top[stack_number];     //to get the index of top element of the particular stack
		top[stack_number]=next[pop_index]; //updating the top of the stack to get the new element at the top
		next[pop_index]=free_slot;         //updating the position where we are having next free space in next[]
		free_slot=pop_index;				//updating the free_slot OR tells where next element is to be inserted(needed for push operation)
		return data[pop_index];				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImplementKStacksUsingArray stack=new ImplementKStacksUsingArray(10, 3);
		stack.push(1, 10);
		stack.push(1, 20);
		stack.push(1, 30);
		stack.push(0, 1);
		stack.push(2, 4);
		stack.push(0, 3);
		stack.push(2, 5);
		
		//0: 3 1
		//1: 30 20 10
		//2: 5 4
		
		System.out.println(stack.pop(0));
		System.out.println(stack.pop(0));
		System.out.println(stack.pop(1));
		System.out.println(stack.pop(1));
		System.out.println(stack.pop(1));
		System.out.println(stack.pop(2));
		System.out.println(stack.pop(2));
		

		System.out.println(stack.pop(0));    //exception as stack 0 is empty
		
	}

}
