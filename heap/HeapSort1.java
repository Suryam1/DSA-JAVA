package heap;

public class HeapSort1 {
	
	// Sorting using concept of Min-Heap for descending order
	// TC:O(nlogn)
	// SC:1
	
	
	 

	private int size;
	private int[] heap;

	public HeapSort1(int[] arr) {
		this.heap=arr;
		this.size=arr.length;

	}
	
	public void heapify(int size,int root){
		
		int smallest=root;   //First time we don't know but after that root will be the smallest
		int leftChild=2*root+1;
		int rightChild=2*root+2;
		
		//If left child is smaller than the root
		if(leftChild<size&&heap[leftChild]<heap[smallest]){
			smallest=leftChild;
		}
		
		//If right child is smaller than the root
		if(rightChild<size&&heap[rightChild]<heap[smallest]){
			smallest=rightChild;
		}
		
		//If smallest is not at the root
		if(smallest!=root){
			
			int swap=heap[root];
			heap[root]=heap[smallest];
			heap[smallest]=swap;
			
			//Recursively heapify the affected sub-tree
			heapify(size,smallest);
			
		}
		
		
	}
	
	
	public void heapSort(){
		
		//STEP-1 Build the min-heap
		for(int i=size/2-1;i>=0;i--){
			heapify(size,i);
		}
		
		for(int i=size-1;i>0;i--){
			
			//STEP-2 Extract ele from min-heap one-by-one
			//(Swap the curr root(min ele) with the last ele in the array)
			int temp=heap[0];
			heap[0]=heap[i];
			heap[i]=temp;
			
			
			//STEP-3 Call heapify again on reduced heap to build the min-heap
			heapify(i,0); //here i keeps on getting decremented on every iteration
		}
	}
	
	public void show(){
		for(int i=0;i<size;i++){
			System.out.print(heap[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr={1,5,9,8,2,3};		
		HeapSort1 obj=new HeapSort1(arr);
		
		System.out.print("Unsorted Heap: ");
		obj.show();
		System.out.println();
		
		obj.heapSort();
		
		System.out.print("Sorted Heap: ");
		obj.show();
		System.out.println();
		
		
		

	}

}

