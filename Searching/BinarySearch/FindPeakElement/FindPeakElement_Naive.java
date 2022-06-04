//Peak element : element not less than it's neighbours

package searching;

public class FindPeakElement_Naive {

	//Time complexity : O(N)
  public static int findPeak(int[] arr, int n) {
		// one element
		if (n == 1) {
			return arr[0];
		}
		// first element is peak
		if (arr[0] >= arr[1]) {
			return arr[0];
		} // last element is peak
		
		if (arr[n - 2] <= arr[n - 1]) {
			return arr[n - 1];
		}
		
		// middle element is peak
		for (int i = 1; i < n - 1; i++) {
			if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
				return arr[i];
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		/*
		 * { 5, 7, 10, 6, 3 }
		 */
		int[] arr = { 8, 9, 10, 4, 5, 19, 7 };
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nPeak element is  " + findPeak(arr, arr.length));
	}

}
