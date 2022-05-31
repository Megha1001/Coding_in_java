package searching;

public class CountOccurrenceInSortedArray_Iterative {

	/*
	 * Logic : lastOccurrence - firstOccurrence + 1
	 */
  //Time Complexity : O(logN), auxiliary space : O(1)
	public static int countNoOfOccu(int[] arr, int n, int x) {
		int first = findFirstOccurence(arr, 0, n, x);
		System.out.println("first : "+first);
		if (first == -1) {
			return 0;
		} else {
			int last = lastOccurence(arr, 0, n, x);
			return (last - first + 1);
		}

	}

	// find first occurrence
	public static int findFirstOccurence(int[] arr, int low, int high, int x) {

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == x) {
				if (mid > 0 && arr[mid - 1] == x) {
					high = mid - 1;
				} else {
					return mid;
				}
			}

			// search in left half
			if (arr[mid] > x) {
				high = mid - 1;
			}

			// search in right half
			if (arr[mid] < x) {
				low = mid + 1;
			}
		}

		return -1;
	}

	// find last occurrence
	public static int lastOccurence(int[] arr, int low, int high, int x) {

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (arr[mid] == x) {
				if (mid < arr.length - 1 && arr[mid + 1] == x) {
					low = mid + 1;
				} else {
					return mid;
				}
			}

			// search in left half
			if (arr[mid] > x) {
				high = mid - 1;
			}

			// search in right half
			if (arr[mid] < x) {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 6,6,6, 6, 6, 6, 6, 6 };
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int search = 6;
		System.out.println("\nCount number of occurrence for element " + search + " is : "
				+ countNoOfOccu(arr, arr.length - 1, search));
	}

}
