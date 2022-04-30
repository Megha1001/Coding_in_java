public class MinAndMaxBruteForce {
	
	public static void main(String[] args) {
	 int [] input = {1,2,3,5,10,6,0,-1};
	 int max = input[0];
	 int min = input[0];
	 
	 // Approach - 1 --> O(N) - Iteration
	 for(int i = 1 ; i < input.length ; i++) {
		 if(max < input[i]) {
			 max = input[i];
		 }
		 if(min > input[i]) {
			 min = input[i];
		 }
	 }
	 System.out.println("Max : "+max+ " , Min : "+min);
	 
	 // Approach - 2 - Recursion
	 minAndMax(input,min, max,1);
	}

	public static void minAndMax(int [] input, int min, int max, int idx) {
		if(idx == input.length) {
			System.out.println("Max : "+max+ " , Min : "+min);
			return;
		}
		
		if(max < input[idx]) {
			max = input[idx];
			
		}else if(min > input[idx]) {
			 min = input[idx];
		}
		
		minAndMax(input, min, max, idx +1);
	}
	
}
