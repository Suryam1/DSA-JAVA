package mathematics;

public class DistributionInCircle {

	public DistributionInCircle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//a:Chocolates
		//b:Children
		//c:Starting pos
		//x:find the last position of the children who recieved a chocolate 
		
		int a=213,b=70,c=215;
		
		/*while(a!=0){
			a--;
			c++;
			c=c%b;
		}*/
		System.out.println(c-1);
		
		int x=(c+a-1)%b==0?b:(c+a-1)%b;
		System.out.println(x);
	}

}
