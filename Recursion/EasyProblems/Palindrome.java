public class Palindrome {
	public static boolean result = false;

  
  //Time complexity : O(n) and auxilary space : θ(N)
	public static boolean isPalindrome(String input, int start, int end) {
		if (start >= (end)) {
			return result;
		}
		result = input.charAt(start) == input.charAt(end) ? true : false;
		return result && isPalindrome(input, start + 1, end - 1);
	}

	public static void main(String[] args) {
		String input = "abababcbababa";

		if (input == null) {
			System.out.println(true);
		} else {
			System.out.println(isPalindrome(input, 0, input.length() - 1));
		}

	}

}
