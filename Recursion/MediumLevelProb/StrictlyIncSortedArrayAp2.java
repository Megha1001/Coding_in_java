public class StrictlyIncSortedArrayAp2 {
	public static boolean result = true;
	public static void main(String[] args) {
		int [] input = {1,2,3,4,5,8,9};
		System.out.println(isStrictlyInc(input, 0));
	}
	
	public static boolean isStrictlyInc(int [] input, int currIdx) {
		if(currIdx + 1 == input.length) {
			return result;
		}
		System.out.println(input[currIdx] +","+input[currIdx +1] );
		if(input[currIdx] >= input[currIdx + 1]) {
			result = false;
		}
		return  isStrictlyInc(input, currIdx +1);
	}

}
