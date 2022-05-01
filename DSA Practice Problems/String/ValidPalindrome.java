public class ValidPalindrome {

	public static boolean isPalindrome(String s) {
		String input = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		if (input.length() == 0) {
			return true;
		}
		for (int i = 0; i <= (input.length() - 1) / 2; i++) {
			if (!(input.charAt(i) == input.charAt(input.length() - 1 - i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		String result = isPalindrome(s) ? "palindrome.":"not a palindrome.";
		System.out.println("String is a "+result);

	}

}
