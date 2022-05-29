package array;

public class MaximumSumSubArray_AP1 {

  /*
  for earch element adding succeeding element to the sum and update the result only when sum is greater than the current value of result.
  */
  
  //Time Complexity : O(N^2)
	public static int findMaxSumSubArray(int[] arr, int n) {
		int result = arr[0];
		for(int i = 0; i < n; i++) {
			int curr = 0;
			for(int j = i; j < n; j++) {
				curr += arr[j];
				result = Math.max(curr, result);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,-2,3,-1,2};
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nMaximum sum for subarray is : " + findMaxSumSubArray(arr, arr.length));
	}

}
