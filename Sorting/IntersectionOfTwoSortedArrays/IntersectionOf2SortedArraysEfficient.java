package sorting;

public class IntersectionOf2SortedArraysEfficient {

	/*
	 * Approach : Use merge function of merge Sort
	 * Use below condition to compare element of 1st array from 2nd array
	 * 4. if( i >0 && a[i-1] =a[i]) --> that means we have already considered that element earlier and this is duplicate entry --> continue
	 * 1. if (a[i] > b[j]) --> there is a possibility to have same element on right of j --> ==j;
	 * 2. if (a[i] < b[j]) --> if the smallest element of a[i] is less than b[j] then there will be no possibility that that element can be present at right of j --> ++i
	 * 3. if(a[i] == b[j]) --> print , ++i; ++j
	 */
	
	public static void printCommonElements(int[]arr1, int[] arr2, int len1, int len2) {
		int i = 0, j = 0;
		while(i < len1 && j < len2) {
			if(i > 0  && arr1[i-1] == arr1[i]) {
				continue;
			}
			if(arr1[i] > arr2[j]) {
				++j;
			}else if(arr1[i] < arr2[j]) {
				++i;
			}else {
				System.out.print(arr1[i]+" ");
				++i;
				++j;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = { 0, 1, 3, 3, 3 };
		int[] arr2 = { 1, 1, 1, 1, 3, 5, 7 };
		
		printCommonElements(arr1,arr2,arr1.length, arr2.length);

	}

}
