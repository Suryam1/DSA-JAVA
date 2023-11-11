package searching;

public class LinearSearch {

	public LinearSearch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array can be sorted or unsorted
		int [] arr = {5,4,3,2,1,9,10,23,41,49,69};
		int key=49,flag=0,index=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
				flag=1;
				index=i;
				break;
			}
		}
		if(flag==0){
			System.out.println("Not found");
		}else{
			System.out.println("Fount at index "+index);
		}
	}

}
