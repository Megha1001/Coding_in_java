public class MinAndMaxTournamentMethod {
	static class Pair{
		int min;
		int max;
	}
	
	public static Pair getMinAndMax(int [] input, int start, int end) {
		Pair minMaxPair = new Pair();
		
		if(start == end) {
			minMaxPair.min = minMaxPair.max = input[0];
			return minMaxPair;
		}
		
		if(end == start +1) {
			if(input[start] > input[end]) {
				minMaxPair.max = input[start];
				minMaxPair.min = input[end];
			}else {
				minMaxPair.max = input[end];
				minMaxPair.min = input[start];
			}
			return minMaxPair;
		}
		
		
		int mid = (start + end)/2;
		Pair minMaxPairleft = getMinAndMax(input, start, mid);
		Pair minMaxPairRight = getMinAndMax(input, mid + 1, end);
		
		if(minMaxPairleft.min < minMaxPairRight.min) {
			minMaxPair.min = minMaxPairleft.min;
		}else {
			minMaxPair.min = minMaxPairRight.min;
		}
		
		if(minMaxPairleft.max > minMaxPairRight.max) {
			minMaxPair.max = minMaxPairleft.max;
		}else {
			minMaxPair.max = minMaxPairRight.max;
		}
		
		return minMaxPair;
	}
	
	public static void main(String[] args) {
		int [] input =  {1,20,3,5,10,6,0,-1};
		Pair minMax = getMinAndMax(input, 0 , input.length - 1);
		System.out.println("Max : "+minMax.max+" | Min : "+minMax.min);
	}

}
