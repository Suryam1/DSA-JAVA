package mathematics;

public class SumOfPrimeFactors {

	private int number;
	private int sum;
	
	public SumOfPrimeFactors(int number) {
		// TODO Auto-generated constructor stub
		this.number=number;
	}
	
	public void getSumPrimeFactors() {
		System.out.println("Prime Factors of "+number+":");
		
		for(int i=2;i<=number;i++) {
			while(number%i==0) {
				number/=i;
				sum+=i;
			}
		}
		
		System.out.println("Sum :- "+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=24;
		SumOfPrimeFactors obj = new SumOfPrimeFactors(n);
		obj.getSumPrimeFactors();
	}

}
