package backtracking;

public class RatInAMaze {

	//all four directions
	public RatInAMaze() {
		
	}
	public void Ratmaze(int[][] maze,int row,int col,String solution,boolean[][] visited){
		
		
		if(row==maze.length-1&&col==maze.length-1){
			System.out.println(solution);
			return;
		}
		
		if(row<0||col<0||row>=maze.length||col>=maze[0].length||visited[row][col]==true||maze[row][col]==1){
			return;
		}
		
		//marking the cell visited
		visited[row][col]=true; 
		
		/*
		 * ensures that during particular path traversal 
		 * we have already came from that path only so don't go their to avoid loop
		 * 
		 *			Eg if we came down from cell i,j so we don't need to go up to i+1,j 
		 *			because we already came from i,j to this cell
		 */
		
		Ratmaze(maze,row-1,col,solution+"U",visited);
		Ratmaze(maze,row+1,col,solution+"D",visited);
		Ratmaze(maze,row,col-1,solution+"L",visited);
		Ratmaze(maze,row,col+1,solution+"R",visited);
		
		visited[row][col]=false;   //if moved back from the cell
//		//false is done,so for next new path we can go from that cell
		
		
		
		
		
		
		
		

		
	}

	public static void main(String[] args) {
		int maze[][]={
						{0,1,0,0},
						{0,0,0,0},
						{0,1,0,0},
						{0,1,1,0}
					 };
		boolean visited[][]={
								{false,false,false,false},
								{false,false,false,false},
								{false,false,false,false},
								{false,false,false,false}
							};
		//visited is marked true if rat has already checked all the paths from the given cell
		//so this avoids the rat to get stuck into a loop where he will be visiting same cell again & again
		
		
		RatInAMaze obj=new RatInAMaze();
		if(maze[0][0]!=1)
		obj.Ratmaze(maze,0,0,"",visited);
		
//		for(int i=0;i<4;i++){
//			for(int j=0;j<4;j++){
//				System.out.print(visited[i][j]+" ");
//			}
//			System.out.println();
//		}

	}

}
