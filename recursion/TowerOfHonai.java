package recursion;

public class TowerOfHonai {

	public TowerOfHonai() {
		// TODO Auto-generated constructor stub
	}

	public void towerOfHonai(int n,String source,String auxiliary,String destination) {
		// TODO Auto-generated method stub
		if(n==1) {
			System.out.println("Moving Disk "+n+" from "+source+" to "+destination);
			return;
		}
		towerOfHonai(n-1, source, destination, auxiliary);
		System.out.println("Moving Disk "+n+" from "+source+" to "+destination);
		towerOfHonai(n-1, auxiliary, source,destination);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		TowerOfHonai obj = new TowerOfHonai();
		obj.towerOfHonai(n,"A","B","C");
	}


}
