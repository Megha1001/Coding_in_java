package array;

public class MaximumConsecutiveOnes_AP3 {
	
	//Time complexity : O(N)
	public static int findMaxConsecutiveOnes(int[] arr, int n) {
		int result = 0;
		int count = 0;
		for(int i =0; i < n; i++) {
			if(arr[i] == 0) {
				count = 0;
			}else {
				++count;
				result = Math.max(count, result);
			}
		}
		return result;
	}

	public static void main(String[] args) {

		/*
		 * Test data : {0,0,0,0,0,0,0,0,0}
		 * {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,
		 * 1,1,1,1}
		 */

		int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,
				  1,1,1,1};
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nMaximum consecutive one's count is : " + findMaxConsecutiveOnes(arr, arr.length));

	}

}
