public class ValidAnagramAP2 {
	
	public static boolean isValidAnagram(String input, String toCheck) {
		
		if(input.length() != toCheck.length()) return false;
		
		int [] alphabets = new int[26];
		for(int i = 0; i < input.length() ;i++) {
			alphabets[input.charAt(i) - 'a']++;
		}
		for(int i = 0; i < toCheck.length() ;i++) {
			alphabets[toCheck.charAt(i) - 'a']--;
		}
		for(int i : alphabets) {
			if(i != 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String input = "anagram";
		String toCheck = "nagaram";
		
		System.out.println(isValidAnagram(input,toCheck));
	}
}
