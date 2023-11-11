package sorting;

public class SelectionSort {

	public SelectionSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//select the minimum ele and place it at it's correct position
		int[] arr={5,3,1,4,2,8,10,9,12,7,6};
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			int min_index=i;
			for(int j=i+1;j<n;j++){
				if(arr[min_index]>arr[j]){
					min_index=j;
				}
			}
			if(i!=min_index){          //to avoid unecessary swap
				int temp=arr[min_index];
				arr[min_index]=arr[i];
				arr[i]=temp;
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}

	}

	

}
