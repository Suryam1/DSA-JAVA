package linkedList.Single;

public class LinkedList {
	
	//Node Class
	class Node {

		int data;
		Node next;
		
		public Node(int x) {
			// TODO Auto-generated constructor stub
			this.data=x;
			this.next=null;
		}

	}
	Node head;
	Node tail;

	public LinkedList() {
		head = null;
		tail=null;
	}
	
	//Add a Node Start
	public Node insertAtStart(int x) {
		Node newNode = new Node(x);
		if(head==null) {
			tail=newNode;
		}
		newNode.next=head;
		head=newNode;
		return head;
	}
	
	//Add a Node End
	public Node insertAtEnd(int x) {
		Node newNode = new Node(x);
		if(head==null) {
			head=newNode;
			tail=newNode;
			return head;
		}
		tail.next=newNode;
		tail=newNode;
		return head;
	}
	
	//Delete a Node Start
	public Node deleteAtStart() {
		if(head==null) {
			return null;
		}
		Node temp = head;
		head=head.next;
		return head;
	}
	

	
	public void show() {
		Node node = head;
		while(node!=null) {
			System.out.print(node.data+"->");
			node=node.next;
		}
		System.out.println("NULL");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList obj = new LinkedList();
		
		obj.insertAtStart(40);
		obj.insertAtStart(30);
		obj.insertAtStart(20);
		obj.insertAtStart(10);
		
		obj.show();
		
		obj.deleteAtStart();
		
		obj.show();
		
		obj.insertAtEnd(50);
		obj.insertAtEnd(60);
		obj.insertAtEnd(70);
		obj.insertAtEnd(80);
		
		obj.show();
	}

}
