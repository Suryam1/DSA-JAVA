package linkedlist.doubleList;

public class DoublyLinkedList {


		 class Node{
			 int value;
			 Node next=null;
			 Node prev=null;
			 
			 Node(int value){
				 this.value=value;
			 }
		 }
		 Node head=null;
		 Node tail=null;
		 
		 public Node insertAtHead(int data){
			 Node newNode=new Node(data);
			 if(head==null){
				 head=newNode;
				 tail=newNode;
				 return head;
			 }
			 newNode.next=head;
			 head.prev=newNode;
			 head=newNode;
			 return head;
		 }
		 
		 public Node insertAtEnd(int data){
			 Node newNode=new Node(data);
			 if(tail==null){
				 head=newNode;
				 tail=newNode;
				 return head;
			 }
			 newNode.prev=tail;
			 tail.next=newNode;
			 tail=newNode;
			 return head;
			 
		 }
		 
		 public int getLength(){
			 int count=0;
			 Node temp=head;
			 while(temp!=null){
				 count++;
				 temp=temp.next;
			 }
			 return count;
			 
		 }
		 public Node insertAtPosition(int pos,int value){
			 if(getLength()< pos-1){
				 System.out.println("Not possible");
				 return head;
			 }
			 
			 if(pos==0)
				 insertAtHead(value);
			 else if(pos==getLength())
				 insertAtEnd(value);
			 else{
				 Node newNode=new Node(value);
				 
				 Node temp=null;
				 Node curr=head;
				 
				 for(int i=0;i<pos;i++){
					 temp=curr;
					 curr=curr.next;
				 }
				 temp.next=newNode;
				 newNode.prev=temp;
				 newNode.next=curr;
				 curr.prev=newNode;
				 
				 return head;
			 }
			 return head;
		 }
		 
		 public Node deleteAtHead(){
			 if(head==null){
				 return head;
			 }
			 if(head==tail){
				 head=null;
				 tail=null;
				 return head;
			 }
			 head=head.next;
			 head.prev=null;
			 return head;
			 
		 }
		 
		 public Node deleteAtEnd(){
			 if(head==null){
				 return head;
			 }
			 if(head==tail){
				 head=null;
				 tail=null;
				 return head;
			 }
			 tail=tail.prev;
			 tail.next=null;
			 return head;
			 
		 }
		 
		 public Node deleteAtPosition(int pos){
			 
			 if(head==null){
				 System.out.println("List is empty");
				 return head;
			 }
			 if(getLength()< pos+1){
				 System.out.println("Not possible");
				 return head;
			 }
			 if(pos==0){
				 deleteAtHead();
			 }
			 else if(pos==getLength()-1){
				 deleteAtEnd();
			 }
			 else{
				 Node temp=null;
				 Node curr=head;
				 for(int i=0;i<pos;i++){
					 temp=curr;
					 curr=curr.next;
				 }
				 temp.next=curr.next;
				 curr.next.prev=temp;
			 }
			 return head;
			 
		 }
		 
		 public void search(int key){
			 int pos=-1;
			 Node temp=head;
			 while(temp!=null){
				 pos++;
				 if(temp.value==key){
					 System.out.println("Found at pos "+pos);
					 return;
				 }
				 temp=temp.next;
			 }
			 System.out.println("Not Found");
			 
		 }
		 
		 public void showforward(){
			 Node temp=head;
			 
			 System.out.print("head->");
			 while(temp!=null){
				 System.out.print(temp.value+"->");
				 temp=temp.next;
			 }
			 System.out.println("tail");
		 }
		 
		 public void showbackward(){
			 Node temp=tail;
			 System.out.print("tail->");
			 while(temp!=null){
				 System.out.print(temp.value+"->");
				 temp=temp.prev;
			 }
			 System.out.println("head");
			 
		 }
		 
		 
	

	public static void main(String[] args) {
		
		DoublyLinkedList obj=new DoublyLinkedList();
		
		
		
		obj.insertAtHead(30);
		obj.insertAtHead(20);
		obj.insertAtHead(10);
		
		
		obj.insertAtEnd(40);
		obj.insertAtEnd(50);
		obj.insertAtEnd(60);
		
		
		obj.insertAtPosition(1, 100);
		obj.insertAtPosition(0, 5);
		obj.insertAtPosition(8, 200);
		obj.insertAtPosition(4, 300);
		
		
		obj.showforward();
		obj.showbackward();
		
		
		obj.deleteAtPosition(2);
		obj.deleteAtPosition(0);
		obj.deleteAtPosition(2);
		obj.deleteAtPosition(6);
		
		
		obj.showforward();
		obj.showbackward();
		
		
		obj.search(40);
		
		

	}

}
