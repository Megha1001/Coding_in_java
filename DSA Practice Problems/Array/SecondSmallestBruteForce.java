import java.util.Arrays;

public class SecondSmallestBruteForce {
	public static int findSecondSmall(int [] arr) {
		int secSmall = Integer.MIN_VALUE;
		Arrays.sort(arr);
		secSmall = arr[1];
		
		return secSmall;
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,0,10,10};
		
		System.out.println(findSecondSmall(arr));

	}

}
