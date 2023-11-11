package greedyAlgo;

public class IntervalSchedulingProblem {

	public IntervalSchedulingProblem() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * You are given a list of train arrival and departure times in railway station.
	 * Your task is to find a schedule that accommodates maximumm trains on a single platform without conflicts
	 */
	
	
	public static void doTrainScheduling(int N,int[] arrivalTime,int[] departureTime){
		
		int i,j,counter=1;
		
		//arrivalTime must be in sorted
		
		i=0;//set i to 0 as every first taks is always selected
		
		
		System.out.print(i);
		
		for(j=1;j<N;j++){
			if(arrivalTime[j]>=departureTime[i]){
				System.out.print(" "+j);
				i=j;
				++counter;
			}
		}
		System.out.println("\n Maximum trains on a platform are: "+counter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=6;
		
		int[] arrival=	{900,940,950,1100,1500,1800};
		int[] departure={910,1200,1120,1130,1900,2000};
		
		doTrainScheduling(N, arrival, departure);

	}

}
