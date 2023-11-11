package mathematics;

public class PrimeFactorization {

	public PrimeFactorization() {
		// TODO Auto-generated constructor stub
		int n=88;
		for(int i=2;i<=n;i++){
			while(n%i==0){
				n/=i;
				if(n!=1){
					System.out.print(i+" x ");
				}
				else{
					System.out.println(i);
				}
			}
		}
	}
	public static void main(String[] args){
		new PrimeFactorization();
	}

}
