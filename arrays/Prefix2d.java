package arrays;

public class Prefix2d {

	public Prefix2d() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	Input								Output
		 * 		10 20 30						10 30 60
		 * 		 5 10 20						15 45 95
		 * 		 2  4  6						17 51 107
		 * 
		 */
		
		
		
		
		int arr[][]={
				{10,20,30},                     
				{5,10,20},
				{2,4,6}
		};
		
		int prefix[][]=new int[3][3];
		prefix[0][0]=arr[0][0];
		
		for(int i=1;i<3;i++){
			prefix[i][0]=prefix[i-1][0]+arr[i][0];
			prefix[0][i]=prefix[0][i-1]+arr[0][i];
		}
		
		
		
		for(int i=1;i<3;i++){
			for(int j=1;j<3;j++){
				prefix[i][j]=prefix[i-1][j-1]+prefix[i-1][j]+prefix[i][j-1]+arr[i][j]-prefix[i-1][j-1]-prefix[i-1][j-1];
				//OR prefix[i][j]=prefix[i-1][j]+prefix[i][j-1]+arr[i][j]-prefix[i-1][j-1];
				
				/*we subtracted prefix[i-1][j-11] two times as it is added 
				in result of prefix[i-1][j] and prefix[i][j-1]*/
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(prefix[i][j]+"    ");
			}
			System.out.println();
		}

	}

}
