package sorting;


public class InsertionSort {
	
  //Time Complexity - O(N^2)
	public static void insertionSort(int[]arr, int n) {
		for(int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i-1;
			// check for greater element from Right to Left
			while(j >= 0 && arr[j] > key) { // > condition is for making this algo stable
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {5,20,40,60,10,30};
		insertionSort(arr, arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
