package sorting;

import java.util.Arrays;

public class UnionOf2SortedArraysNaive {

  //Time complexity : O((m+n)log(m+n))
	public static void printUnionElements(int[] a, int[] b, int m, int n) {
		 int[] merged = new int[m+n];
		 
		 for(int i = 0; i < m; i++) {
			 merged[i] = a[i];
		 }
		 
		 for(int j = 0; j < n; j++) {
			 merged[m+j] = b[j];
		 }
		 
		 Arrays.sort(merged);
		 for(int k =0; k < m+n; k++) {
			 if( k ==0 || merged[k-1] != merged[k]) {
				 System.out.print(merged[k]+" ");
			 }
		 }
	}
	
	public static void main(String[] args) {
		int[] a = { 3, 5, 8 };
		int[] b = { 2, 8, 9, 10, 15 };

		printUnionElements(a, b, a.length, b.length);

	}

}
