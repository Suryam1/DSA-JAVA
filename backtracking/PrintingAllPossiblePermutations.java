package backtracking;

public class PrintingAllPossiblePermutations {

	//TC:O(n*n!)

	public PrintingAllPossiblePermutations() {
		
	}
	
	public void printPermutation(String s,int i){
		
		if(i==s.length()-1){
			System.out.println(s);
			return;
		}
		for(int j=i;j<s.length();j++){
			
			char[] ch=s.toCharArray();
			int temp=ch[i];
			ch[i]=ch[j];
			ch[j]=ch[i];
			s=ch.toString();
			printPermutation(s,i+1);
			
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=ch[i];
			s=ch.toString();
			
		}
		
	}

	public static void main(String[] args) {
		
		PrintingAllPossiblePermutations obj=new PrintingAllPossiblePermutations();
		obj.printPermutation("ABC", 0);
		
	}

}
