package array;

public class MoveZeroesAtLast_AP1 {

	public static void moveZeroesAtLast(int[] arr) {
		int res = 0;
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] != 0) {
				arr[res] = arr[i];
				res ++;
			}
		}
		
		for(int i = res; i < arr.length ; i++) {
			arr[res] =0;
		}
		
		for(int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i] +" ");
		}
	}
	
	public static void main(String[] args) {
		int [] arr = {8,5,0,10,0};
		moveZeroesAtLast(arr);

	}

}
