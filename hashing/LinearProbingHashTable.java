package hashing;

public class LinearProbingHashTable {

	private int capacity;
	private int[] table;
	private int[] state; //0 for empty, 1 for Occupied, -1 for deleted
	
	public LinearProbingHashTable(int capacity) {
		// TODO Auto-generated constructor stub
		this.capacity=capacity;
		table=new int[capacity];
		state=new int[capacity];
		for(int i=0;i<capacity;i++) {
			state[i]=0;		//Initialize all slots as empty
		}
	}

	
	//INSERT
	public void insert(int key) {
		int index=hash(key);
		
		//Linear Probing to find the next available slot
		while(state[index]==1) {
			index=linearProbing(index);		//h'(x) = { h(x) + f(i) } % z		
		}
		
		table[index]=key;
		state[index]=1;		//Mark slot as occupied
	}
	
	
	//SEARCH
	public boolean search(int key) {
		int index=hash(key);
		while(state[index]!=0) {
			if(table[index]==key && state[index]==1) {
				return true;
			}
			else {
				index=linearProbing(index);
			}
		}
		return false;
	}
	
	
	//DELETE
	public void delete(int key) {
		int index=hash(key);
		
		while(state[index]!=0) {
			if(state[index]==1 && table[index]==key) {
				state[index]=-1;
				return;
			}
			else {
				index=linearProbing(index);
			}
		}
	}
	private int hash(int key) {
		// TODO Auto-generated method stub
		return key%capacity;		// h(x) = key % z
	}
	
	private int linearProbing(int index) {
		return(index+1)%capacity;
	}
	
	
	public void print() {
		for(int i=0;i<capacity;i++) {
			if(state[i]==1) {
				System.out.println("Slot "+ i +" : "+ table[i]);
			}
			else if(state[i]==-1){
				System.out.println("Slot "+ i + ": DELETED");
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearProbingHashTable hashTable = new LinearProbingHashTable(10);
		
		hashTable.insert(5);
		hashTable.insert(25);
		hashTable.insert(15);
		
		System.out.println("HashTable: ");
		hashTable.print();
		
		System.out.println("Search 15: "+hashTable.search(15));
		System.out.println("Search 10: "+hashTable.search(10));
		
		hashTable.delete(25);
		System.out.println("HashTable after deleting 25:");
		hashTable.print();
	}

}
