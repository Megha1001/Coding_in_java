package array;

public class LeftRotateByDPosition_AP3 {
	
	public static void reverseArray(int[] arr, int low, int high) {
		while(low < high) {
			//swap
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
	//Time Complexity : Θ(d + n -d + n) = Θ(2n) = Θ(n), Auxiliary Space : Θ(1)
	public static void leftRotateArrayByDPosition(int[] arr, int d) {
		int n = arr.length;
		reverseArray(arr, 0, d-1);//Θ(d)
		reverseArray(arr, d, n-1);//Θ(n-d)
		reverseArray(arr, 0, n-1);//Θ(n)
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

}
