package searching;

public class FindFirstOccurrence_AP2 {

	//Time Complexity : O(N)
	public static int findFirstOccur(int[]arr, int n , int x) {
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = { 5,5,5 };
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int search = 5;
		System.out.println(
				"\nGiven element " + search + " first occurrence present at index : " + findFirstOccur(arr, arr.length - 1, search));
	}

}
