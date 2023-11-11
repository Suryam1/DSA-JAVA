package linkedlist.single;


public class LinkedList {
	class Node{
		int data;
		Node next;
		
		Node(int x){
			data=x;
			next=null;
		}
	}
	
	Node head,tail;

	public LinkedList() {
		head=null;
		tail=null;
	}
	
	public Node insertAtHead(int data){
		
		Node newNode=new Node(data);
		
		if(head==null){		//when LinkedList is empty
			newNode.next=head;
			head=newNode;
			tail=head;          
			return head;
		}
		newNode.next=head;      //linking newNode with the node at head of linkedlist
		head=newNode;			//newNode becomes the head
		return head;
	}
	
	public Node insertAtEnd(int data){
		
		Node newNode=new Node(data);
		
		if(head==null){             //when linkedlist is empty we want to initilaise tail and head
			head=newNode;
			tail=newNode;
			return head;
		}
		
		tail.next=newNode;        //node at tail will now point to newNode
		tail=tail.next;			 //now the newNode becomes the tail
		return head;
		
	}
	
	public Node deleteAtHead(){
		
		if(head==null){
			return null;
		}
		
		Node temp=head;
		head=head.next;
		temp.next=null;			//disconnects the node from linkedlist
		
		return head;
		
	}
	
	public int search(int key){
		Node temp=head;
		while(temp!=null){
			if(temp.data==key){
				return temp.data;
			}
			temp=temp.next;
		}
		return -1;
	}
	public Node deleteAtEnd(){
		
		if(head==null){
			return null;
		}
		
		Node temp=head;
		while(temp.next!=tail){
			temp=temp.next;
		}
		
		tail=temp;             //tail will point to its prev node
		tail.next=null;		  //disconnecting the new tail
		
		return head;
	}
	
	public void show(){
		Node temp=head;
		System.out.print("head->");
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public Node getHead(){
		return head;
	}
	
	public void backwardTraversal(Node head){
		if(head==null){
			return;
		}	
		backwardTraversal(head.next);
		System.out.print(head.data+"->");
	}
	

	public Node reverse(){
		Node curr=null,prev=null,nxt=head;
		while(nxt!=null){
			curr=nxt;       //shifts the current node to the nxt and nxt==curr(bcz links get broken as we do curr.next=prev so that is why to update curr we do curr=nxt and not curr=curr.next)
			nxt=nxt.next;	//nxt now shifted to next node
			curr.next=prev;	//curr node is linked with it's previous node
			prev=curr;      //prev node is shifted to curr node and prev=curr
		}
		head=curr;          //changing the position of head
		return head;
	}

	public static void main(String[] args) {
		LinkedList obj=new LinkedList();
		obj.insertAtHead(40);
		obj.insertAtHead(30);
		obj.insertAtHead(20);
		obj.insertAtHead(10);
		
		obj.insertAtEnd(50);
		obj.insertAtEnd(60);
		obj.insertAtEnd(70);
		obj.insertAtEnd(80);
		
		obj.deleteAtHead();
		obj.deleteAtEnd();
		obj.show();
		
		Node temp=obj.getHead();
		obj.backwardTraversal(temp);
		System.out.println();
		
		
		
		System.out.println(obj.search(40));
		
		obj.reverse();
		obj.show();
		
		

	}

}
