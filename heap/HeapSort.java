package heap;

public class HeapSort {
	
	// Sorting using concept of Max-Heap for ascending order
	// TC:O(nlogn)
	// SC:1
	
	/*
	 *  Heap sort algo
	 *  	-Create a max heap from an unsorted array
	 *  	-Remove the largest items from Max heap one by one
	 *  	-Place items in same array as the sorted partition
	 *  
	 *  
	 *  Approach
	 *  	-Take largest ele from 1st index and swap it with last ele 
	 *  	-Decrease the size of heap
	 *  	-Heapify again
	 *  	-Repeat the above 3 steps
	 */

	private int size;
	private int[] heap;

	public HeapSort(int[] arr) {
		this.heap=arr;
		this.size=arr.length;

	}
	
	public void heapify(int size,int root){
		
		int largest=root;   //First time we don't know but after that root will be the largest
		int leftChild=2*root+1;
		int rightChild=2*root+2;
		
		//If left child is larger than the root
		if(leftChild<size&&heap[leftChild]>heap[largest]){
			largest=leftChild;
		}
		
		//If right child is larger than the root
		if(rightChild<size&&heap[rightChild]>heap[largest]){
			largest=rightChild;
		}
		
		//If largest is not at the root
		if(largest!=root){
			
			int swap=heap[root];
			heap[root]=heap[largest];
			heap[largest]=swap;
			
			//Recursively heapify the affected sub-tree
			heapify(size,largest);
			
		}
		
		
	}
	
	
	public void heapSort(){
		
		//STEP-1 Build the max-heap
		for(int i=size/2-1;i>=0;i--){
			heapify(size,i);
		}
		
		for(int i=size-1;i>0;i--){
			
			//STEP-2 Extract ele from max-heap one bu one
			//(Swap the curr root(max ele) with the last ele in the array)
			int temp=heap[0];
			heap[0]=heap[i];
			heap[i]=temp;
			
			
			//STEP-3 Call heapify again on reduced heap to build the max-heap
			heapify(i,0); //here i is keep on getting decremented on every iteration
		}
	}
	
	public void show(){
		for(int i=0;i<size;i++){
			System.out.print(heap[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr={1,5,9,8,2,3};		
		HeapSort obj=new HeapSort(arr);
		
		System.out.print("Unsorted Heap: ");
		obj.show();
		System.out.println();
		
		obj.heapSort();
		
		System.out.print("Sorted Heap: ");
		obj.show();
		System.out.println();
		
		
		

	}

}
