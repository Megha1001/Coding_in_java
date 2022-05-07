public class RunLengthEncodingBruteForce {
	public static void countAlphabets(String input, int [] alphabets) {
		StringBuilder result = new StringBuilder();
		for(char c : input.toCharArray()) {
			alphabets[c -'a']++;
		}
		for(int i =0; i < alphabets.length ;i++) {
			if(alphabets[i] != 0) {
				result.append((char)(i+ 'a'));
				result.append(alphabets[i]);
			}
		}
		System.out.println(result.toString());
	}
	public static void main(String[] args) {
		String input = "aabbccddeeffzz";
		int [] alphabets = new int[26];
		
		countAlphabets(input, alphabets);
		
	}
}
