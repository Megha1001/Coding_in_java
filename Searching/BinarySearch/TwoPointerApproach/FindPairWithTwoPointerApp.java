package searching;

public class FindPairWithTwoPointerApp {

  /*
  * for sorted array the approach of two pointer is more efficient than hashing , with hashing our solution with have the time complexity of O(N) but also have 
  * auxiliary space requirement of O(1).
  */
  
  //Time Complexity : O(N)
	public static boolean findPair(int[] arr, int n, int x) {
		int leftPtr = 0;
		int rightPtr = n - 1;
		
		while(leftPtr < rightPtr) {
			int sum = arr[leftPtr] + arr[rightPtr];
			
			if(sum == x) {
				return true;
			}
			// sum > expected --> decrease right
			if(sum > x) {
				--rightPtr;
			}else { //sum < expected --> increase left
				++leftPtr;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {

		int[] arr = { 2, 5, 8, 12, 30 };
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int x = 17;
		System.out.println("\nis Pair Exists with sum " + x + "? :" + findPair(arr, arr.length, x));

	}

}
