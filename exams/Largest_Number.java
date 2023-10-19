package exams;

import java.util.ArrayList;
import java.util.Collections;

public class Largest_Number {

	public Largest_Number() {
		// TODO Auto-generated constructor stub
	}
	public void largest(ArrayList<Integer>nums, ArrayList<String> arr, String s) {
		// TODO Auto-generated method stub
		if(nums.size()==0) {
			arr.add(s);
			return;
		}
		for(int i=0;i<nums.size();i++) {
			ArrayList<Integer> nums2 = nums;
			System.out.println(nums2);
			nums2.remove(i);
			largest(nums2, arr, s+Integer.toString(nums.get(i)));
		}
	}
	
	public String largestNumber(int[] nums) {
		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			nums2.add(nums[i]);
		}
		String s="";
		largest(nums2,arr,s);
		Collections.sort(arr, Collections.reverseOrder());
		return arr.get(arr.size()-1);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Largest_Number obj = new Largest_Number();
		int[] arr = {3,30,34,5,9};
		System.out.println(obj.largestNumber(arr));
	}

}
