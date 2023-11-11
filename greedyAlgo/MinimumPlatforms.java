package greedyAlgo;

import java.util.Arrays;

public class MinimumPlatforms {

	public MinimumPlatforms() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * You are given a list of train arrival and departure times in railway station.
	 * Your task is to find minimum platforms that accommodates trains without collision
	 */
	
	
	public static int minPlatforms(int N,int[] arrivalTime,int[] departureTime){
		
		Arrays.sort(arrivalTime);
		Arrays.sort(departureTime);
		
		System.out.println("Arrival: ");
		for(int i=0;i<N;i++)
		{
			System.out.print(arrivalTime[i]+" ");
		}
		System.out.println("\nDeparture: ");
		for(int i=0;i<N;i++){
			System.out.print(departureTime[i]+" ");
		}
		System.out.println("\n");
		
		
		int platforms=0,maxPlatforms=0,arrivalPointer=0,departurePointer=0;
		
		
		while(arrivalPointer<N&&departurePointer<N){
			
			if(arrivalTime[arrivalPointer]<=departureTime[departurePointer]){
				platforms++;
				arrivalPointer++;
				System.out.println("AP: "+arrivalPointer+" - Platform: "+platforms);
			}
			else{
				platforms--;
				departurePointer++;
				System.out.println("DP: "+departurePointer+" - Platform: "+platforms);
			}
			maxPlatforms=Math.max(maxPlatforms,platforms);
		}
		return maxPlatforms;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=6;
		
		int[] arrival=	{900,940,950,1100,1500,1800};
		int[] departure={910,1200,1120,1130,1900,2000};
		
		System.out.println("\nMinimum number of platforms required are: "+minPlatforms(N, arrival, departure));
		
		
		
		//aP=0,dp=0;  900<910  	-> aP=1,platforms=1,maxPlatforms=1;
		//ap=1,dp=0;  940>910  	-> dP=1,platforms=0,maxPlatforms=1;
		//ap=1,dp=1;  940<1120 	-> ap=2,platforms=1,maxPlatforms=1;
		//ap=2,dp=1;  950<1120 	-> ap=3,platforms=2,maxPlatforms=2;
		//ap=3,dp=1;  1100<1120 -> ap=4,platforms=3,maxPlatforms=3;
		//ap=4,dp=1;  1500>1120 -> dp=2,platforms=2,maxPlatforms=3;
		//ap=4,dp=2;  1500>1130 -> dp=3,platforms=1,maxPlatforms=3;
		//ap=4,dp=3;  1500>1200 -> dp=4,platforms=0,maxPlatforms=3;
		//ap=4,dp=4;  1500<1900 -> ap=5,platforms=1,maxPlatforms=3;
		//ap=5,dp=4;  1800<1900 -> ap=6,platforms=2,maxPlatforms=3;
		

	}

}
