public class FirstNonRepeatingCharInStr {

	public static void populateCountCharArray(String input, char[] count) {
		for(int i =0 ; i < input.length(); i++) {
			count[input.charAt(i)] ++;
		}
	}
	public static int findFirstNonRepChar(String input) {
		int NO_OF_CHARS= 256;
		char [] count = new char[NO_OF_CHARS];
		int index = -1;
		populateCountCharArray(input, count);
		
		for(int i =0 ; i < input.length(); i++) {
			if(count[input.charAt(i)] == 1) {
				return i;
			}
		}
		
		return index;
	}
	public static void main(String[] args) {
		String input = "zaabbcccddefg";
		
		int index = findFirstNonRepChar(input);
		if(index == -1) {
			System.out.println("Either array is empty or all characters are repeating");
		}else {
			System.out.println("First non-repeating character is : "+input.charAt(index));
		}

	}

}
