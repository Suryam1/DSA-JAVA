package arrays;

public class Sieve {

	public Sieve() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=30;
		boolean arr[]=new boolean[n+1];
		for(int i=0;i<n+1;i++){
			arr[i]=true;
		}
		
		for(int i=2;i*i<n+1;i++){
			if(arr[i]==true){
				for(int j=i*i;j<n+1;j=j+i){
					arr[j]=false;
				}
			}
		}
		for(int i=2;i<n+1;i++){
			if(arr[i]==true){
				System.out.print(i+" ");
			}
		}
		
		
		/*
		 * Sieve algo to find prime numbers from 1 to n (O(n*log(log(n))))
		 * 
		 *  Create a boolean array of size n+1 and initialize it with true
		 *  
		 *  Run a loop from 2 to sqrt(n+1)
		 *  
		 *  if array at given index has 
		 *  		true value then we mark all it's multiple to false
		 *  		flase value then we do nothing
		 *  
		 *  now iterate through array and print all the indexes with true values
		 *  
		 *  
		 *  
		 *  
		 *  //Alternative apporach (O(n*sqrt(n)))
		 *  
		 *  SOP(2);SOP(3);
		 *  for(int i=4;i<=n;i++)
		 *  	for(int j=2;j*j<n;j++)
		 *  		if(i%j==0)
		 *  			flag=0;break;
		 *  	if(flag=1)
		 *  		SOP(i);
		 */

	}

}
