import java.util.Arrays;

public class ValidAnagramBruteForce {

	public static boolean isValidAnagram(String input, String toCheck) {
		
		if(input.length() != toCheck.length()) {
			return false;
		}
		
		int [] inputArr = new int [input.length()];
		int [] toCheckArr = new int [input.length()];
		for(int i = 0; i < input.length() ; i++) {
			inputArr[i] = input.charAt(i);
			toCheckArr[i] = toCheck.charAt(i);
		}
		Arrays.sort(inputArr);
		Arrays.sort(toCheckArr);
		for(int i = 0; i < input.length() ; i++) {
			if(inputArr[i] !=toCheckArr[i]) {
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
