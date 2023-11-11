package searching;

import java.util.Arrays;

public class BinarySearch {

	public BinarySearch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {5,4,3,2,1,9,10,23,41,49,69};
		Arrays.sort(arr);    //array must be sorted
		int low=0,high=arr.length-1;
		int key=10,flag=0;
		while(low<=high){
			int mid=high-(high-low)/2;
			if(arr[mid]==key){
				flag=1;
				break;
			}
			else if(arr[mid]>key){
				high=mid-1;
			}
			else{
				low=mid+1;
			}
		}
		if(flag==0){
			System.out.println("Not Found");
		}
		else{
			System.out.println("Found");
		}
	}

}
