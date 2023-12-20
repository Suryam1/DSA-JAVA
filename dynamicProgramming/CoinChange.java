// The CoinChange class is created to find the minimum number of coins needed to make a certain amount.

package dynamicProgramming;

import java.util.Arrays;


public class CoinChange {

	// The constructor is not doing anything special here.

	public CoinChange() {
		
	}

	// This method takes an array of coin denominations and an amount as input
	// and returns the minimum number of coins needed to make that amount.

	public static int minCoins(int[] denomination, int amount) {
		// If the amount is less than 1, it means we can't make any change.
		if (amount < 1)
			return 0;

		// Sorting the array of coin denominations in ascending order.
		Arrays.sort(denomination);

		// Creating an array 'dp' to store the minimum number of coins needed for each amount.
		// Initializing the array with Integer.MAX_VALUE (a very large number).
		int[] dp = new int[amount + 1];
		Arrays.fill(dp, Integer.MAX_VALUE);

		// Setting the minimum number of coins needed for 0 amount as 0.
		dp[0] = 0;

		// Looping through each coin denomination.
		for (int coin : denomination) {
			// Looping through each amount starting from the current coin denomination.
			for (int i = coin; i <= amount; i++) {
				// Checking if the previous amount (i-coin) is reachable.
				if (dp[i - coin] != Integer.MAX_VALUE) {
					// If reachable, update the minimum number of coins needed for the current amount.
					dp[i] = Math.min(dp[i], dp[i - coin] + 1);
				}
			}
		}

		// If the final amount is still set to Integer.MAX_VALUE, it means it's not reachable.
		// Otherwise, return the minimum number of coins needed for the given amount.
		return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
	}

	// The main method is where the program starts executing.
	public static void main(String[] args) {
		// An example array of coin denominations.
		int[] denomination = { 1, 2, 5, 6, 8 };

		// The amount for which we want to find the minimum number of coins.
		int amount = 11;

		// Calling the minCoins method and printing the result.
		int minCoins = minCoins(denomination, amount);
		System.out.println(minCoins);
	}
}
