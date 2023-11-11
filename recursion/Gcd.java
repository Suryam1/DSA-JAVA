package recursion;

public class Gcd {

	public Gcd() {
		// TODO Auto-generated constructor stub
	}
	public int gcd(int a,int b){
		
//		if(a==0){
//			return b;
//		}
//		return gcd(b%a,a);
		
		if(b==0){
			return a;
		}
		return gcd(b,a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((new Gcd()).gcd(63,42));
		

	}

}
