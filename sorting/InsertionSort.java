package sorting;


public class InsertionSort {

	public InsertionSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//picking up an element and placing it at it's correct position
		int[] arr={5,3,1,4,2,8,10,9,12,7,6};
		int n=arr.length;
		for(int i=0;i<n;i++){
			int index=i-1;
			int ele=arr[i];
			while(index>=0&&arr[index]>ele){
				arr[index+1]=arr[index];
				index--;
			}
			arr[index+1]=ele;
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}

	}

}
