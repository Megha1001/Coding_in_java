public class RemoveDuplicatesAP2 {
	public static boolean [] map = new boolean[26];
	public static void main(String[] args) {
		String input = "abbccdee";
		removeDup(input, "", 0);
	}

	public static void removeDup(String input, String newString, int currIdx) {
		if(currIdx == input.length()) {
			System.out.println(newString);
			return;
		}
		char currChar = input.charAt(currIdx);
		if(!map[currChar - 'a']) {
			newString += currChar;
			map[currChar - 'a'] = true;
		}
		removeDup(input, newString, currIdx + 1);
	}
}
