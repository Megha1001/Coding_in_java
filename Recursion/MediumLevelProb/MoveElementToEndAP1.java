public class MoveElementToEndAP1 {
	public static String resultString = "";
	public static int ctr = 0;
	public static void main(String[] args) {
		String input = "axbcxxd";
		char element = 'x';
		moveElementToEnd(input, 0,'x');
		for(int i = 0; i < ctr ;i++) {
			resultString += element;
		}
		System.out.println("Input string : "+ input);
		System.out.println("Resultant string : "+ resultString);
	}
	
	public static void moveElementToEnd(String input, int currIdx, char element) {
		if(currIdx == input.length()) {
			return;
		}
		if(input.charAt(currIdx) == element) {
			++ctr;
		}else {
			resultString += input.charAt(currIdx);
		}
		moveElementToEnd(input,currIdx + 1, element);
	}

}
