package searching;

public class LastOccurrence_Recursive {

	public static int findLastOccur(int[] arr, int low, int high, int x) {
		// if last element is the one we are searching for
		if (x == arr[high]) {
			return high;
		}

		if (low > high) {
			return -1;
		}

		int mid = low + (high - low) / 2;
		// equals to mid
		if (arr[mid] == x) {
			if (mid < arr.length - 1 && arr[mid + 1] == x) {
				// search in right
				return findLastOccur(arr, mid + 1, high, x);
			} else {
				return mid;
			}
		}
		return (arr[mid] > x) ? findLastOccur(arr, low, mid - 1, x) // search in left
				: findLastOccur(arr, mid + 1, high, x);// search in right
	}

	public static void main(String[] args) {

		/*
		 * TC : { 10, 15, 20, 20, 40, 40 }; {10,10,10,10,10},{ 10,15,20,20,40,40};
		 */
		int[] arr = {10,15,20,20,40,40};
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int search = 20;
		System.out.println("\nGiven element " + search + " last occurrence present at index : "
				+ findLastOccur(arr, 0, arr.length - 1, search));

	}

}
