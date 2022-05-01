//Question link : https://www.geeksforgeeks.org/chocolate-distribution-problem/
public class ChocolateDistributionProblemUsingMergeSort {
	public static void merge(int [] input, int start, int mid, int end) {
		int [] merged = new int[end - start + 1];
		int idx1 = start;
		int idx2 = mid+1;
		int x = 0;
		
		while(idx1 <= mid && idx2 <= end) {
			if(input[idx1] <= input[idx2]) {
				merged[x++] = input[idx1++];
			}else {
				merged[x++] = input[idx2++];
			}
		}
		
		while(idx1 <= mid) {
			merged[x++] = input[idx1++];
		}
		while(idx2 <= end) {
			merged[x++] = input[idx2++];
		}
		
		for(int i = 0, j = start; i < merged.length ; i++, j++) {
			input[j] = merged[i];
		}
	}
	
	public static void mergeSort(int[] input, int start, int end) {
		if(start >= end) {
			return;
		}
		int mid = start + (end - start)/2;
		mergeSort(input, start, mid);
		mergeSort(input, mid+1, end);
		merge(input, start, mid , end);
	}
	
	public static void main(String[] args) {
		int [] input = {12, 4, 7, 9, 2, 23, 25, 41, 
				30, 40, 28, 42, 30, 44, 48, 
				43, 50};
		int stds = 7;
		
		mergeSort(input,0, input.length -1);
		int min = input[stds-1] -input[0];
		for(int i = 1 ; i<= input.length - stds; i++) {
			if(input[stds - 1 + i] - input[i] < min) {
				min = input[stds - 1 + i] - input[i];
			}
		}
		System.out.println(min);
	}

}
