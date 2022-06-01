package searching;

public class CountOnesInSortedArray_Recursive {

  //Time Complexity  : O(logN), auxiliary space : O(1)
	public static int countOnes(int[] arr, int low, int high) {
		if (arr[0] == 1) {
			return high;
		}
		if (arr[high] == 0) {
			return 0;
		}

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == 0) {
				// search in right
				countOnes(arr, mid + 1, high);
			} else {
				// first occurrence
				if (mid == 0 || arr[mid - 1] == 0) {
					return arr.length - mid;
				} else {
					// middle element - find first occurence --> left search
					countOnes(arr, low, mid - 1);
				}
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		/*
		 * TCs : { 1, 1, 1, 1, 1, 1 } { 0, 0, 1, 1, 1, 1 } {0,0,0,0,0,0}
		 */

		int[] arr = { 0, 0, 0, 0, 0, 0 };
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nCount number of occurrence for element 1 is : " + countOnes(arr, 0, arr.length - 1));

	}
}
