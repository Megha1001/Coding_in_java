public class FirstNonRepeatingCharInArray {

	public static void populateCountCharArray(char[] input, char[] count) {
		for(int i =0 ; i < input.length; i++) {
			count[input[i]] ++;
		}
	}
	public static int findFirstNonRepChar(char[] input) {
		int NO_OF_CHARS= 256;
		char [] count = new char[NO_OF_CHARS];
		int index = -1;
		populateCountCharArray(input, count);
		
		for(int i =0 ; i < input.length; i++) {
			if(count[input[i]] == 1) {
				return i;
			}
		}
		
		return index;
	}
	public static void main(String[] args) {
		char[] input = {'a','c','c','a','b'};
		
		int index = findFirstNonRepChar(input);
		if(index == -1) {
			System.out.println("Either array is empty or all characters are repeating");
		}else {
			System.out.println("First non-repeating character is : "+input[index]);
		}

	}

}
