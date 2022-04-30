package medium;

public class StrictlyIncSortedArrayAp1 {
	public static boolean result = true;
	public static void main(String[] args) {
		int [] input = {1,2,3,4,5,8,9,0};
		System.out.println(isStrictlyInc(input, 0));
	}
	
	public static boolean isStrictlyInc(int [] input, int currIdx) {
		if(currIdx + 1 == input.length) {
			return result;
		}
		System.out.println(input[currIdx] +","+input[currIdx +1] );
		if(input[currIdx] < input[currIdx + 1]) {
			isStrictlyInc(input, currIdx +1);
		}
		else {
			result = false;
		}
		return result;
	}

}
