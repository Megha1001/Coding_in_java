package recursion;

public class FindSubsets {
	public static void printSubsets(String input, String curr, int idx) {
		if(idx == input.length()) {
			System.out.print(curr+" ");
			return;
		}
		
		// not included
		printSubsets(input, curr, idx + 1);
		// included
		printSubsets(input, curr + input.charAt(idx), idx + 1);
	}
	
	public static void main(String[] args) {
		 String input ="ABC";
		 printSubsets(input, "", 0);
	}

}
