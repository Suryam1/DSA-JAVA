package dynamicProgramming;

import java.util.Arrays;

public class CountPathOrStairs {

	
	//You need to find no of distinct ways to climb a staircase of N steps with 1,2 or 3 steps.
	//N=1  O/P=1(All 1's)
	//N=2  O/P=2(All 1's,All 2's)
	//N=3  O/P=4 (All 1's, One 1's and One 2's,One 2's and On1 1's, All 3's)
	
	
	public CountPathOrStairs() {
		
		
		
	}
	public int totalPath=0;

	public int countPath(int n){
		
		if(n==0){
			return 1;        //reached at 0
		}
		else if(n<0)
			return 0;       //khayii m nhi jana hai
		
		
		int pattern1=countPath(n-1);
		int pattern2=countPath(n-2);
		int pattern3=countPath(n-3);
		
		totalPath=pattern1+pattern2+pattern3;
		
		return totalPath;
		
	}
	
	public int countPath(int n,int[] memo){
		
		if(n==0){
			return 1;        //reached at 0
		}
		else if(n<0)
			return 0;       //khayii m nhi jana hai
		
		if(memo[n]>0){
			return memo[n];
		}
		
		int pattern1=countPath(n-1);
		int pattern2=countPath(n-2);
		int pattern3=countPath(n-3);
		
		totalPath=pattern1+pattern2+pattern3;
		
		memo[n]=totalPath;
		
		return memo[n];
		
	}
	
	public int countPathTab(int n){
		
		int[] table=new int[n+1];
		
		table[0]=1;
		
		for(int i=1;i<=n;i++){
			if(i==1){
				table[i]=table[i-1];
			}
			else if(i==2){
				table[i]=table[i-1]+table[i-2];
			}
			else{
				table[i]=table[i-1]+table[i-2]+table[i-3];
			}
		}
		
		return table[n];
	}
	
	public static void main(String[] args) {
		
		int n=5;
		
		
		CountPathOrStairs obj=new CountPathOrStairs();
		System.out.println("Recursion: "+obj.countPath(n));
		
		
		int[] memo=new int[n+1];
		System.out.println("Memoization: "+obj.countPath(n,memo));
		

		System.out.println("Tabulation: "+obj.countPathTab(n));
		
		
		
		

	}

}
