package backtracking;

import java.util.ArrayList;
import java.util.List;

import array.basics.Array;

public class RestoreAllValidIpAddress {
	
	//Restore all valid IP add using all char and in sequence
	//0-255.0-255.0-255.0-255
	//01 is not valid ip
	//Backtrack if exceeds 255 or string gets finished or we found a valid IP
	
	
	/*    Eg- 	  25525511135
	 * 			 /     |     \
	 * 			/	   |      \
	 *		   2.	   25.	  255. 
	 *		/   |   \
	 *	   /    |    \
	 *	  2.5   2.55  2.552
	 *				 (not valid so backtrack)
	 *	/    |    \
	 * /     |     \
	 * 2.5.5 2.5.52 2.5.525
	 *				(not valid so backtrack)
	 *   /
	 *  /
	 * 2.5.5.2
	 *
	 *  
	 */

	public RestoreAllValidIpAddress() {
		
	}
	public boolean isValidPart(String part){
		
		
		//if length not 0
		//if length exceeds more than 3
		//if part starts from 0 and there is further character following it
		//if part is greater than 255
		
		if(part.length()==0||part.length()>3||(part.charAt(0)=='0'&&part.length()>1)||Integer.parseInt(part)>255){
			return false;
		}
		return true;
	}
	
	public void backtrack(String s,int startIndex,List<String> currentIp,List<String> result){
		
		if(startIndex==s.length()&&currentIp.size()==4){
			result.add(String.join(".",currentIp));
			return;
		}
		
		
		if(currentIp.size()>=4){
			return;
		}
		
		for(int i=startIndex;i<s.length()&&i<startIndex+3;i++){
			
			String part=s.substring(startIndex,i+1);
			
			if(isValidPart(part)){
				currentIp.add(part);
				backtrack(s, i+1, currentIp, result);
				currentIp.remove(currentIp.size()-1);
			}
		}
		
	}
	
	public List<String> generate(String s){
		List<String> currentIp=new ArrayList<>();
		List<String> result=new ArrayList<>();
		
		int startIndex=0;
		
		backtrack(s,startIndex,currentIp,result);
		return result;
	}

	public static void main(String[] args) {
		RestoreAllValidIpAddress obj=new RestoreAllValidIpAddress();
		String s="25525";
		List<String> l=new ArrayList<>();
		l=obj.generate(s);
		if(l.isEmpty()){
			System.out.println("No valid IP addresses");
		}
		for(String x:l){
			System.out.println(x);
		}

	}

}
