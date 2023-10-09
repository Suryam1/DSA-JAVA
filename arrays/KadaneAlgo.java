package arrays;

public class KadaneAlgo {

	public KadaneAlgo() {
		// TODO Auto-generated constructor stub
	}
	public int max(int a,int b){
		if(a>b)
			return a;
		return b;
	}
	
	public static void main(String[] args) {
		KadaneAlgo obj=new KadaneAlgo();
		int arr[]={2,-5,4,-3,-6,1};
		int ans=arr[0],curr=arr[0];
		for(int i=1;i<arr.length;i++){
			curr=obj.max(curr+arr[i],arr[i]);
			ans=obj.max(ans,curr);
		}
		System.out.println("Maximum contigious subarray sum: "+ans);
		
		/*		
		 * 		Kadane's Algo -->Contigious subarray with max sum of array consisting of -ve and +ve both
		 * 
		 * 		curr=2,ans=2;
		 * 
		 * 	    curr=max(2-5,-5)=-3,ans=max(2,-3)=2;
		 * 
		 * 		curr=max(-3+4,4)=4, ans=max(2,4)=4;
		 * 
		 * 		curr=max(4-3,-3)=1,	ans=max(4,1)=4;
		 * 
		 * 		curr=max(1-6,-6)=-5,ans=max(4,-5)=4;
		 * 
		 * 		curr=max(-5+1,1)=1, ans=max(4,1)=4;
		 * 
		 * 		ans=4;
		 */
		
	}

}
