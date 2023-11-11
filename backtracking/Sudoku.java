package backtracking;

public class Sudoku {

	public Sudoku() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void display(int[][] board){
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public boolean isSafe(int row,int col,int[][] board,int value){
		for(int i=0;i<9;i++){
			
			//col
			if(board[row][i]==value)
				return false;
			
			//row
			if(board[i][col]==value)
				return false;
			
			//subgrid
			if(board[3*(row/3)+i/3][3*(col/3)+i%3]==value){
				return false;
			}
		}
		return true;
	}
	public boolean solve(int[][] board){
		for(int row=0;row<9;row++){
			for(int col=0;col<9;col++){
				
				//is empty
				if(board[row][col]==0){
					for(int val=1;val<=9;val++){
						
						if(isSafe(row,col,board,val)){
							
							board[row][col]=val;
							
							//recursive call
							boolean aageSolutionPossibleHai=solve(board);
							if(aageSolutionPossibleHai){
								return true;
							}else{
								
								//backtrack
								board[row][col]=0;
							}
							
						}
					}
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int board[][]={{5,3,0,0,7,0,0,0,0},
		        {6,0,0,1,9,5,0,0,0},
		        {0,9,8,0,0,0,0,6,0},
		        {8,0,0,0,6,0,0,0,3},
		        {4,0,0,8,0,3,0,0,1},
		        {7,0,0,0,2,0,0,0,6},
		        {0,6,0,0,0,0,2,8,0},
		        {0,0,0,4,1,9,0,0,5},
		        {0,0,0,0,8,0,0,7,9}};
		
		if((new Sudoku()).solve(board)){
			(new Sudoku()).display(board);
		}
		else{
			System.out.println("Solution does not exits");
		}

	}

}
