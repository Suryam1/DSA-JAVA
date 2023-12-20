package dynamicProgramming;

public class MatrixChaining {

    // The method to find the most efficient way to multiply matrices.
    public int ansR(int[] arr) {
        
        // Get the number of matrices.
        int n = arr.length - 1;
        
        // Create a 2D array 'm' to store the minimum number of operations needed.
        int[][] m = new int[n][n];
        
        // Set the base case when you have only one matrix (diagonal elements in the matrix).
        for (int i = 0; i < n; i++) {
            m[i][i] = 0;
        }

        // Loop through each possible chain length.
        for (int i = 2; i <= n; i++) {
            // Loop through each possible starting point for the chain.
            for (int j = 0; j < n - i + 1; j++) {
                int k = j + (i - 1);
                // Initialize the minimum number of operations to a very large value.
                m[j][k] = Integer.MAX_VALUE;
                
                // Loop through each possible division point in the chain.
                for (int d = j; d < k; d++) {
                    // Calculate the total number of operations for this division point.
                    int v = m[j][d] + m[d + 1][k] + (arr[j] * arr[d + 1] * arr[k + 1]);
                    
                    // If the current division is more efficient, update the minimum.
                    if (v < m[j][k]) {
                        m[j][k] = v;
                    }
                }
            }
        }

        // The top-right corner of the matrix now contains the minimum number of operations.
        return m[0][n - 1];
    }

    public static void main(String[] args) {

        // Creating an object of the MatrixChaining class.
    	
        MatrixChaining obj = new MatrixChaining();

        // Array representing the dimensions of matrices.
        int[] arr = {4, 2, 3, 5};

        // Calling the ansR method to find the most efficient way to multiply matrices.
    }
}
