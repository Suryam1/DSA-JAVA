package linkedList.Single;

import linkedList.Single.LinkedList2.Node;

public class ReverseLinkedList {

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
		
		public ReverseLinkedList() {
			// TODO Auto-generated constructor stub
			head = null;
		}
		
		//Add a Node Start
		public Node insertAtStart(int x) {
			Node newNode = new Node(x);
			newNode.next=head;
			head=newNode;
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
			
		//Insert A Node at Tail
		public Node insertAtEnd(int x) {
			Node newNode = new Node(x);
			if(head==null) {
				head=newNode;
				return head;
			}
			Node tail=head;
			while(tail.next!=null) {
				tail=tail.next;
			}
			tail.next=newNode;
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
			ReverseLinkedList obj = new ReverseLinkedList();
			
			obj.insertAtStart(40);
			obj.insertAtStart(30);
			obj.insertAtStart(20);
			obj.insertAtStart(10);
			
			obj.show();
			
			obj.insertAtEnd(50);
			obj.insertAtEnd(60);
			obj.insertAtEnd(70);
			obj.insertAtEnd(80);
			
			obj.show();
		}

}
