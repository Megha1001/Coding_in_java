package array;

/*
 * Logic : call left rotate by 1 position d times
 */
 

public class LeftRotateByDPosition_AP2 {

	public static void leftRotateArrayBy1Time(int [] arr) {
		int temp = arr[0];
		for(int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1]= temp;
	}
	
	//Time Complexity : O(n * d)
	public static void leftRotateArrayByDPosition(int[] arr, int d) {
		
		for(int i = 0; i < d; i++) {
			//rotate d times
			leftRotateArrayBy1Time(arr);
		}
	}
	
	public static  void main(String[] args) {
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
}
