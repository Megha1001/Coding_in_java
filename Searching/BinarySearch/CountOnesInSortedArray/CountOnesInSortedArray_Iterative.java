package searching;

public class CountOnesInSortedArray_Iterative {

  //Time Complexity  : O(logN), auxiliary space : O(1)
	public static int countOnes(int[] arr, int n) {
		// all 0's
		if(arr[n] == 0) {
			return 0;
		}
		// all 1's
		if(arr[0] == 1) {
			return n + 1;
		}
		
		// 0's followed by 1's
		
		int low = 0;
		int high = n;
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] == 0) {
				// search in right;
				low = mid + 1;
			}else {
				//first occurrence --> either first element || first occurrence
				if(mid == 0 || arr[mid -1] != arr[mid]) {
					return n - mid + 1;
				}else { // middle element --> search for first occurrence in left
					high = mid - 1;
				}
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		int[] arr = { 0,0,1,1,1,1};
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nCount number of occurrence for element 1 is : "
				+ countOnes(arr,arr.length - 1));
	}

}
