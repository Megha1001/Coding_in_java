package array;

public class MaxLenEvenOddSubArray_AP1 {
	public static int result = 0;
//	public static int findmaxLenEvenOddSubArray(int[] arr, int i, int count) {
//		if( i == arr.length) {
//			return result;
//		}
//		
//		if(arr[i-1]%2 != arr[i]%2) {
//			++count;
//		}else {
//			count = 1;
//		}
//		result = Math.max(count, result);
//		System.out.println("arr[i] : "+arr[i]+" count : "+count);
//		return findmaxLenEvenOddSubArray(arr, i+1, count);
//	}
	
	//Time Complexity : O(N)
	public static int maxEvenOdd(int arr[], int n)
    {
       int count = 1;
       int result = 1;
        for(int i = 0; i < n-1; i++){
            if(arr[i]%2 != arr[i+1]%2){
                ++count;
                result = Math.max(result, count);
            }else{
                count = 1;
            }
        }
        return result;
    }
    

	public static void main(String[] args) {
		/*
		 * TC : {10,12,14,7,7,14,8}
		 */
		int[] arr = {88,28,19,94,57,90,84,14,50,9,25,69,93,18,70,25,24,29,47,50,14,87,72,14,65,50,68,30,68,60,37,79,93,87,63};
		System.out.println("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nMaximum sum for subarray is : " + maxEvenOdd(arr, arr.length));
	}

}
