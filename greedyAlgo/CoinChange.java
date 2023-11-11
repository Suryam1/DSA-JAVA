package greedyAlgo;

import java.util.Arrays;

public class CoinChange {

	public CoinChange() {
		// TODO Auto-generated constructor stub
	}
	public static int minCoins(int[] denominations,int amount){
		int size=denominations.length;
		
		Arrays.sort(denominations);
		int coinCount=0;
		for(int i=size-1;i>=0;i--){
			
//			while(amount>=denominations[i]){
//				amount-=denominations[i];
//				coinCount++;
//			}
			
			if(amount>=denominations[i]){
				int n=amount/denominations[i];
				coinCount+=n;
				amount-=n*denominations[i];
			}
		}
		return coinCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] denominations={1,2,5,10,20,25,50,100};  //must be sorted
		int amount=87;
		int minCoins=minCoins(denominations,amount);
		System.out.println(minCoins);

	}

}
