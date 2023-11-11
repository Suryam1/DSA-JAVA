package sorting;

public class QuickSort {

	public QuickSort() {
		// TODO Auto-generated constructor stub
	}
	
	//pivot ele will be placed at its correct position if you take pivot as the end ele
	public int partition(int[] arr,int low,int high){
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++){
			//in this we are trying to shift all ele smaller than pivot to it's left 
			 //and keeping track of i such that we can get correct place of pivot
			if(arr[j]<pivot){
				i++;
				int temp=arr[j];  
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		//placing pivot at its correct position and all ele to its left will be small and to its right will be large
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}
	public void quickSort(int[] arr,int low,int high){
		if(low<high){
			int piv=partition(arr,low,high);
			quickSort(arr,low,piv-1);
			quickSort(arr,piv+1,high);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,4,3,2,1,9,10,23,41,49,69};
		QuickSort obj = new QuickSort();
		obj.quickSort(arr,0,(arr.length-1));
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
