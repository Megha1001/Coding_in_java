package array;

public class SecondLargestO_N {

	public static int findSecondLarget(int[]arr, int len) {
		// declare index
		int result = -1, largest =0;
		
		for(int i = 1 ; i <= len ; i++) {
			if(arr[i] > arr[largest] ) {
				result = largest;
				largest = i;
			}else if(arr[i] != arr[largest]) {
				if( result == -1 || arr[result] < arr[i]) {
					result = i;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int [] input = {1,5,5,5,5};
		System.out.println("Index of second largest element is "+findSecondLarget(input, input.length - 1));

	}

}
