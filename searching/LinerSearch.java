package searching;

public class LinerSearch {

	public LinerSearch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {6,8,9,7,5,4,3,1,2,10};
		int k=11;
		LinerSearch obj = new LinerSearch();
		System.out.println(obj.linearSearch(arr,k)); 
	}

	private int linearSearch(int []a,int k) {
		// TODO Auto-generated method stub
		 for(int i=0;i<a.length;i++) {
			 if(a[i]==k) {
				 return i;
			 }
		 }
		 return -1;
	}

}
