package backtracking;


	
	/*
	 * NXN chessboard in how many ways we can put N queens such that no two queens threaten each other
	 * For N=1,2,3 there is no possible way
	 * 
	 * 	Directions		   \|/
	 * 			  		  --Q--
	 * 			  		   /|\
	 * 
	 * 
	 * 	       1 x x x
	 * 		   x x 2 x
	 * 		   x x x x  (not possible so backtrack and check for next valid)
	 * 
	 * 
	 * 		   1 x x x
	 * 		   x x x 2
	 *         x 3 x x
	 *         x x x x (not possible so backtrack and chek for next valid)
	 *         
	 *         
	 *         1 x x x 
	 *         x x x 2
	 *         x x x x (not possible so backtrack and check for next valid)
	 *         
	 *         Now when we check for 2nd queen there is no valid so backtrack
	 *         
	 *         x 1 x x
	 *         x x x 2
	 * 		   3 x x x
	 * 		   x x 4 x  (possible so return)
	 * 
	 * 			OR
	 * 
	 * 		   x x 1 x 
	 * 		   2 x x x
	 * 		   x x x 3
	 * 		   x 4 x x	 (possible so return)
	 * 
	 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/*
 * N-Queens Problem
 * 
 * Find all the possible positions on the NxN chess-board where all N-Queens are safe.
 * 
 * Constraints:
 * 1. No two Queens can be on the same column
 * 2. No two Queens can be on the same row
 * 3. No two Queens can be on the same diagonal
 * 
 * Hint: The Queen can move to all eight directions (Top, Down, Left, Right, Upper Right, Upper Left, Lower Right and Lower Left).
 * 
 * Strategy: Column by Column || Row by Row (opt any one to solve it)
 * 
 * 
 */
 
public class N_Queen {

	private static Scanner input;
	
	private int N;
	
	private int[][] iBoard;
	
	
	
	static {
		input = new Scanner(System.in);
	}
	
	
	public N_Queen(int N) {

		System.out.print("N: ");
		N = input.nextInt();
		this.N = N;
	
	}
	
	public int getN() {
		return N;
	}
	
	public void create_iBoard(int size) {
		
		iBoard = new int[size][size];
		
		System.out.println("iBoard: ");

		for (int i = 0; i < N; i++) {
			Arrays.fill(iBoard[i], 0);
		}
		
	}
	
	public int[][] get_iBoard(){
		return iBoard;
	}
	
	public void show(ArrayList<ArrayList> ans) {

		for(int i=0;i<ans.size();i++){
			for(int j=0;j<ans.get(i).size();j++){
				if(j%N==0){
					System.out.println();
				}
				System.out.print(ans.get(i).get(j)+" ");
			}
			System.out.println("\n");
		}
		
	}
	
	public boolean isSafe(int row,int col,int[][] iBoard,int n){
		//in our solution we are filling queen from left to right in a particular row 
		//so we need to check towards left only for same row
		
		
		//in our solution we are placing one queen in a col so no need to check for col 
		
		int x=row,y=col;
		while(y>=0){
			if(iBoard[x][y]==1)
				return false;
			y--;
		}
		
		
		x=row;
		y=col;
		//diagonal
		while(x<n&&y>=0){
			if(iBoard[x][y]==1)
				return false;
			y--;
			x++;
		}
		
		
		x=row;
		y=col;
		//diagonal
		while(x>=0&&y>=0){
			if(iBoard[x][y]==1)
				return false;
			y--;
			x--;
		}
		
		return true;
	}
	
	public void addSolution(int[][] iBoard,ArrayList<ArrayList> ans,int n){
		ArrayList<Integer> temp=new ArrayList<>();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				temp.add(iBoard[i][j]);
			}
		}
		ans.add(temp);
	}
	
	public void solve(int col,ArrayList<ArrayList> ans,int[][] iBoard,int n){
		
		if(col==n){
			addSolution(iBoard,ans,n);
			return;
		}
		for(int row=0;row<n;row++){
			if(isSafe(row,col,iBoard,n)){
				iBoard[row][col]=1;
				solve(col+1,ans,iBoard,n);
				iBoard[row][col]=0;
			}
		}
		
	}
	
	public ArrayList<ArrayList> place_nQueen(int n) {
		
		ArrayList<ArrayList> ans=new ArrayList<>();
		solve(0,ans,iBoard,n);
		return ans;
        
	}
	
	
	
	//DRIVER CODE
	public static void main(String[] args) {
	
		int N = 0;
		ArrayList<ArrayList> ans;
		N_Queen obj = new N_Queen(N);
		
		obj.create_iBoard(obj.getN());
		
		ans=obj.place_nQueen(obj.getN());	
		
		obj.show(ans);
	}

}











