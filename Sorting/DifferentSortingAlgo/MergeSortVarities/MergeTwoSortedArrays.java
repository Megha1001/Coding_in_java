package sorting;

public class MergeTwoSortedArrays {

	//Time Complexity : O(m+n)
	public static int[] mergeSort(int[] arr1, int[] arr2) {
		int[] mergedArr = new int[arr1.length + arr2.length];
		
		//idx to monitor first array
		int idx1 = 0;
		
		//idx to monitor second array
		int idx2 = 0;
		
		//idx to monitor merged array
		int x = 0;
		
		while(idx1 < arr1.length && idx2 < arr2.length) {
			if(arr1[idx1] <= arr2[idx2]) { // to ensure sability --> put =
				mergedArr[x++] = arr1[idx1++];
			}else {
				mergedArr[x++] = arr2[idx2++];
			}
		}
		
		while(idx1 < arr1.length) {
			mergedArr[x++] = arr1[idx1++];
		}
		
		while(idx2 < arr2.length) {
			mergedArr[x++] = arr2[idx2++];
		}
		
		return mergedArr;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {10,15,20};
		int[] arr2 = {5,6,6,15};
		int[] result = mergeSort(arr1,arr2);
		for(int i = 0; i< result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}

}
