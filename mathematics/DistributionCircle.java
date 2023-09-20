package mathematics;

public class DistributionCircle {

	int A,B,C;
	
	public DistributionCircle(int A,int B,int C) {
		// TODO Auto-generated constructor stub
		this.A=A;
		this.B=B;
		this.C=C;
	}

	
	int getResult() {
		int x =(C+A-1)%B;
		if(x==0) {
			return B;
		}
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=101,B=11,C=11,X;
		DistributionCircle obj = new DistributionCircle(A,B,C);
		
		X=obj.getResult();
		
		System.out.println("X -: "+X);
		
		/*
		 * A : Chocolates
		 * 
		 * B : Children's
		 * 
		 * C : Starting Position
		 * 
		 * D : Find the last position of the children who receive a chocolate in the circle
		 */
		
	}

}
