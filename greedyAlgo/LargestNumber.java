package greedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

	public LargestNumber() {
		
	}
	
	public String formLargest(int[] numbers){
		String[] sArray=new String[numbers.length];
		for(int i=0;i<numbers.length;i++){
			sArray[i]=String.valueOf(numbers[i]);
		}
		
		//Arrays.sort(sArray,(num1,num2)->(num1+num2).compareTo(num2+num1));  
		
		
		//descending order
		Arrays.sort(sArray,new Comparator<String>() {
            public int compare(String hero1, String hero2) {
                return (hero2+hero1).compareTo(hero1+hero2); //10,2 => 210 or 102s
            }
        });
		
		//case when largest number is 0
		if(sArray[0].equals("0")){
			return "0";
		}
		StringBuilder largestNumber=new StringBuilder();
		for(String num:sArray){
			largestNumber.append(num);
		}
		return largestNumber.toString();
	}

	public static void main(String[] args) {
		int[] numbers={3,2,1,32,9};
		System.out.println((new LargestNumber()).formLargest(numbers));
	}

}
