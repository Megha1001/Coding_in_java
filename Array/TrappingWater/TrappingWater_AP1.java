package array;

public class TrappingWater_AP1 {

  //Time complexity : O(n^2), auxiliary space : θ(1)
	public static int findTotalTrpngWtr(int []arr, int n) {
		int result = 0;
		for(int i = 0; i < n; i++) {

			// max value in left of current element
			int leftMax = arr[i];
			for(int j = 0; j < i; j++) {
				leftMax = Math.max(leftMax, arr[j]);
			}
			
			// max value in right of current element
			int rightMax = arr[i];
			for(int j = i+1; j < n; j++) {
				rightMax = Math.max(rightMax, arr[j]);
			}
			
			result += Math.min(leftMax, rightMax) - arr[i];
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
