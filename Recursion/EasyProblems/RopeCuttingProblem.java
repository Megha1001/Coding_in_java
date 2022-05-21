public class RopeCuttingProblem {
  
  //Time Complexity : O(3^n)
	public static int findMaxPossibleCuts(int n, int a, int b, int c) {
		if(n < 0) {
			return -1;
		}
		if(n == 0) {
			return 0;
		}
		
		int result = Math.max(findMaxPossibleCuts(n - a, a, b, c),
				Math.max(findMaxPossibleCuts(n - b, a, b, c), findMaxPossibleCuts(n - c, a, b, c)));
		
		if(result == - 1) {
			return -1;
		}else {
			return result +	1;
		}
		
	}
	public static void main(String[] args) {
		int n = 5, a = 2, b = 5, c = 1;
		System.out.println(findMaxPossibleCuts(n, a, b, c));
	}

}
