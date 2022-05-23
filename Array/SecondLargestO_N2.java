package array;

public class SecondLargestO_N2 {

	public static int getLargest(int[] arr, int length) {
		int max = arr[0];
		for(int i = 1; i <= length ; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int findSecondLarget(int[] arr, int length) {
		int largest = getLargest(arr, length);
		int secondLargest = -1;
		int idxSecondLargest = -1;
		for(int i = 0; i <= length ; i++) {
			if(secondLargest < arr[i] && arr[i] != largest) {
				secondLargest = arr[i];
				idxSecondLargest = i;
			}
		}
		return idxSecondLargest;
	}
	
	public static void main(String[] args) {
		int [] input = {1,5,5,5,5};
		System.out.println(findSecondLarget(input, input.length - 1));
	}

}
