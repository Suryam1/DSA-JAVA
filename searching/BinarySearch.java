package searching;

public class BinarySearch {

	public BinarySearch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int k=1;
		BinarySearch obj = new BinarySearch();
		System.out.println(obj.binarySearch(arr,k));
	}

	private int binarySearch(int[] a,int k) {
		// TODO Auto-generated method stub
		int i=0,j=a.length-1;
		while(i<=j) {
			int mid=(i+j)/2;
			if(a[mid]==k) {
				return mid;
			}
			else if(a[mid]<k) {
				i=mid+1;
			}
			else {
				j=mid-1;
			}
		}
		return -1;
	}

}
