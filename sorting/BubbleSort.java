package sorting;

public class BubbleSort {

	
	
	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}
	
	public void run(int []a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {6,8,9,7,5,4,3,1,2,10};
		BubbleSort obj = new BubbleSort();
		obj.run(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
