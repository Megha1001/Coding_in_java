public class SubSequences {
	public static void subSequences(String input, int idx, String newString) {
		if(idx == input.length()) {
			System.out.println(newString);
			return;
		}
		char currChar = input.charAt(idx);
		//to be
		subSequences(input, idx + 1, newString + currChar);
		// or not to be
		subSequences(input, idx + 1, newString);
	}
	
	public static void main(String[] args) {
		String input = "abc";
		subSequences(input, 0, "");
	}

}

/*
OUTPUT
---------
abc
ab
ac
a
bc
b
c
  // there is empty string as well
*/
