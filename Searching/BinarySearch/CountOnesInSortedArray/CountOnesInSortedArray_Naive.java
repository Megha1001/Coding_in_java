package searching;

public class CountOnesInSortedArray_Naive {

  //Time Complexity  : O(N), auxiliary space : O(1)
	public static int countOnes(int[] arr, int n) {
		if(arr[0] == 1) {
			return n;
		}
		if(arr[n] == 0) {
			return 0;
		}
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == 1) return n-i +1;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = { 0,0,1,1,1,1 };
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nCount number of occurrence for element 1 is : "
				+ countOnes(arr,arr.length - 1));
	}

}
