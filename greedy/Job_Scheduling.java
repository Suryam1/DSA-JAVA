package greedy;

import java.util.ArrayList;
import java.util.Collections;

public class Job_Scheduling {

	static class Job implements Comparable<Job>{
		String name;
		int deadline;
		int profit;
		
		@Override
		public int compareTo(Job otherJob) {
			// TODO Auto-generated method stub
			return otherJob.profit-this.profit;
		}
		
		public Job(String name,int deadline,int profit) {
			this.name=name;
			this.deadline=deadline;
			this.profit=profit;
		}
	}
	
	public Job_Scheduling() {
		// TODO Auto-generated constructor stub
	}
	public void findJobSequence(ArrayList<Job> jobs) {
		// TODO Auto-generated method stub
		Collections.sort(jobs);
		
		int totalJobs = jobs.size();
		boolean[] slots = new boolean[totalJobs];
		int[] sequence = new int[totalJobs];
		
		for(int i=0;i<totalJobs;i++) {
			for(int j=jobs.get(i).deadline-1;j>=0;j--) {
				if(!slots[j]) {
					sequence[j]=i;
					slots[j]=true;
					break;
				}
			}
		}
		System.out.println("Jobs: ");
		int totalProfit=0;
		for(int i=0;i<jobs.size();i++) {
			if(slots[i]) {
				System.out.println(jobs.get(sequence[i]).name + " ");
				totalProfit += jobs.get(sequence[i]).profit;
			}
		}
		
		System.out.println("Total profit : "+totalProfit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job a = new Job("A", 2, 140);
		Job b = new Job("B", 1, 90);
		Job c = new Job("C", 2, 100);
		Job d = new Job("D", 3, 50);
		Job e = new Job("E", 3, 15);
		
		ArrayList<Job> jobs = new ArrayList<>();
		jobs.add(a);
		jobs.add(b);
		jobs.add(c);
		jobs.add(d);
		jobs.add(e);
		Job_Scheduling obj = new Job_Scheduling();
		obj.findJobSequence(jobs);
	}


}
