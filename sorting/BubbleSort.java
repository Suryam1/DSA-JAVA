package sorting;

public class BubbleSort {

	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		//setting highest ele at its correct position
		
		int[] arr={5,1,2,3,4};
		int n=arr.length;
		boolean visited;
		for(int i=0;i<n-1;i++){
			visited=false;
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					visited=true;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(visited==false){          //if array is already sorted
				break;
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}

	}

}
