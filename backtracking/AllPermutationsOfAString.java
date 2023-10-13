package backtracking;

public class AllPermutationsOfAString {

	private int counter=0;
	public AllPermutationsOfAString() {
		// TODO Auto-generated constructor stub
	}

	public void printAllPermutations(String a,String b,int index) {
		if(a.length()==0) {
//			System.out.println(counter);
			System.out.println(b);
			return;
		}
		
		for(int i=0;i<a.length();i++) {
			char currentCh=a.charAt(i);
			String newSubStr= a.substring(0,i)+a.substring(i+1);
			printAllPermutations(newSubStr, b+currentCh, index+1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stubṇṇ
		String a="ABC";
		String b="";
		int index=0;
		AllPermutationsOfAString obj = new AllPermutationsOfAString();
		obj.printAllPermutations(a,b,index);

	}

}
