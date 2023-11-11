package dynamicProgramming;

public class MatrixChaining {
	
	
	public int ansR(int[]arr) {
		
		int n = arr.length -1;
		int [][] m = new int[n][n];
		for(int i=0;i<n;i++) {
			m[i][i]=0;
		}
			
		
		for(int i=2;i<=n;i++) {
			for(int j=0;j< n - i +1;j++) {
				int k = j +(i-1);
				m[i][j] = Integer.MAX_VALUE;
				for(int d=j;d<k;d++) {
					int v = m[j][d] + m[d+1][k] + ( arr[j] * arr[d+1] * arr[k+1] );
					if(v < m[j][k]) {
						m[j][k] = v;
					}
				}
			}
		}
		
		return m[0][n-1];
		
		
	}
	
	
	public static void main(String[] args) {
		
		MatrixChaining obj = new MatrixChaining();
		
		int [] arr = {4,2,3,5};
		
		System.out.println(obj.ansR(arr));
		
	}
	
}