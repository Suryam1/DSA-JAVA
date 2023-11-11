package dynamicProgramming;

public class CountMinimumCostPath {
	
	/*
	 * You can move towards right or down, find the minimum cost possible path to reach the destination from 1st cell
	 */
	public CountMinimumCostPath() {
		
	}
	public int vis[][]={
			{-1,-1,-1,-1},
			{-1,-1,-1,-1},
			{-1,-1,-1,-1},
			{-1,-1,-1,-1},
			
	};
	
	
	public int minCost(int[][]dp,int r,int c){
		
		
		//Recursion
		/*if(r==0&&c==0){
			return dp[r][c];
		}
		else if(r<0||c<0){
			return Integer.MAX_VALUE;
		}
		
		return dp[r][c]+Math.min(minCost(dp,r-1,c), minCost(dp,r,c-1));
		*/
		
		
		
		//Memoization
		/*if(r==0&&c==0)
			return dp[r][c];
		else if(r<0||c<0)
			return Integer.MAX_VALUE;
		
		if(vis[r][c]!=-1) return vis[r][c];
		vis[r][c]=dp[r][c]+Math.min(minCost(dp,r-1,c), minCost(dp,r,c-1));
		
		return vis[r][c];*/
		
		
		
		
		//Tabulation
		for(int i=0;i<=r;i++){
			for(int j=0;j<=c;j++){
				vis[i][j]=dp[i][j];
				
				if(i==0&&j>0) vis[i][j]+=vis[i][j-1];
				
				else if(j==0&&i>0) vis[i][j]+=vis[i-1][j];
				
				else if(j>0&&i>0)  vis[i][j]+=Math.min(vis[i-1][j],vis[i][j-1]);
			}
		}
		return vis[r][c];
					
	}

	public static void main(String[] args) {
		
		CountMinimumCostPath obj=new CountMinimumCostPath();
		int [][] dp={
				{1,2,3,4},
				{2,3,4,5},
				{3,4,5,6},
				{4,5,6,7},
				
				
		};
		System.out.println(obj.minCost(dp,3,3));   //row-1 and col-1
	}

}
