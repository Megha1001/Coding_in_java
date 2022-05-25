package array;

public class MoveZeroesAtLast_AP2 {

	public static void moveZeroesToEnd(int [] arr) {
		int res = 0;
		int len = arr.length;
		for(int i = 0; i < len; i++) {
			if(arr[i] == 0) {
				for(int j = len-1-res; j >=i ; j--) {
					if(arr[j] != 0) {
						//swap
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
						res++;
					}
				}
			}
		}
		
		for(int i = 0; i< len ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int [] arr = {8,5,0,10,0};
		moveZeroesToEnd(arr);

	}

}
