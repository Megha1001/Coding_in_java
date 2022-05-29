package array;

public class MaximumSumSubArray_AP2 {

	/*
	 * Traverse the array from L to R, and for every element we find out maximum sum of sub-array must end with this element
	 */
	//Time Complexity : O(N)
	public static int findMaxSumSubArray(int[] arr, int n) {
		int result = arr[0];
		int maxEnding = arr[0];
		for(int i = 1; i < n; i++) {
			maxEnding = Math.max(maxEnding + arr[i], arr[i]);
			result = Math.max(maxEnding, result);
		}
		return result;		
	}
	
	public static void main(String[] args) {
		int[] arr = {-3,8,-2,4,-5,6};
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nMaximum sum for subarray is : " + findMaxSumSubArray(arr, arr.length));
	}

}
