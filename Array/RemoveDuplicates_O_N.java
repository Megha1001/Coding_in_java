public class RemoveDuplicates_O_N {

	//Time Complexity : O(N)
	//AuxilarySpace : O(N)
	public static int removeDuplicates(int [] arr) {
		int[] temp = new int[arr.length];
		temp[0] = arr[0];
		//create space for new element
		int res = 1;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != temp[res -1]) {
				temp[res] = arr[i];
				res++;
			}
		}
		
		for(int i = 0; i < res; i++) {
			arr[i] = temp [i];
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,4,5,5,6,6,6,6};
		System.out.println("No of elements remains in array after removal of duplicates :"+removeDuplicates(arr));

	}

}
