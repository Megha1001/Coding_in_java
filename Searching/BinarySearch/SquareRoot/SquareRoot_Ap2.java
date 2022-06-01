package searching;

public class SquareRoot_Ap2 {
	
  // Time COmplexity : O(N)
	public static int findSqrRoot(int x) {
		int i =1;
		while( i * i <= x) {
			i++;
		}
		return i-1;
	}

	public static void main(String[] args) {
		int x = 13;
		System.out.println("Square root of x = "+x+" is : "+findSqrRoot(x));
		
	}

}
