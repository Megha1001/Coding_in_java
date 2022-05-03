public class RemoveConsecutiveChar {
	public static String removeConsecutive(String input) {
		String result = "";
		for(int i = 0; i< input.length(); i++) {
			int resultLen = result.length();
			char currChar = input.charAt(i);
			if(resultLen == 0 || result.charAt(resultLen -1) != currChar) {
				result += String.valueOf(currChar);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String input = "aabbbaaccbac";
		System.out.println(removeConsecutive(input));
	}

}
