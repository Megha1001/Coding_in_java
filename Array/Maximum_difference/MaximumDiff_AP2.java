package array;

public class MaximumDiff_AP2 {
	
	//Time Complexity : O(N)
	public static int getMaximumDiff(int [] arr, int n) {
		int res = arr[1] - arr[0];
		int minValue = arr[0];
		
		for(int i = 1; i < n; i++) {
			res = Math.max(res, arr[i] - minValue);
			minValue = Math.min(minValue, arr[i]);
		}
		
		return res;
	}
	
	
	public static void main(String[] args) {
		int [] arr = {2,3,10,6,4,8,1};
		System.out.println("Given Array : ");
		for(int i = 0; i< arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nMaximum difference is : "+getMaximumDiff(arr,arr.length));
	}

}
