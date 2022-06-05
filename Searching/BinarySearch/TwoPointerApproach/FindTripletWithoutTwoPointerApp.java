package searching;

public class FindTripletWithoutTwoPointerApp {

  //Time Complexity : O(N^3)
	public static boolean findTriplet(int[]arr, int n, int x) {
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				for(int k = j+1; k < n; k++) {
					if(arr[i]+arr[j]+arr[k] == x) {
						return true;
					}
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 8, 9, 20, 40 };
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int x = 32;
		System.out.println("\nis Triplet Exists with sum " + x + "? :" + findTriplet(arr, arr.length, x));

	}

}
