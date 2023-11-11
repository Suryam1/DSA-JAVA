package hashing;

public class SeprateChaining {
	
	private class HashNode{
		private Integer key;
		private String value;
		
		private HashNode next;
		
		public HashNode(Integer key,String value){
			this.key=key;
			this.value=value;
		}
	}
	
	private HashNode[] buckets;     //array of nodes
	
	private int size;
	private int bucketIndex;
	private int totalBucketSize;   //total elements
	
	
	
	
	public SeprateChaining(int capacity){
		this.size=0;
		this.totalBucketSize=capacity;
		this.buckets=new HashNode[totalBucketSize];
	}
	
	public int size(){
		return size;
	}
	private boolean isEmpty(){
		return size==0;
	}
	private int hashCode(Integer key){
		return key%totalBucketSize;
	}
	private int getBucketIndex(Integer key){
		return hashCode(key);
	}
	private int getBucketSize(){
		return totalBucketSize;
	}
	
	
	public void put(Integer key,String value){
		bucketIndex=getBucketIndex(key);
		HashNode head=buckets[bucketIndex];
		
		while(head!=null){
			if(head.key.equals(key)){        //updating if already present
				head.value=value;
				return;
			}
			head=head.next;
		}
		
		head=buckets[bucketIndex];
		
		HashNode node=new HashNode(key,value);
		node.next=head;
		buckets[bucketIndex]=node;
		size++;
		
	}
	public String get(Integer key){
		
		bucketIndex=getBucketIndex(key);
		
		HashNode head=buckets[bucketIndex];
		while(head!=null){
			if(head.key.equals(key)){
				return head.value;
			}
			head=head.next;
		}
		return null;
	}
	
	public String search(Integer key){
		bucketIndex=getBucketIndex(key);
		HashNode head=buckets[bucketIndex];
		
		while(head!=null){
			if(head.key.equals(key)){
				return head.value;
			}
			head=head.next;
		}
		return "Key does not exist";
	}
	
	public String delete(Integer key){
		
		bucketIndex=getBucketIndex(key);
		
		HashNode head=buckets[bucketIndex];
		HashNode prev=null;
		
		while(head!=null){
			if(head.key.equals(key)){
				break;
			}
			prev=head;
			head=head.next;
		}
		
		if(head==null){          //when not found the key
			return null;
		}
		
		if(prev!=null){           
			prev.next=head.next;
		}	
		else{								//when there is only 1 ele and that is to be deleted
			buckets[bucketIndex]=head.next;  //assigning null so that index now has null value
		}
		size--;
		return "Deleted : "+ head.value;
	
	}
	
	public void show(){
		for(int i=0;i<totalBucketSize;i++){
			HashNode head=buckets[i];
			System.out.print("Index "+i+" : ");
			while(head!=null){
				System.out.print(head.key+"-"+head.value+"  ");
				head=head.next;
			}
			System.out.println();
		}
	}

	public SeprateChaining() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeprateChaining obj=new SeprateChaining(10);
		
		obj.put(11,"aniket");
		obj.put(15,"satvik");
		obj.put(35,"dixit");
		obj.put(23,"harshit");
		obj.put(33,"khosla");
		obj.put(25, "rashi");
		
		
		
		System.out.println(obj.search(11));
		obj.show();
		
		System.out.println();
		
		System.out.println(obj.delete(11));
		obj.show();

	}

}
