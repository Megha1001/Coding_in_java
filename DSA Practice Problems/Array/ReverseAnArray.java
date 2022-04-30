public class ReverseAnArray {
	
	public static void reverseArray(int [] input, int start, int end) {
		if(start > end) {
			for(int i = 0; i< input.length ; i ++) {
				System.out.println(input[i]);
			}
			return;
		}
		int temp = input[start];
		input[start] = input[end];
		input[end] = temp;
		reverseArray(input, start + 1, end - 1);
	}
	
	public static void main(String[] args) {
		int [] input = {1,2,5,6,7,8,9,10};
		
		// APPROACH - 1 Iterative way - single array - TC - O(2N)
		for(int i = 0 ; i < input.length/2 ; i++) {
			int temp = input[i];
			input[i] = input[input.length - 1 - i];
			input[input.length - 1 - i] = temp;
		}
		
		for(int i = 0; i< input.length ; i++) {
			System.out.println(input[i]);
		}
		
		// APPROACH - 2 - Recursive way
		
		reverseArray(input, 0, input.length - 1);
	}

}
