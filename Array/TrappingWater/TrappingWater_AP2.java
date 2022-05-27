package array;

public class TrappingWater_AP2 {

//Time Complexity : O(N), auxiliary space : θ(2N)
	public static int findTotalTrpngWtr(int [] arr, int n) {
		int[] left = new int[n];
		int[] right = new int[n];
		int result = 0;
		
		//max when traverse from left side
		left[0] = arr[0];
		for(int i = 1; i < n ; i++) {
			left[i] = Math.max(arr[i], left[i-1]);
		}
		
		//max when traverse from left side
		right[n-1] = arr[n-1];
		for(int i = n-2; i >= 0; i--) {
			right[i] = Math.max(arr[i], right[i+1]);
		}
		
		// find water trapped on each element 
		for(int i = 0; i < n; i++) {
			result += Math.min(left[i], right[i]) - arr[i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int [] arr = {3,0,1,2,5};
		System.out.println("Given Array : ");
		for(int i = 0; i< arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nTotal trapping water that we can collect is : "+findTotalTrpngWtr(arr,arr.length));
	}

}
