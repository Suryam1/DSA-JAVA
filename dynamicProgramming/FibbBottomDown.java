package dynamicProgramming;


public class FibbBottomDown {

	public FibbBottomDown() {
		
	}
	public long getFibbNo(int n,long[] table){
		table[0]=0;
		table[1]=1;
		
		for(int i=2;i<=n;i++){
			table[i]=table[i-1]+table[i-2];
		}
		return table[n];
	}

	public static void main(String[] args){
		
		int n;
		n=501;
		long table[]=new long[n+1];
		long x=(new FibbBottomDown()).getFibbNo(n,table);
		System.out.println(x);

	}
	
}
