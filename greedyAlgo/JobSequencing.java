package greedyAlgo;

import java.util.ArrayList;
import java.util.Collections;

import oop.Abstraction;

public class JobSequencing{
	public JobSequencing() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void getMax(ArrayList<Job> s){
	
//		
		
	}
}

class Job {
	
	/*
	 * You are give n jobs each with deadline d and profit p. Each job takses 1hr to complete.
	 * Your task is to find sequence of jobs to maximize the total profit,subject to constraint that each job must
	 * be completed within it's deadline
	 * 
	 * 
	 * 		    	1 2 3 4 5 6 7
	 * 	p		5 2 4 1 8 0 3
	 * 	d		2 2 4 1 3 3 1
	 * 
	 * 
	 * 
	 * 	Approach
	 * 		Step1- Sort pairs of (p,d) in descending order based upon profit
	 * 		
	 * 
	 * 					5 1 3 7 2 4 6
	 * 			p		8 5 4 3 2 1 0
	 *			d		3 2 4 1 2 1 3
	 *
	 *
	 *		Step2- Get maximum deadline
	 *
	 *		Step3- Schedule the jobs
	 *				J7 	J1 	J5 	J3	
	 *			    1hr 2hr 3hr 4hr
	 *
	 *		Step4- Calculate the profit
	 *				3+5+8+4=20
	 */
	
	String name;
	int deadline;
	int profit;
	
 
	

	public Job(String name,int deadline,int profit) {
		this.name=name;
		this.deadline=deadline;
		this.profit=profit;
	}

	public static void main(String[] args) {
		
		
		Job a=new Job("A",2,140);
		Job b=new Job("B",1,90);
		Job c=new Job("C",2,100);
		Job d=new Job("D",3,50);
		Job e=new Job("E",3,15);
		
		ArrayList<Job> jobs=new ArrayList<>();
		jobs.add(a);
		jobs.add(b);
		jobs.add(c);
		jobs.add(d);
		jobs.add(e);
		
		JobSequencing j=new JobSequencing();
		

	}

}
