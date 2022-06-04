package searching;

public class SearchInSortedRotatedArray_Recursive {

	public static int search(int[] arr, int low, int high, int x) {

		// element not present
		if (low > high) {
			return -1;
		}

		int mid = low + (high - low) / 2;

		if (arr[mid] == x) {
			return mid;
		} else if (arr[mid] > arr[low] && arr[mid] > x && arr[low] < x) { // element lies in left half and that half is
																			// sorted
			return search(arr, low, mid - 1, x);
		} else { // search in right half be it sorted or not
			return search(arr, mid + 1, high, x);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 7, 8, 9 };
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int search = 9;
		System.out.println("\nElement " + search + " is present at : " + search(arr, 0, arr.length - 1, search));
	}

}
