package array;

public class MaxCircularSubArraySum_AP1 {

	public static int findMaxCircularSubArraySum(int[]arr, int n) {
		int result = arr[0];
		
		for(int i = 0; i < n; i++) {
			int curr_sum = arr[i];
			int curr_max = arr[i];
			//one element have n sub-array that starts with that element
			for(int j = 1; j < n; j++) {
				int index = (i+j)%n;
				curr_sum += arr[index];
				curr_max = Math.max(curr_max, curr_sum);
			}
			result = Math.max(curr_max, result);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int [] arr = {5,-2,3,4};
		/*
		 * Circular subarray : last element connecting back to first element[CSA]
		 * Subarrays : 
		 * starts with 5	-->	{5},{5,-2},{5,-2,3},{5,-2,3,4}
		 * starts with -2 	-->	{-2},{-2,3},{-2,3,4},{-2,3,4,5}[CSA]
		 * starts with 3	-->	{3},{3,4},{3,4,5}[CSA],{3,4,5,-2}[CSA]
		 * starts with 4	-->	{4},{4,5}[CSA],{4,5,-2}[CSA],{4,5,-2,3}[CSA]
		 */
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nMaximum circular for subarray sum is : " + findMaxCircularSubArraySum(arr, arr.length)); 
	}

}
