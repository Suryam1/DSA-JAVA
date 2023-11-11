package linkedlist.circularList;


public class CircularLinkedList {

	class Node{
		int data;
		Node next;
		
		Node(int x){
			data=x;
			next=null;
		}
	}
	
	Node head;

	public CircularLinkedList() {
		head=null;
	}
	
	public Node insertAtHead(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
			newNode.next=head;
			return head;
		}
		Node curr=head;
		while(curr.next!=head){
			 curr=curr.next;
		}
		curr.next=newNode;
		newNode.next=head;
		head=newNode;
		return head;
	}
	
	public Node insertAtEnd(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
			newNode.next=head;
			return head;
		}
		Node curr=head;
		while(curr.next!=head){
			curr=curr.next;
		}
		curr.next=newNode;
		newNode.next=head;
		return head;
	}
	
	public Node deleteAtHead(){
		if(head.next==head){
			head=null;
			return head;
		}
		Node curr=head;
		while(curr.next!=head){
			curr=curr.next;
		}
		curr.next=null;
		head=head.next;
		curr.next=head;
		return head;
	}
	public Node deleteAtEnd(){
		if(head.next==head){
			head=null;
			return head;
		}
		Node curr=head;
		while(curr.next.next!=head){
			curr=curr.next;
		}
		curr.next=head;
		return head;
	}
	
	public void traversal(){
		if(head==null){
			System.out.println("List is empty");
			return;
		}
		Node curr=head;
		System.out.print("head->");
		do{
			System.out.print(curr.data+"->");
			curr=curr.next;
		}while(curr!=head);
		System.out.println("head");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList obj=new CircularLinkedList();
		
		obj.insertAtHead(40);
		obj.insertAtHead(30);
		obj.insertAtHead(20);
		obj.insertAtHead(10);
		
		
		obj.insertAtEnd(50);
		obj.insertAtEnd(60);
		obj.insertAtEnd(70);
		obj.insertAtEnd(80);
		
		obj.traversal();
		
		obj.deleteAtHead();
		obj.deleteAtEnd();
		
		obj.traversal();

	}

}
