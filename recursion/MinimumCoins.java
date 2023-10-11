package recursion;

public class MinimumCoins {

	public MinimumCoins() {
		// TODO Auto-generated constructor stub
	}
	public static int minCoinsRecursie(int[] coins, int amount,int index) {
		// TODO Auto-generated method stub
		if(amount<=0) {
			return 0;
		}
		if(coins[index]<=amount) {
			int x=amount/coins[index];
			return x+minCoinsRecursie(coins, amount-(x*coins[index]), --index);
		}
		else {
			int x=0;
			return x+minCoinsRecursie(coins, amount, --index);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] coins = {1,2,5};
		int amount = 1;
		int minCoinsNeeded = minCoinsRecursie(coins,amount,coins.length-1);
		System.out.println(minCoinsNeeded);
	}


}
