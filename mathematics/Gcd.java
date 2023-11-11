package mathematics;

public class Gcd {

	public Gcd() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gcd,remainder;
		int a=10,b=5;
		while(a%b!=0){
			remainder=a%b;
			a=b;                       //just like long division
			b=remainder;
		}
		gcd=b;
		System.out.println("Gcd: "+gcd);

	}

}
