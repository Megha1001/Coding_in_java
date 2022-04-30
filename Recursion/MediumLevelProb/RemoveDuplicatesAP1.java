package medium;

public class RemoveDuplicatesAP1 {

	public static void main(String[] args) {
		String input = "abbccd44433ee";
		removeDup(input, "", 0);
	}

	public static void removeDup(String input, String newString, int currIdx) {
		if(currIdx == input.length()) {
			System.out.println(newString);
			return;
		}
		String currString = String.valueOf(input.charAt(currIdx));
		if(!newString.contains(currString)) {
			newString +=currString;
		}
		removeDup(input,newString, currIdx+1);
	}
}
