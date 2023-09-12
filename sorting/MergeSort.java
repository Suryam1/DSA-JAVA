package sorting;

public class MergeSort {

	public MergeSort() {
		// TODO Auto-generated constructor stub
	}

	public void merge(int[] a,int l,int m,int h) {
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
		int n1=m-l+1;
		int n2=h-m;
		int[] left = new int[n1];
		int[] right = new int[n2];
		for(int i=0;i<n1;i++) {
			left[i]=a[i+l];
		}
		for(int i=0;i<n2;i++) {
			right[i]=a[i+l+n1];
		}
		int i=0,j=0,k=l;
		while(i<n1&&j<n2) {
			if(left[i]<right[j]) {
				a[k]=left[i];
				i++;
				k++;
			}
			else {
				a[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<n1) {
			a[k]=left[i];
			i++;
			k++;
		}
		while(j<n2) {
			a[k]=right[j];
			j++;
			k++;
		}
//		for(int x=0;x<a.length;x++) {
//			System.out.print(a[x]+" ");
//		}
//		System.out.println();
	}
	
	public void mergeSort(int[] a,int l,int h) {
		if(l<h) {
			int mid=(l+h)/2;
			mergeSort(a, l, mid);
			mergeSort(a, mid+1, h);
			merge(a,l,mid,h);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {6,8,9,7,5,4,3,1,2,10};
		MergeSort obj = new MergeSort();
		obj.mergeSort(arr,0,(arr.length-1));
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
