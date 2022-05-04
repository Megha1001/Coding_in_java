public class CeilInSortedArrBruteForce {
	public static int findCeilIdx(int[] input, int k) {
		if(k < input[0]) {
			return 0;
		}
		
		for(int i = 0; i < input.length - 1; i++) {
			if(input[i]== k) {
				return i;
			}
			
			if(input[i] < k && k <= input[i+1]) {
				return i+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int [] input = {1, 2, 8, 10, 10, 12, 19};
		int k = 20;
		int idx = findCeilIdx(input, k);
		if(idx == -1) {
			System.out.println("Ceil doesn't exist in array");
		}else {
			System.out.println("Ceil for element "+k+" :"+input[idx]);
		}
	}

}
