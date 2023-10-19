package greedy;

import java.util.Arrays;

public class Min_Train_Interval_Scheduling {

	public Min_Train_Interval_Scheduling() {
		// TODO Auto-generated constructor stub
	}
	public int doTrainScheduling(int n, int[] arrivalTime, int[] departureTime) {
		
		Arrays.sort(arrivalTime);
		Arrays.sort(departureTime);
		int counter=0;
		int m=0;
		int i=0,j=0;
		while(i<n&&j<n) {
			if(arrivalTime[i]<departureTime[j]) {
				counter++;
				i++;
				if(m<counter) {
					m=counter;
				}
				System.out.println("AP : "+i+" - Platform : "+counter);
			}
			else {
				counter--;
				j++;
				System.out.println("DP : "+j+" - Platform : "+counter);
			}
		}
		
		return m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int[] arrivalTime= {900,940,950,1100,1500,1800};
		int[] departureTime= {910,1200,1120,1130,1900,2000};
		Min_Train_Interval_Scheduling obj = new Min_Train_Interval_Scheduling();
		System.out.println(obj.doTrainScheduling(n,arrivalTime,departureTime));
	}


}
