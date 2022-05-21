package recursion;

public class SumOfDigits {
  //Time complexity : Θ(d), auxiliary space :  Θ(d)
	public static int sumOfDigits(int input) {
		if(input == 0) {
			return 0;
		}
		return (input%10) + sumOfDigits(input/10);
	}
	
	public static void main(String[] args) {
		int input = 10007392;
		
		System.out.println(sumOfDigits(input));

	}

}
