package heap;

public class MinHeap {
	private int size;
	private int[] heap;
	private int maxSize;
	
	
	
	public MinHeap(int maxSize) {
		this.maxSize=maxSize;
		this.size=0;
		heap=new int[this.maxSize+1];
		heap[0]=0;
		
	}
	
	private int parent(int pos){
		return (pos/2);
	}
	
	private int leftChild(int pos){
		return (2*pos);
	}
	
	private int rightChild(int pos){
		return (2*pos)+1;
	}
	
	private void swap(int fpos,int spos){
		int tmp;
		tmp=heap[fpos];
		heap[fpos]=heap[spos];
		heap[spos]=tmp;
	}
	
	
	public void upHeapify(int pos){
		int temp=heap[pos];
		while(pos>0&&temp<heap[parent(pos)]){
			heap[pos]=heap[parent(pos)];
			pos=parent(pos);
		}
		heap[pos]=temp;      //places the ele at it's correct posi
		
	}

	public void insert(int element){
		heap[++size]=element;  //inc the size
		int current=size;  
		upHeapify(current);    //first empty index of heap
	}
	
	public void print(){
		for(int i=1;i<=size/2;i++){
			System.out.println(heap[i]+" LC: "+heap[i*2]+" RC: "+heap[i*2+1]);
		}
	}
	
	public int extractMin(){
		int max=heap[1];
		heap[1]=heap[size--]; //will get 0
//		size--;
		downHeapify(1);
		return max;
	}
	
	
	public void downHeapify(int pos){
		if(pos>=size/2+1 && pos<=size){     //+1 in comp to maxHeap is bcz we want to check min for last level also
			return;
		}
		if(heap[pos]>heap[leftChild(pos)]||heap[pos]>heap[rightChild(pos)]){
			if(heap[leftChild(pos)]<heap[rightChild(pos)]){
				swap(pos,leftChild(pos));
				downHeapify(leftChild(pos));
			}
			else{
				swap(pos,rightChild(pos));
				downHeapify(rightChild(pos));
			}
		}
		
	}	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinHeap obj=new MinHeap(20);
		obj.insert(1);
		obj.insert(2);
		obj.insert(4);
		obj.insert(3);
		obj.insert(7);
		obj.insert(5);
		obj.insert(6);
		obj.insert(9);
		obj.insert(11);
		obj.insert(10);
		obj.insert(19);
		obj.insert(16);
		obj.insert(15);
		obj.insert(17);
		
		obj.print();
		
		
		System.out.println("\nAfter deleting min ele: "+obj.extractMin()+"\n");
		obj.print();

	}
	

}
