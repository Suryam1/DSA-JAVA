package dynamicProgramming;

import java.util.Arrays;

public class CoinChange {

	public CoinChange() {
		
	}
	public static int minCoins(int[] denomination,int amount){
		if(amount<1)
			return 0;
		
		Arrays.sort(denomination);
		
	
		int[] dp=new int[amount+1];
		
		Arrays.fill(dp,Integer.MAX_VALUE);
		
		dp[0]=0;
		
		for(int coin:denomination){
			for(int i=coin;i<=amount;i++){
				if(dp[i-coin]!=Integer.MAX_VALUE){      //default value of indices
//					System.out.print(">> "+dp[i-coin]);
					dp[i]=Math.min(dp[i],dp[i-coin]+1);
//					System.out.println(dp[i]);
				}
			}
		}
		return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
	}

	public static void main(String[] args) {
		int[] denomination={1,2,5,6,8};
		int amount=11;
		int minCoins=minCoins(denomination,amount);
		System.out.println(minCoins);

	}
	
	
	
/*
 * 	Example-:
 *    {1,3,4}
 *    For rs=6
 *    
 * 	  Greedy gives   4+1+1=3
 * 	  Dynamic gives  3+3=2	   
 * 
 */

}
