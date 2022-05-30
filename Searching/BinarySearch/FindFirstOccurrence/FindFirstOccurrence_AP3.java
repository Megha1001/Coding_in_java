package searching;

public class FindFirstOccurrence_AP3 {
	
	//Time Complexity : O(logN), auxiliary space(1)
	public static int findFirstOccur(int[] arr, int low, int high, int x) {
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			if(arr[mid] > x) {
				high = mid - 1;
			}
			if(arr[mid] < x) {
				low = mid +1;
			}
			
			if(arr[mid] == x) {
				if(mid > 0 && arr[mid -1] == x) {
					high = mid - 1;
				}else {
					return mid;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 5,5,5,6,6,6,6,6};
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int search = 6;
		System.out.println(
				"\nGiven element " + search + " first occurrence present at index : " + findFirstOccur(arr, 0, arr.length - 1, search));
	}

}
