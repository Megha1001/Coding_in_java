package searching;

public class LastOccurrence_Iterative {

	public static int findLastOccur(int[] arr, int low, int high, int x) {
		// if last element is the one we are searching for
		if (x == arr[high]) {
			return high;
		}
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] > x) {
				// search in left
				high = mid - 1;
			}
			if (arr[mid] < x) {
				// search in right
				low = mid + 1;
			}

			// equals to mid
			if (arr[mid] == x) {
				if (mid < arr.length - 1 && arr[mid + 1] == x) { // search in right for last occurrence
					low = mid + 1;
				} else {
					return mid;
				}
			}
		}

		return -1;
	}
	
	public static void main(String[] args) {

		/*
		 * TC : { 10, 15, 20, 20, 40, 40 };
		 * {10,10,10,10,10}, {10,15,20,20,40,40};
		 */
		int[] arr =  {10,15,20,20,40,40};
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int search = 20;
		System.out.println("\nGiven element " + search + " last occurrence present at index : "
				+ findLastOccur(arr, 0, arr.length - 1, search));

	}
}
