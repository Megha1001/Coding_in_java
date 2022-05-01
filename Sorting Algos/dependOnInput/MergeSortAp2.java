public class MergeSortAp2 {

	public static void conquer(int [] input, int start, int mid, int end) {
		int [] merged = new int[end - start + 1];
		
		int idx1 = start;
		int idx2 = mid +1;
		int x =0;
		
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
	public static void divide(int [] input, int start, int end) {
		if(start >= end) {
			return;
		}
		int mid = start + (end - start)/2;
		divide(input, start, mid);
		divide(input, mid + 1, end);
		conquer(input, start, mid, end);
	}
	
	public static void main(String[] args) {
		int [] input = {1, 3, 8, -2, 6, -8, 5};
		divide(input, 0, input.length - 1);
		
		for(int i = 0; i < input.length ; i++) {
			System.out.print(input[i] +" ");
		}
	}

}
