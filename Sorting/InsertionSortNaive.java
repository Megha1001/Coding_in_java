package sorting;

public class InsertionSortNaive {
  //Time complexity : O(n^3)
	public static void main(String[] args) {
		int[] arr = {5,20,40,60,10,30};
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			for(int j = 0 ; j < i; j++) {
				if(arr[j] > arr[i]) {
					int temp = arr[i];
					for(int k = i - 1; k >= j; k--) {
						arr[k+1]= arr[k];
					}
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
