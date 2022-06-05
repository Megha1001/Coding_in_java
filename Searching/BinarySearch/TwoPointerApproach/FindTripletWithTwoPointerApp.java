package searching;

public class FindTripletWithTwoPointerApp {

  //Time Complexity : O(N^2)
	public static boolean findTriplet(int[]arr, int n, int x) {
		for(int i = 0; i < n; i++) {
			if(findPair(arr, i+1, n-1, x-arr[i]))
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean findPair(int[]arr, int low, int high, int x) {
		
		while(low < high) {
			int sum = arr[low] + arr[high];
			
			if(sum == x) {
				return true;
			}else if(sum > x) {
				--high;
			}else {
				++low;
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
