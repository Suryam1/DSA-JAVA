package mathematics;

public class PrimeFactorization {

	private int number;
	
	public PrimeFactorization(int number) {
		// TODO Auto-generated constructor stub
		this.number=number;
	}
	
	public void getPrimeFactors() {
		System.out.println("Prime Factors of "+number+":");
		
		for(int i=2;i<=number;i++) {
			while(number%i==0) {
				number/=i;
				if(number!=1) {
					System.out.print(i+ " X ");
				}
				else {
					System.out.println(i);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=24;
		PrimeFactorization obj = new PrimeFactorization(n);
		obj.getPrimeFactors();
	}

}
