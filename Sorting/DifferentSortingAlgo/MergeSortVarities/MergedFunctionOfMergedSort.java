package sorting;

/*
 * Question : Array Given , low , mid , high given, 
 * array from low --> mid --> sorted
 * array from mid + 1 --> high ---> sorted
 * low <= mid < high
 * TASK : SORT ELEMENTS FROM LOW TO HIGH
 */
public class MergedFunctionOfMergedSort {

	public static void mergeSortFromLowToHigh(int[] arr, int low, int mid, int high) {
		int[] merged = new int[high - low + 1];

		// monitor first subarray
		int idx1 = low;

		// monitor second sbuarray
		int idx2 = mid + 1;

		// monitor merged array
		int x = 0;

		while (idx1 <= mid && idx2 <= high) {
			if (arr[idx1] <= arr[idx2]) {
				merged[x++] = arr[idx1++];
			} else {
				merged[x++] = arr[idx2++];
			}
		}

		while (idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}

		while (idx2 <= high) {
			merged[x++] = arr[idx2++];
		}

//		for (int i = 0; i < merged.length; i++) {
//			System.out.println("merged : " + merged[i]);
//		}
		for (int i = low, j = 0; i <= high && j< merged.length; i++, j++) {
			arr[i] = merged[j];
		}

	}

	public static void main(String[] args) {
		/*
		 *  { 2, 0, 4, 5, 6, 19, 7, 8, 10, 12 };
		 *  int low = 2;
			int mid = 5;
			int high = 8;
		 */
		int[] arr = { 10,15,20,11,30};

		int low = 0;
		int mid = 2;
		int high = 4;
		mergeSortFromLowToHigh(arr, low, mid, high);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
