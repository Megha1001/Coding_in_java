package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {10,5,8,20,12,18};
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			int minIdx = i;
			for(int j = i+1; j < n; j++) {
				if(arr[minIdx] > arr[j]) {
					minIdx = j;
				}
			}
//			System.out.println("minIdx : "+minIdx);
			// ith index element is not smallest --> need to swap
			if(minIdx != i) {
				int temp = arr[minIdx];
				arr[minIdx] = arr[i];
				arr[i] = temp;
			}
		}
		
		//printing of array
		for(int i=0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
