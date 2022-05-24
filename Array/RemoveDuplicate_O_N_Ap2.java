package array;

//Remove Duplicate elements in sorted array

public class RemoveDuplicate_O_N_Ap2 {

	//Time Complexity : O(N)
	//AuxilarySpace : O(1)
	public static int removeDuplicates(int [] arr) {
		int res = 1;
		for(int i = 1; i < arr.length ; i++) {
			if(arr[i] != arr[res - 1]) {
				arr[res] = arr[i];
				res++;
			}
		}
		
		return res;
		
	}
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,4,5,5,6,6,6,6};
		System.out.println("No of elements remains in array after removal of duplicates :"+removeDuplicates(arr));

	}
}
