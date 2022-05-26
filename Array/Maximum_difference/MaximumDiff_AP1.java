package array;
//Maximum difference of arr[j] - arr[i] such that j>i
public class MaximumDiff_AP1 {

  //Time complexity : O(N^2)
	public static int getMaximumDiff(int [] arr, int n) {
		int max = Integer.MIN_VALUE;
		for(int i  = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				max = Math.max(arr[j] -arr[i], max);
			}
		}
		
		return max;
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
