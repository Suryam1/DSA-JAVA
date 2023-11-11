package dynamicProgramming;

import java.util.Arrays;

public class FibbTopDown {

	public FibbTopDown() {
		
	}
	public long getFibbNo(int n,long[] cache){
		if(cache[n]==-1){
			if(n<=1)
				cache[n]=n;
			else
				cache[n]=getFibbNo(n-1,cache)+getFibbNo(n-2,cache);
		}
		return cache[n];
		
	}

	public static void main(String[] args) {
		int n;
		n=501;
		long[] cache=new long[n+1];
		Arrays.fill(cache,-1);
		long x=(new FibbTopDown()).getFibbNo(n,cache);
		System.out.println(x);
	}

}
