package searching;

public class SquareRoot_BinarySearch {
	
	/*
	 * APPROACH  : BINARY SEARCH
	 * 1. Declare low as 1 and high as x
	 * 2. find mid  and then compute midSqr = mid * mid
	 * 3. if midSqr ==x, returns mid;
	 * 4. if midSqr > x --> search in left
	 * 5. if midSqr < x --> search on right , but store the result upto this point
	 */
	
	
	public static int findSqrRoot(int x) {
		int low = 1;
		int high = x;
		int ans = -1;
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			int midSqr = mid * mid;
			
			if(midSqr == x) {
				return mid;
			}else if( midSqr > x) {
				high = mid -1;
			}else { /// x > midSqr --> righ side
				low = mid + 1;
				ans = mid; //bestest possible till now
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int x = 16;
		System.out.println("Square root of x = "+x+" is : "+findSqrRoot(x));
		
	}

}
