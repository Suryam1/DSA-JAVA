package recursion;

public class RatInAMaze_Easy {

	public RatInAMaze_Easy() {
		// TODO Auto-generated constructor stub
	}
	
	public void maze(int current_row, int current_col, int end_row, int end_col, String solution) {
		// TODO Auto-generated method stub
		if(current_col==end_col&&current_row==end_row) {
			System.out.println(solution);
			return;
		}
		if(current_row>end_row||current_col>end_col) {
			return;
		}
		maze(current_row,current_col+1,end_row,end_col,solution+"H");
		maze(current_row+1,current_col,end_row,end_col,solution+"V");
		
		/*
		 * Diagonal can be done using below code
		 */
		// maze(current_row+1,current_col+1,end_row,end_col,solution+"D");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		
		RatInAMaze_Easy obj = new RatInAMaze_Easy();
		
		obj.maze(0,0,2,2,"");
	}


}
