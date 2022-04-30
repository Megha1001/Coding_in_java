public class MinAndMaxLinearSearchBruteForce {
	static class Pair{
		int min;
		int max;
	}
	
	public static Pair getMinAndMax(int [] input, int size) {
		Pair pair = new Pair();
		
		if(size == 1) {
			pair.min = input[0];
			pair.max = input[0];
			return pair;
		}
		
		if(size ==2) {
			if(input[0] > input[1]) {
				pair.min = input[0];
				pair.max = input[1];
				return pair;
			}else {
				pair.min = input[1];
				pair.max = input[0];
				return pair;
			}
		}
		
		for(int i = 2 ; i < input.length ; i++) {
			 if(pair.max < input[i]) {
				 pair.max  = input[i];
			 }
			 if(pair.min > input[i]) {
				 pair.min = input[i];
			 }
		 }
		return pair;
		
	}
	public static void main(String[] args) {
	 int [] input = {1,2,3,5,10,6,0,-1};
	 Pair minMax = getMinAndMax(input, input.length);
	 System.out.println("Max : "+minMax.max+ " , Min : "+minMax.min);
	}
	
}
