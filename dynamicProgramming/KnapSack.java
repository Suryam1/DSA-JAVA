package dynamicProgramming;

public class KnapSack {
	
	
	public int ks(int n,int[] pw ,int[] pp , int w) {
		
		int[][]T = new int[n+1][w+1] ; 
		
		
		for(int i=0;i<=n ;i++) {
			for(int j=0;j<=w;j++) {
				if(i==0 || j==0) {
					T[i][j]=0;
				}else if(pw[i-1] <= j) {
					T[i][j] = Math.max(T[i-1][j], T[i-1][j-pw[i-1]] + pp[i-1]);
				}else {
					T[i][j] = T[i-1][j];
				}
			}
		}
		
		
		
		return T[n][w];
	}

	public static void main(String[] args) {
		
		
		KnapSack obj = new KnapSack();
		
		int[]w = {2,8,3,1,6};
		int[]p = {5,2,7,2,1};
		
		System.out.println(obj.ks(5,w, p,10));  // 
		// TODO Auto-generated method stub

	}

}