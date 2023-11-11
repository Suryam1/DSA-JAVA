package recursion;

public class RatInMaze {
	
	//2direction-> right and down
	
	/*
	 * 
	 * 	0 0 0
	 * 	0 0 0
	 * 	0 0 0
	 * 
	 * 
	 * Possible-:
	 * 	RRDD
	 * 	RDRD
	 * 	RDDR
	 * 	DRRD
	 * 	DDRR
	 * 	DRDR
	 * 
	 * 
	 */

	public RatInMaze() {
		// TODO Auto-generated constructor stub
	}
	
	public void maze(int[][] arr,int curr_row,int curr_col,int end_row,int end_col,String solution){
		if(curr_row==end_row&&curr_col==end_col){
			System.out.print(solution);
			System.out.println();
			return;
		}
		if(curr_row>end_row||curr_col>end_col){
			return;
		}
		
		maze(arr,curr_row,curr_col+1,end_row,end_col,solution+"R");
		
		maze(arr,curr_row+1,curr_col,end_row,end_col,solution+"D");
			
//		maze(arr,curr_row+1,curr_col+1,end_row,end_col,"T");     for diagonally
		
	}

	public static void main(String[] args) {
		int N=3;
		int arr[][]={{0,0,0},{0,0,0},{0,0,0}};
		RatInMaze obj=new RatInMaze();
		obj.maze(arr,0,0,N-1,N-1,"");

	}

}
