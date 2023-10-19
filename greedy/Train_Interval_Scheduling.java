package greedy;

import java.util.Arrays;

public class Train_Interval_Scheduling {

	public Train_Interval_Scheduling() {
		// TODO Auto-generated constructor stub
	}
	public int doTrainScheduling(int n, int[] arrivalTime, int[] departureTime) {
		// TODO Auto-generated method stub
		Arrays.sort(arrivalTime);
		Arrays.sort(departureTime);
		int counter=1;
		int i=0,j;
		for(j=1;j<n;j++) {
			if(arrivalTime[j]>=departureTime[i]) {
				counter++;
				i=j;
			}
		}
		
		return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int[] arrivalTime= {900,940,950,1100,1500,1800};
		int[] departureTime= {910,1200,1120,1130,1900,2000};
		Train_Interval_Scheduling obj = new Train_Interval_Scheduling();
		System.out.println(obj.doTrainScheduling(n,arrivalTime,departureTime));
	}


}
