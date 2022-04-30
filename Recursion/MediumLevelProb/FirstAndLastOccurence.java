
// Time Complexity - O(N)
public class FirstAndLastOccurence {
	public static int first = -1;
	public static int last = -1;
	public static void main(String[] args) {
		String input = "abaacdaefaah";
		char element = 'a';
		firstAndLastOcc(input, -1, element);
		System.out.println("First occurence of element '"+element+"' is at idx  "+first+" and last occurence is at "+last);
	}
	
	public static void firstAndLastOcc(String input, int currIdx, char element) {
		++currIdx;
		if(currIdx > input.length() - 1) {
			return ;
		}
		if(input.charAt(currIdx) == element) {
			if(first == -1) { // first occurence
				first = currIdx;
			}else {
				last = currIdx;
			}
		}
		firstAndLastOcc(input, currIdx, element);
		
	}

}


/*
OUTPUT
------------
First occurence of element 'a' is at idx  0 and last occurence is at 10
*/
