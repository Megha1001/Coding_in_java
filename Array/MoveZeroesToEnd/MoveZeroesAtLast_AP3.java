package array;

public class MoveZeroesAtLast_AP3 {

	public static void moveZeroesToEnd(int[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] != 0) {
				//swap
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
		for(int i = 0; i< arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int [] arr = {8,5,0,10,0};
		moveZeroesToEnd(arr);
	}

}
