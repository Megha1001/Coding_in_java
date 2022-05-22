package array;

public class LargetElemenent {

	//Time Complexity : O(N)
	public static int findLargest(int[] arr) {

		if (arr.length == 0) {
			return -1;
		}

		int result = arr[0];
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > result) {
				result = arr[i];
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, 12, 5, 6 };

		System.out.println("Largest element in input array is : " + findLargest(arr));

	}

}
