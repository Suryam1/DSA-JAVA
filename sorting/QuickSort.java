package sorting;

public class QuickSort {

	public QuickSort() {
		// TODO Auto-generated constructor stub
	}

	public int partition(int[] a,int l,int h) {
		int pivot=a[h];
		int i=l-1;
		for(int j=l;j<h;j++) {
			if(a[j]<pivot) {
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[h];
		a[h]=temp;
		return(i+1);
	}
	
	public void quickSort(int a[],int l,int h) {
		if(l<h) {
			int p = partition(a, l, h);
			quickSort(a, l, p-1);
			quickSort(a, p+1, h);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {6,8,9,7,5,4,3,1,2,10};
		QuickSort obj = new QuickSort();
		obj.quickSort(arr, 0, (arr.length-1));
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
