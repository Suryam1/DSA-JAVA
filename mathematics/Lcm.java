package mathematics;
public class Lcm {

	public static void main(String[] args) {
		
		int gcd,remainder;
		int a=20,b=5,product=a*b;
		while(a%b!=0){
			remainder=a%b;
			
			a=b;                       
			b=remainder;
		}
		gcd=b;
				
		int lcm=product/gcd;              //lcm X hcf = a X b
		System.out.println("Lcm: "+lcm);
		
	}

}
