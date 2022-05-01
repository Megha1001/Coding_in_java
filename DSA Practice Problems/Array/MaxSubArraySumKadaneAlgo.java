//Time Complexity - O(N)
public class MaxSubArraySumKadaneAlgo {
	public static int maximumSubArraySum(int [] input) {
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;
		
		for(int i =0 ; i < input.length ; i++) {
			currSum += input[i];
			if(currSum > maxSum) {
				maxSum = currSum;
			}
			if(currSum < 0) {
				currSum = 0;
			}
		}
		return maxSum;
	}
	
	public static void main(String[] args) {
		int [] input = {1, 3, 8, -2, 6, -8, 5};
		System.out.println("Maximum sub of subarray : "+maximumSubArraySum(input));

	}

}
