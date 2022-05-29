package array;

// Kadane's Algo

public class MaximumSumSubArray_AP3 {

	public static int findMaxSumSubArray(int[] arr, int n) {
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;
		for(int i =0 ; i < n; i++) {
			currSum += arr[i];
			
			if(maxSum < currSum) {
				maxSum = currSum;
			}
			
			if(currSum < 0) {
				currSum = 0;
			}
		}
		
		return maxSum;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,-3,-8,5,7,6};
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nMaximum sum for subarray is : " + findMaxSumSubArray(arr, arr.length));
	}

}
