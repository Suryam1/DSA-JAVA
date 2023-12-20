package dynamicProgramming;

public class CountMinimumCostPath {

    // The constructor is not doing anything special here.
    public CountMinimumCostPath() {
        
    }

    // The grid to store costs.
    public int vis[][] = {
            {-1, -1, -1, -1},
            {-1, -1, -1, -1},
            {-1, -1, -1, -1},
            {-1, -1, -1, -1},
    };

    // The method to find the minimum cost path using dynamic programming.
    public int minCost(int[][] dp, int r, int c) {
        // Loop through each cell in the grid.
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= c; j++) {
                // Copy the cost of the current cell to the 'vis' array.
                vis[i][j] = dp[i][j];

                // If not in the first row, add the cost from the cell on the left.
                if (i == 0 && j > 0)
                    vis[i][j] += vis[i][j - 1];
                // If not in the first column, add the cost from the cell above.
                else if (j == 0 && i > 0)
                    vis[i][j] += vis[i - 1][j];
                // If not in the first row or first column, add the minimum cost from the cell above or on the left.
                else if (j > 0 && i > 0)
                    vis[i][j] += Math.min(vis[i - 1][j], vis[i][j - 1]);
            }
        }
        // The final cell now contains the minimum cost path.
        return vis[r][c];
    }

    public static void main(String[] args) {
        // Creating an object of CountMinimumCostPath class.
        CountMinimumCostPath obj = new CountMinimumCostPath();
        
        // The grid of costs.
        int[][] dp = {
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6},
                {4, 5, 6, 7},
        };

        // Calling the minCost method to find the minimum cost path from (0,0) to (3,3).
        System.out.println(obj.minCost(dp, 3, 3));
    }
}
