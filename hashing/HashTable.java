package hashing;

import java.util.Scanner;

public class HashTable {
	
	private class HashNode{
		private Integer key;
		private String value;
		
		private HashNode next;
		
		public HashNode(Integer key,String value) {
			this.key=key;
			this.value=value;
		}
	}
	
	private HashNode[] buckets;
	
	private int size;
	private int bucketIndex;
	private int totalBucketSize;
	
	
	private int emptyBuckets;
	private int occupiedBuckets;

	public HashTable(int capacity) {
		// TODO Auto-generated constructor stub
		this.size=0;
		this.totalBucketSize=capacity;
		this.buckets=new HashNode[totalBucketSize];
		
	}
	
	public int size() {
		return size;
	}
	
	private boolean isEmpty() {
		return size==0;
	}
	
	private int hashcode(Integer key) {
		return key%totalBucketSize;
	}
	
	private int getBucketIndex(Integer key) {
		return hashcode(key);
	}
	
	private int getBucketSize() {
		return totalBucketSize;
	}
	
	private int getOccupiedBuckets() {
		return occupiedBuckets;
	}
	
	private int getEmptyBuckets() {
		return emptyBuckets;
	}
	
	
	
	public void put(Integer key,String value) {
		
		bucketIndex=getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value = value;
				return;
			}
			head=head.next;
		}
		
		head=buckets[bucketIndex];
		
		HashNode node = new HashNode(key, value);
		node.next=head;
		buckets[bucketIndex]=node;
		size++;
		
	}
	
	public String get(Integer key) {
		
		bucketIndex = getBucketIndex(key);
		
		HashNode head  = buckets[bucketIndex];
		
		while(head!=null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head=head.next;
		}
		
		return null;
		
	}
	
	public String search(Integer key) {
		
		bucketIndex=getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		
		while(head!=null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head=head.next;
		}
		
		return null; 
		
	}
	
	public String delete(Integer key) {
		
		bucketIndex=getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		HashNode tail = null;
		
		if(head==null) {
			return null;
		}
		
		while(head!=null) {
			if(head.key.equals(key)) {
				size--;
				System.out.println("Key value pair successfully deleted");
				break;
			}
			tail=head;
			head=head.next;
		}
		
		if(tail!=null) {
			tail.next=head.next;
			
		}
		else {
			buckets[bucketIndex]=head.next;
		}
		
		return null;
		
	}

	public void show() {
		
		for(int i=0;i<totalBucketSize;i++) {
			HashNode head = buckets[i];
			System.out.print("Index "+i+" : ");
			while(head!=null) {
				System.out.print(head.key+ "--"+ head.value+" ");
				head=head.next;
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("N : ");
		int n= input.nextInt();
		HashTable table = new HashTable(n);
		
		table.put(15,"Suryam");
		table.put(25,"Satvik");
		table.put(35,"Aayush");
		table.put(11,"Aniket");
		table.put(18,"Saurabh");
		table.put(19,"Ishani");
		table.put(29,"Aditya");
		
		table.show();
		
		table.delete(15);
		
		table.show();
	}

}
