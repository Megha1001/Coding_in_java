package searching;

public class LastOccurrence_Naive {

	public static int findLastOccur(int[] arr, int n, int x) {
		for(int i = n-1; i >=0; i--) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,15,20,20,40,40};
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int search = 20;
		System.out.println("\nGiven element " + search + " last occurrence present at index : "
				+ findLastOccur(arr,arr.length - 1, search));

	}

}
