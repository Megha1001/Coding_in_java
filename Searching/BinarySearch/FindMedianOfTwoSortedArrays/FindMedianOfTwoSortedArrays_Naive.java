package searching;

public class FindMedianOfTwoSortedArrays_Naive {

	// Time complexity : O(N1+N2)
	public static int[] findMedian(int[] arr1, int[] arr2) {
		int[] merged = new int[arr1.length + arr2.length];
		// monitor first array
		int idx1 = 0;

		// monitor second array
		int idx2 = 0;

		// monitor merged array
		int x = 0;

		while (idx1 <= arr1.length - 1 && idx2 <= arr2.length - 1) {
			if (arr1[idx1] < arr2[idx2]) {
				merged[x++] = arr1[idx1++];
			} else {
				merged[x++] = arr2[idx2++];
			}
		}

		while (idx1 <= arr1.length - 1) {
			merged[x++] = arr1[idx1++];
		}

		while (idx2 <= arr2.length - 1) {
			merged[x++] = arr2[idx2++];
		}
		return merged;
	}

	public static void main(String[] args) {
		/*
		 * int[] arr1 = { 10, 20, 30, 40, 50 };
			int[] arr2 = { 5, 15, 25, 35, 45 };
		 */

		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 1,2,3,4,5,6 };

		int[] sorted = findMedian(arr1, arr2);

		int mid = (sorted.length) / 2;
		// even
		if (sorted.length % 2 == 0) {
			System.out.println("Median is : " + (sorted[mid] + sorted[mid - 1]) / 2.0);
		} else {// odd
			System.out.println("Median is : " + sorted[mid]);
		}
	}

}
