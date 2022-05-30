package searching;

public class FindFirstOccurrence_AP1 {

	//Time Complexity : O(logN), auxiliary space(logN)
	public static int findFirstOccur(int[] arr, int low, int high, int x) {
		if(low > high) {
			return -1;
		}
		
		int mid = low +(high - low)/2;
		if(arr[mid] == x) {
			if(mid > 0 && arr[mid - 1] == x) {
				return findFirstOccur(arr, low, mid - 1, x);
			}else {
				return mid;
			}
		}
		
		return (arr[mid] > x) ? findFirstOccur(arr, low, mid - 1, x)
				: findFirstOccur(arr, mid + 1, high, x);
	}
	
	public static void main(String[] args) {
		int[] arr = { 5,5,5 };
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int search = 5;
		System.out.println(
				"\nGiven element " + search + " first occurrence present at index : " + findFirstOccur(arr, 0, arr.length - 1, search));
	}

}
