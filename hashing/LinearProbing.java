package hashing;

public class LinearProbing {
	
	private int capacity;
	private int table[];
	private int state[];     // 0 denotes bucket is empty,1 denotes bucket has some value, and -1 indicates deleted value 

	public LinearProbing(int z) {
		// TODO Auto-generated constructor stub
		capacity=z;
		table =new int[capacity];
		state =new int[capacity];
		
		for(int i=0;i<capacity;i++){
			state[i]=0;
		}
	}
	
	private int hash(int key){
		return key%capacity;
	}
	
	public void insert(int key){
		int index=hash(key);
		int start=index;
		while(state[index]==1){
			index=(index+1)%capacity;
			if(state[index]==-1){
				break;
			}
			if(index==start){
				System.out.println("Hashtable is full please increase it's size");
				return;
			}
		}
		table[index]=key;
		state[index]=1;
		
		
	}
	public int search(int key){
		int index=hash(key);
		int start=index;
		while(state[index]!=0){
			if(state[index]==1&&table[index]==key){
				return index;
			}
			index=(index+1)%capacity;
			if(index==start){
				return -1;
			}
		}
		return -1;
		
	}
	
	public void delete(int key){
		
		int index=search(key);
		if(index!=-1){
			state[index]=-1;
			table[index]=0;
			System.out.println(key+" is deleted");
		}else{
			System.out.println(key+" not found, so cannot be deleted");
		}
	}
	public void display(){
		for(int i=0;i<capacity;i++){
			System.out.print(table[i]+" ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinearProbing obj=new LinearProbing(10);
		
		obj.insert(2);
		obj.insert(12);
		obj.insert(5);
		obj.insert(3);
		obj.insert(25);
		obj.insert(1);
		obj.insert(42);
		obj.insert(90);
		obj.insert(5);
		obj.insert(44);
		
		obj.insert(59);   //since hashtable is full we cannot insert
		
		System.out.println("key at: "+obj.search(42));
		
		System.out.println("key at: "+obj.search(99));   //-1 indicates key is not present
		
		obj.delete(42);
		obj.delete(99);									//not present in hashtable
		
		obj.display();
		
		
		
		
		

	}

}
