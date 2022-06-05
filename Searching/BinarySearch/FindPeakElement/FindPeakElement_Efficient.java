package searching;

public class FindPeakElement_Efficient {

	//Time complexity : O(logN)
	public static int findPeak(int[] arr, int n) {
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;

			/* when first, last or mid element is peak;
			 * 1. first peak --> satisfy 1 & 4 
			 * 2. last peak --> satisfy 2 & 3
			 * 3. middle peak --> satisfy 2 & 4
			 */
			if (((mid == 0) || (arr[mid - 1] <= arr[mid])) && ((mid == n - 1) || (arr[mid + 1] <= arr[mid]))) {
				return mid;
			}
			//peak in left
			if(mid > 0 && arr[mid - 1] > arr[mid]) {
				high = mid - 1;
			}else {//peak in right
				low = mid + 1;
			}
		}
		return -1 ;// this will never reach , since there is peak in every independent array
	}

	public static void main(String[] args) {
		/*
		 * { 5, 7, 10, 6, 3 }
		 * { 5, 20, 40, 30, 20, 70, 60 }
		 */
		int[] arr = { 30,30, 20, 20, 70, 60 };
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nPeak element is  " + findPeak(arr, arr.length));
	}

}
