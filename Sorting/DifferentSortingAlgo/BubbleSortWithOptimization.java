package sorting;

public class BubbleSortWithOptimization {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7};
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			boolean swapped = false;
			/*
			 * for ex : arr --> 5,1,2,3,4 --> (after 1st pass)--> 1,2,3,4,5 --> after this break --> so to do this take variable swapped inside for
			 * if we declare outside for loop, then in 1st pass it will become true in loop will run for O(n^2) times
			 */
			for(int j = 0; j < n -1 -i; j++) {
				if(arr[j] > arr[j+1]) {
					//swap
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}
			//if after is either sorted or now sorted
			if(!swapped) {
				break;
			}
		}

		for(int i = 0; i < n-1; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
