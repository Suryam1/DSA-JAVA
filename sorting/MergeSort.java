package sorting;



public class MergeSort {

	public MergeSort() {
		// TODO Auto-generated constructor stub
	}

	public void merge(int[] a,int low,int mid,int high) {
		int n1=mid-low+1;
		int n2=high-mid;
		int[] left = new int[n1];
		int[] right = new int[n2];
		int p=low,q=mid+1;
		for(int i=0;i<n1;i++) {
			left[i]=a[p++];
		}
		for(int i=0;i<n2;i++) {
			right[i]=a[q++];
		}
		int i=0,j=0,k=low;
		while(i<n1&&j<n2) {
			if(left[i]<right[j]) {
				a[k++]=left[i++];
			}
			else {
				a[k++]=right[j++];
			}
		}
		while(i<n1) {
			a[k++]=left[i++];
		}
		while(j<n2) {
			a[k++]=right[j++];
		}
		
	}
	
	public void mergeSort(int[] a,int low,int high) {
		if(low<high) {
			int mid=(low+high)/2;
			mergeSort(a, low, mid);
			mergeSort(a, mid+1, high);
			merge(a,low,mid,high);
		}
	}
	
	public static void main(String[] args) {
		
		int [] arr = {5,4,3,2,1,9,10,23,41,49,69};
		MergeSort obj = new MergeSort();
		obj.mergeSort(arr,0,(arr.length-1));
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
