package searching;

public class SearchInSortedRotatedArray_Iterative {

	public static int search(int[] arr, int low, int high, int x) {

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (arr[mid] == x) {
				return mid;
			}

			// left half is sorted
			else if (arr[mid] > arr[low]) {
				if (x < arr[mid] && x >= arr[low]) {
					// element lies in left half
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}

			// right half is sorted
			else {
				if (x > arr[mid] && x <= arr[high]) {
					// element exist in right half
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}

		}
		return -1;

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
