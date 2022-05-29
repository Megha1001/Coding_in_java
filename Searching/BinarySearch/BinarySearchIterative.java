package searching;

public class BinarySearchIterative {

	
	/*Time Complexity :
	 *  1. Successful search : O(logN)
	 *	2. Unsuccessful search : θ(logN)
	 */
	public static int searchElement(int[] arr, int n , int search) {
		int low = 0;
		int high = n-1;
		
		while(low <= high) {
			int mid = low + (high-low)/2;
			if(arr[mid] == search) {
				return mid;
			}
			else if (arr[mid] > search) {
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int [] arr = {10,12,15,18,20,38};
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int search = 20;
		System.out.println("Given element "+search+" present at index : "+ searchElement(arr, arr.length,search));
	}

}
