public class ReverseAString {
	public static void main(String[] args) {
		String input = "abcd";
		reverseString(input, input.length() - 1);
	}

	public static void reverseString(String input, int idx) {
		if(idx == 0) {
			System.out.println(input.charAt(idx));
			return;
		}
		System.out.print(input.charAt(idx));
		reverseString(input, idx - 1);
	}
}

/*OUTPUT
---------------
dcba
*/
