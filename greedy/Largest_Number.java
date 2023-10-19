package greedy;

import java.util.Arrays;

public class Largest_Number {

	public Largest_Number() {
		// TODO Auto-generated constructor stub
	}
	public String findLargestNumber(int[] a) {
		// TODO Auto-generated method stub
		String[] sArray = new String[a.length];
		for(int i=0;i<a.length;i++) {
			sArray[i]=String.valueOf(a[i]);
		}
		
		Arrays.sort(sArray,(num1,num2)->(num2+num1).compareTo(num1+num2));
		
		if(sArray[0].equals("0")) {
			return "0";
		}
		
		StringBuilder largestNumber = new StringBuilder();
		
		for(String num:sArray) {
			largestNumber.append(num);
		}
		return largestNumber.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Largest_Number obj = new Largest_Number();
		int[] a = {3,2,1,32,9};
		System.out.println(obj.findLargestNumber(a));
	}


}
