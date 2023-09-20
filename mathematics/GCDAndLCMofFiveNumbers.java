package mathematics;

public class GCDAndLCMofFiveNumbers {

	
	public GCDAndLCMofFiveNumbers() {
		// TODO Auto-generated constructor stub
	}

	public int getGCD(int number1,int number2) {
		int gcd,remainder;
		System.out.println("GCD of "+number1+" and "+number2+" : ");
		
		while(number1%number2!=0) {
			remainder=number1%number2;
			number1=number2;
			number2=remainder;
		}
		gcd=number2;
		return gcd;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []n= {15,24,36,45,60};
		GCDAndLCMofFiveNumbers obj = new GCDAndLCMofFiveNumbers();
		int gcd=obj.getGCD(n[0],n[1]);
		for(int i=2;i<n.length;i++) {
			gcd=obj.getGCD(gcd, n[i]);
		}
		System.out.println("GCD :- "+gcd);
		
		
		
	}

}
