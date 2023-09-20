package stack;

import java.util.Iterator;
import java.util.Stack;

public class Example1 {

	public Example1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a Stack
		Stack<String> stackOfCards = new Stack<String>();
		
		//Push elements in Stack
		stackOfCards.push("Jack");
		stackOfCards.push("Queen");
		stackOfCards.push("King");
		stackOfCards.push("Ace");
		
		System.out.println("Stack => "+stackOfCards);

		
		//Check if stack is empty
		System.out.println("Is Stack Empty? : "+stackOfCards.isEmpty());
		
		//Find the size of stack
		System.out.println("Size of Stack : "+stackOfCards.size());
		
		//Popping items from the stack
		String cardAtTop = stackOfCards.pop();
		System.out.println("Stack.pop() => "+cardAtTop);
		System.out.println("Current Stack => "+stackOfCards);
		System.out.println();
		
		//Get the item at the top of the stack without removing it
		cardAtTop = stackOfCards.peek();
		System.out.println("Stack.peek() => "+cardAtTop);
		System.out.println("Current Stack => "+stackOfCards);
		
		//Search an Element
		//The Search() method returns the 1-based position of the element from the top of the stack
		//It returns -1 if the element was not found in the stack
		
		int position = stackOfCards.search("Queen");
		if(position!=-1) {
			System.out.println("Found the elent \"Queen\" at position : "+position);
		}
		else {
			System.out.println("Element not Found");
		}
		
		System.out.println(stackOfCards.capacity());
		
		/*
		 * Iterating over a stack
		 */
		
		Iterator<String> cardIterator=stackOfCards.iterator();
		
		while(cardIterator.hasNext()) {
			String card = cardIterator.next();
			System.out.println(card);
		}
	}

}
