package mathematics;

public class GCDAndLCM {

	private int number1;
	private int number2;
	
	public GCDAndLCM(int a,int b) {
		// TODO Auto-generated constructor stub
		number1=a;
		number2=b;
	}
	
	int getGCD() {
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
	
	int getLCM() {
		int lcm = (number1*number2)/getGCD();
		return lcm;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15,b=24;
		GCDAndLCM obj = new GCDAndLCM(a, b);
		System.out.println(obj.getGCD());
		
//		System.out.println(obj.getLCM());
	}

}
