package greedy;

import java.util.Arrays;

public class Coin_Exchange {

	public Coin_Exchange() {
		// TODO Auto-generated constructor stub
	}
	public int minCoins(int[] coins, int amount) {
		// TODO Auto-generated method stub
		Arrays.sort(coins);
        int coin=0;
        for(int i=coins.length-1;i>=0;i--){
            if(amount==0){
                return coin;
            }
            if(amount<0){
                return -1;
            }
            if(coins[i]<=amount) {
            	int x=amount/coins[i];
                amount=amount-(coins[i]*x);
                coin=coin+x;
            }
        }
        if(amount>0){
            return -1;
        }
        return coin;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Coin_Exchange obj = new Coin_Exchange();
		int [] a= {1,2,5,10,20,25,50,100};
		int amount=87;
		System.out.println(obj.minCoins(a,amount));
	}


}
