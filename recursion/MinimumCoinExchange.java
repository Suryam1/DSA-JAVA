package recursion;

public class MinimumCoinExchange {

	public MinimumCoinExchange() {
		
	}
	public int minCoins(int[] arr,int amount,int index){
		if(amount<=0){
			return 0;
		}
		if(arr[index]<=amount){
			int x=amount/arr[index];
			return x+minCoins(arr, amount-(x*arr[index]), --index);
		}
		else{
			int x=0;
			return x+minCoins(arr, amount,--index);
		}
	}

	public static void main(String[] args) {
		int arr[]={1,2,5};       //sorted,if not do perform sorting
		MinimumCoinExchange obj=new MinimumCoinExchange();
		int amount=6;
		System.out.println(obj.minCoins(arr,amount,arr.length-1
				));

	}

}
