package array;

public class LeftRotateArrayBy1_AP1 {

	public static int[] leftRotateArrayBy1(int[] arr) {
		if(arr == null || arr.length ==1) {
			return arr;
		}
		int temp = arr[0];
		for(int i = 1; i < arr.length; i++ ) {
			arr[i-1]=arr[i];
		}
		arr[arr.length - 1] = temp;
		
		
		
		return arr;
	}
	
	public static void main(String[] args) {
		int [] arr = {8,5,0,10,0,12,3,6,8,9};
		System.out.println("Original Array : ");
		for(int i = 0; i< arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		leftRotateArrayBy1(arr);
		System.out.println("\nNew Array : ");
		for(int i = 0; i< arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
