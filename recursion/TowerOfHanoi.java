package recursion;

public class TowerOfHanoi {

	public TowerOfHanoi() {
		
	}
	
	
/*	
 * 	Total steps: (2^n)-1 , where n is number of discs
 * 
 * 
 * Logic
 * 				Move from Source to Aux
 * 				Move from Aux to Dest
 * 
 * 
 */
	
	
	public void recur(int n,char source,char aux,char dest){
		if(n==1){
			System.out.println("Move disc "+n+" from ROD "+source+" to ROD "+dest);
			return;
		}
		recur(n-1,source,dest,aux);
		System.out.println("Moving disk "+n+" from ROD "+source+" to ROD "+dest);
		recur(n-1,aux,source,dest);
	}

	public static void main(String[] args) {
		TowerOfHanoi obj=new TowerOfHanoi();
		obj.recur(3,'A','B','C');

	}

}
