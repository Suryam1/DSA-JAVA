package stacks;
import java.util.Iterator;
import java.util.Stack;
public class Example01 {

	public Example01() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stackOfCards=new Stack<>();      //only one constructor and that too default
		stackOfCards.push("Spade 10");
		stackOfCards.push("Ace of Spade");
		stackOfCards.push("Joker");
		
		System.out.println(stackOfCards);
		
		System.out.println(stackOfCards.size());        // inherited from Vector class.
		
		System.out.println(stackOfCards.search("Ace of Spade"));     //return position if present else -1
		while(!stackOfCards.isEmpty()){
			String card=stackOfCards.peek();
			stackOfCards.pop();
			System.out.println(card);
		}
		
		stackOfCards.push("Spade 10");
		stackOfCards.push("Ace of Spade");
		stackOfCards.push("Joker");
		
		Iterator<String> stackIt=stackOfCards.iterator();
		while(stackIt.hasNext()){
			String card=stackIt.next();
			System.out.println(card);
		}

	}

}
