package backtracking;

import java.util.Scanner;

public class RatInAMaze2 {
	private int n;
	private int[][] imaze;
	private boolean[][] bmaze;
	public static Scanner input;
	
	static {
		input = new Scanner(System.in);
	}
	public int getN() {
		return n;
	}
	public int[][] getImaze(){
		return imaze;
	}
	
	public boolean[][] getBmaze(){
		return bmaze;
	}

	public RatInAMaze2(int n) {
		// TODO Auto-generated constructor stub
		this.n=n;
	}

	public void create_bmaze(int n) {
		bmaze = new boolean [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				bmaze[i][j]=false;
			}
		}
	}
	
	public void create_imaze(int n) {
		imaze = new int [n][n];
		System.out.println("Imaze : ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				imaze[i][j]=input.nextInt();
			}
		}
	}
	public void maze(int[][] imaze, int row, int col, String solution, boolean[][] bmaze) {
		// TODO Auto-generated method stub
		if(row==imaze.length-1&&col==imaze.length-1) {
			System.out.println(solution);
			return;
		}
		
		if(row<0||col<0||row>=imaze.length||col>=imaze.length||bmaze[row][col]||imaze[row][col]==1) {
			return;
		}
		
		bmaze[row][col]=true;
		
		maze(imaze,row-1,col,solution+"T",bmaze);
		maze(imaze,row+1,col,solution+"D",bmaze);
		maze(imaze,row,col-1,solution+"L",bmaze);
		maze(imaze,row,col+1,solution+"R",bmaze);
		
		bmaze[row][col]=false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("N : ");
		int n=input.nextInt();
		RatInAMaze2 obj = new RatInAMaze2(n);
		obj.create_imaze(obj.getN());
		obj.create_bmaze(obj.getN());
		obj.maze(obj.getImaze(),0,0,"",obj.getBmaze());
	}



}
