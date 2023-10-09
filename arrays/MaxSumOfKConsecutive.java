package arrays;

public class MaxSumOfKConsecutive {

	public MaxSumOfKConsecutive() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int arr[]={1,-2,4,-5,6,-8,9};
		int k=3;
		
		int i=0,j=k-1;
		int curr=0;
		//finding sum of first window
		for(int p=i;p<=j;p++){
			curr+=arr[p];
		}
		
		int maxsum=curr;
		
		//sliding the window to next location
		i++;  
		j++;
		
		while(j<arr.length){
			curr=curr-arr[i-1]+arr[j];         //calculates sum of current window
			maxsum=Math.max(maxsum, curr);     //updating if this window sum is maximum
			i++;								//now it's starting index of next window
			j++;								// now it's ending index of next window
		}
		System.out.println(maxsum);
		

	}

}
