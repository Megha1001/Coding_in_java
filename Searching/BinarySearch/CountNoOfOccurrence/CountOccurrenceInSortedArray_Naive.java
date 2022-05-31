package searching;

public class CountOccurrenceInSortedArray_Naive {

  //Time complexity : O(N), auxiliary space : O(1)
	public static int countNoOfOccu(int[] arr, int n, int x) {
		int count = 0;
		
		for(int i = 0; i <= n; i++) {
			if(arr[i] == x) ++count;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = { 5, 5, 5, 6, 6, 6, 6, 6 };
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int search = 6;
		System.out.println("\nCount number of occurrence for element " + search + " is : "
				+ countNoOfOccu(arr,arr.length - 1, search));
	}

}
