package array;

public class MaximumConsecutiveOnes {

	public static int findMaxConsecutiveOnes(int[] arr, int n) {
		int res = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) {
				int count = 1;
				int j = i + 1;
				
				//count all consecutive succeeding 1
				while (j < n) {
					if (arr[j] == arr[j - 1]) { // compare next with current
						++count;
					} else {
						break;
					}
					++j;
				}
				System.out.println("count : " + count);
				res = Math.max(res, count);
				i += count; // inorder to avoid traversal of already counted 1's
			}
		}

		return res;
	}

	public static void main(String[] args) {

		/*
		 * Test data : {0,0,0,0,0,0,0,0,0}
		 * {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,
		 * 1,1,1,1}
		 */

		int[] arr = { 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 };
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nMaximum consecutive one's count is : " + findMaxConsecutiveOnes(arr, arr.length));
	}

}
