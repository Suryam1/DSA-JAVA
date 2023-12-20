package dynamicProgramming;

public class KnapSack {

    // The method to solve the knapsack problem.
    public int ks(int n, int[] pw, int[] pp, int w) {

        // Creating a 2D array 'T' to store the maximum value for each weight and item combination.
        int[][] T = new int[n + 1][w + 1];

        // Loop through each item and each possible weight.
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {

                // If it's the first item or the bag has no capacity, set the value to 0.
                if (i == 0 || j == 0) {
                    T[i][j] = 0;
                } else if (pw[i - 1] <= j) {
                    // If the current item can fit into the remaining capacity, choose the maximum value.
                    T[i][j] = Math.max(T[i - 1][j], T[i - 1][j - pw[i - 1]] + pp[i - 1]);
                } else {
                    // If the current item is too heavy, skip it and use the value from the previous row.
                    T[i][j] = T[i - 1][j];
                }
            }
        }

        // The final cell now contains the maximum value that can be obtained with the given capacity.
        return T[n][w];
    }

    public static void main(String[] args) {

        // Creating an object of the KnapSack class.
        KnapSack obj = new KnapSack();

        // Arrays representing weights and values of items.
        int[] w = {2, 8, 3, 1, 6};
        int[] p = {5, 2, 7, 2, 1};

        // Calling the ks method to find the maximum value that can fit into a bag with a capacity of 10.
        System.out.println(obj.ks(5, w, p, 10));
    }
}
