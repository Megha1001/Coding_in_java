package sorting;

public class IntersectionOf2SortedArraysNaiveApp2 {

	//Time Complexity : O(m*N)
	public static void main(String[] args) {
		int[] arr1 = { 0, 1, 3, 3, 3 };
		int[] arr2 = { 1, 1, 1, 1, 3, 5, 7 };
		
		for(int i = 0; i< arr1.length; i++) {
			if(i > 0 && arr1[i-1] == arr1[i]) {
				continue;
			}
			
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] ==  arr2[j]) {
					System.out.print(arr1[i]+" ");
					break;
				}
			}
		}

	}

}
