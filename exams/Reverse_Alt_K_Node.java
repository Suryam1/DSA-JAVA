// Java program to reverse alternate k nodes in a linked list
package exams;



class Reverse_Alt_K_Node {
 
    static Node head;
 
    class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 

    Node kAltReverse(Node node, int k) {
        Node head=node;
        int n=0;
        while(head!=null) {
        	n++;
        	head=head.next;
        }
        int [] arr = new int [n];
        head=node;
        int x=0;
        while(head!=null) {
        	arr[x]=head.data;
        	x++;
        	head=head.next;
        }
        for(int i=0;i<n;i=i+(2*k)) {
        	if(i+k<n) {
        		for(int j=0;j<k/2;j++) {
        			int temp=arr[i+j];
            		arr[i+j]=arr[i+k-1-j];
            		arr[i+k-1-j]=temp;
        		}
        	}
        	else {
        		k=n-i;
        		for(int j=0;j<k/2;j++) {
        			int temp=arr[i+j];
            		arr[i+j]=arr[i+k-1-j];
            		arr[i+k-1-j]=temp;
        		}
        	}
        }
        head=node;
        x=0;
        while(head!=null) {
        	head.data=arr[x];
        	x++;
        	head=head.next;
        }
        return node;
    }
 
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    void push(int newdata) {
        Node mynode = new Node(newdata);
        mynode.next = head;
        head = mynode;
    }
 
    public static void main(String[] args) {
        Reverse_Alt_K_Node list = new Reverse_Alt_K_Node();
 
        for (int i = 20; i > 0; i--) {
            list.push(i);
        }
        System.out.println("Given Linked List :");
        list.printList(head);
        head = list.kAltReverse(head, 3);
        System.out.println("");
        System.out.println("Modified Linked List :");
        list.printList(head);
 
    }
}
 
// This code has been contributed by Mayank Jaiswal