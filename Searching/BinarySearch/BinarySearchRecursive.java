package searching;

public class BinarySearchRecursive {

	/*Time Complexity :
	 *  1. Successful search : O(logN)
	 *	2. Unsuccessful search : θ(logN)
	 */
	public static int searchElement(int[] arr, int low, int high, int search) {
		if (low > high) {
			return -1;
		}
		
		int mid = low + (high - low) / 2;
		if (arr[mid] == search) {
			return mid;
		}
		
		return (arr[mid] > search) ? searchElement(arr, low, mid - 1, search)
				: searchElement(arr, mid + 1, high, search);

	}

	public static void main(String[] args) {
		int[] arr = { 10, 12, 15, 18, 20, 38 };
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int search = 28;
		System.out.println(
				"Given element " + search + " present at index : " + searchElement(arr, 0, arr.length - 1, search));
	}

}
