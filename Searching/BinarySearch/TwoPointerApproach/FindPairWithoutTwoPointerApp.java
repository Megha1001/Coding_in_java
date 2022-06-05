package searching;

/*
 * Ques : Given an sorted array and a number x, we need to find if there is a pair in the array with sum equals to x
 */

public class FindPairWithoutTwoPointerApp {
	
	//Time Complexity : O(N*N)
	public static boolean findPair(int[]arr, int n , int x) {
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n;j++) {
				if(arr[i] + arr[j] == x) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = { 2,5,8,12,30 };
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int x = 17;
		System.out.println("\nis Pair Exists with sum "+x+"? :" + findPair(arr, arr.length, x));

	}
}
