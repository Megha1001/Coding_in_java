package sorting;

import java.util.Arrays;

public class MergeTwoSortedArrayNaive {
	
	//Time Complexity : O((m+n)log(m+n))
	//Space complexity : θ(m+n)
	public static int[] mergeSort(int[]arr1, int[] arr2) {
		int x = arr1.length;
		int y = arr2.length;
		int [] merged = new int[x + y];
		
		for(int i = 0; i < x; i++) {
			merged[i] = arr1[i];
		}
		
		for(int i = 0; i < y; i++) {
			merged[x+i] = arr2[i];
		}
		
		Arrays.sort(merged);
		
		return merged;
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
