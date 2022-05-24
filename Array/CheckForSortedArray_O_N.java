package array;

// Return true if array is in ascending order
// {10,12,13,14,156}, {100}, {1,1,1,1,1} --> return true

public class CheckForSortedArray_O_N {
	
	//Time complexity : O(N)
	//Approach - 1
	public static boolean checkForSortedArray(int[] arr) {
		if(arr.length == 1) {
			return true;
		}
		int min = arr[0];
		boolean flag = true;
		for(int i = 1; i < arr.length ; i++) {
			if(min <= arr[i]) {
				min = arr[i];
			}else {
				flag = false;
			}
		}
		return flag;
	}
	
	//Time complexity : O(N)
	//Approach - 2
	public static boolean checkForSortedArrayAP2(int[]arr) {
		for(int i = 0; i +1 < arr.length; i++) {
			if(arr[i] > arr[i +1]) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int [] arr = {10,12,13,14,156};
		int [] arr1 = {100};
		int [] arr3 = {1,1,1,1,1};
		int [] arr4 = {24,7,2,3,-1};
		System.out.println("Is Array sorted ? "+checkForSortedArray(arr));
		System.out.println("Is Array sorted ? "+checkForSortedArray(arr1));
		System.out.println("Is Array sorted ? "+checkForSortedArray(arr3));
		System.out.println("Is Array sorted ? "+checkForSortedArray(arr4));
		
		System.out.println("------------------------------------------");
		
		System.out.println("Is Array sorted ? "+checkForSortedArrayAP2(arr));
		System.out.println("Is Array sorted ? "+checkForSortedArrayAP2(arr1));
		System.out.println("Is Array sorted ? "+checkForSortedArrayAP2(arr3));
		System.out.println("Is Array sorted ? "+checkForSortedArrayAP2(arr4));

	}

}
