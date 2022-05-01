// Time Complexity - O(N^2)
public class MaxSubArraySumBruteForce {
    
	public static int maximumSubArraySum(int [] input) {
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0; i< input.length ;i++) {
			int currSum = 0;
			for(int j = i ; j< input.length ; j++) {
				currSum += input[j];
				if(currSum > maxSum) {
					maxSum = currSum;
				}
			}
		}
		
		return maxSum;
	}
	
    public static void main(String args[]) {
    	int [] input = {1, 3, 8, -2, 6, -8, 5};
    	System.out.println("Maximum sub of subarray : "+maximumSubArraySum(input));
    }
}

/*
OUTPUT
-----------
Maximum sub of subarray : 16
*/
