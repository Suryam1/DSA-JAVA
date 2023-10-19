 package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Knapsack_Problem {
	
	static Scanner input;
	
	static {
		input = new Scanner(System.in);
	}
	
	private int W;
	private int N;
	
	private int PW[];
	private int PP[];
	
	private int T[][];
	
	static class Item{
		int weight;
		int profit;
		double profit_per_unit_weight;
		
		Item(int weight,int profit){
			this.weight=weight;
			this.profit=profit;
			
			profit_per_unit_weight = (double) (profit)/(weight);
		}
	}
	

	public Knapsack_Problem() {
		System.out.print("Bag Weight : ");
		W=input.nextInt();
	}
	public void setProductProfit() {
		System.out.print("Product Profits : ");
		for(int i=0;i<N;i++) {
			PP[i]=input.nextInt();
		}
	}
	
	public void setProductWeight() {
		System.out.print("Product Weights : ");
		for(int i=0;i<N;i++) {
			PW[i]=input.nextInt();
		}
	}
	
	public void setN() {
		System.out.print("Number of Products : ");
		N=input.nextInt();
		PW = new int[N];
		PP = new int[N];
	}
	public int [] getProductProfit() {
		return PP;
	}
	public int [] getProductsWeight() {
		return PW;
	}
	public void doFractionalKnapsack(int [] productsWeight, int[] productProfit) {
		double max_profit=0.0;
		
		List<Item> Itemlist = new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			Itemlist.add(new Item(productsWeight[i],productProfit[i]));
		}
		
		
		Collections.sort(Itemlist,new Comparator<Item>() {
			public int compare(Item item_01,Item item_02) {
				if(item_01.profit_per_unit_weight>item_02.profit_per_unit_weight) {
					return -1;
				}
				return 1;
			}
		});
		
		for(int i=0;i<N;i++) {
			int weight=Itemlist.get(i).weight;
			int profit=Itemlist.get(i).profit;
			
			double profit_per_unit_weight=Itemlist.get(i).profit_per_unit_weight;
			
			if(W>=weight) {
				max_profit+=profit;
				W-=weight;
			}
			else {
				max_profit+=(profit_per_unit_weight)*W;
				W=0;
				break;
			}
		}
		System.out.println("Max profit  : "+max_profit);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Knapsack_Problem obj = new Knapsack_Problem();
		
		obj.setN();
		
		obj.setProductWeight();
		obj.setProductProfit();
		
		obj.doFractionalKnapsack(obj.getProductsWeight(),obj.getProductProfit());
	}
		


}
