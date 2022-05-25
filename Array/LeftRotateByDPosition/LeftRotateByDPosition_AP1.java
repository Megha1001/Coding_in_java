package array;

public class LeftRotateByDPosition_AP1 {

	// Time Complexity : O(N), Auxiliary Space : O(d)
	// d <= N
	public static int[] leftRotateArrayByDPosition(int[] arr, int d) {
		if(arr == null || arr.length == 1) {
			return arr;
		}
		int[] temp = new int[d];
		for(int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}
		for(int i = 0; (i+d) < arr.length ;i++) {
			arr[i] = arr[i+d];
		}
		for(int i = 0 ;i < d ;i++) {
			arr[arr.length - d + i]= temp[i];
		}
		
		return arr;
		
	}
	
	public static void main(String[] args) {
		int [] arr = {8,5,0,10,0,12,3,6,8,9};
		int d = 2;
		System.out.println("Original Array : ");
		for(int i = 0; i< arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		leftRotateArrayByDPosition(arr,d);
		System.out.println("\nNew Array : ");
		for(int i = 0; i< arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}


	// Extended Question : iF d > N then we need to subtract N from d (d-N) to get the effective rotation
}
