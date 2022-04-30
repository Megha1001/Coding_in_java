public class RecursionEasyProb {
	public static void main(String [] args) {
		System.out.println("-----Natural number in desending order-----");
		int max = 5;
		printNumbersDec(max);
		System.out.println("-----Natural number in ascending order-----");
		int min = 1;
		printNumbersInc(min);
		System.out.println("-----Print N natural number-----");
		int sum = printNNaturalNumb(0, 10);
		System.out.println("Sum of N natural numbers : " + sum);
		System.out.println("-----Factorial of N-----");
		int fact = calFactorial(6);
		System.out.println("6! : " + fact);
		System.out.println("-----Fibonacci Series-----");
		System.out.println(0);
		System.out.println(1);
		printFibonacciSeries(0, 1, 7-2);
		System.out.println("-----Print x^n(stack height = n)-----");
		int xPowN = printXPowN(2,5);
		System.out.println("2^5 :"+xPowN);
		System.out.println("-----Print x^n(stack height = logn)-----");
		int xPowNLog = printXPowNLog(2,5);
		System.out.println("2^5 :"+xPowNLog);
	}
	
	public static void printNumbersDec(int max) {
		if(max == 0) {
			return;
		}
		System.out.println(max);
		--max;
		printNumbersDec(max);
	}
	
	public static void printNumbersInc(int min) {
		if(min ==6) {
			return;
		}
		System.out.println(min);
		printNumbersInc(++min);
	}
	
	public static int printNNaturalNumb(int start, int end) {
		if(start == end) {
			return 0;
		}
		++start;
		return start + printNNaturalNumb(start , end);
	}

	public static int calFactorial(int n) {
		if(n == 1) {
			return 1;
		}
		return n * calFactorial(n-1);
	}
	
	public static void printFibonacciSeries(int first, int second, int n) {
		if(0 == n) {
			return;
		}
		System.out.println(first + second);
		printFibonacciSeries(second, first + second, n -1);
	}
	
	public static int printXPowN(int x, int n) {
		if(n == 1) {
			return x;
		}
		return x * printXPowN(x, n-1);
	}
	
	public static int printXPowNLog(int x, int n) {
		if(n == 0) {
			return 1;
		}
		
		if(x == 0) {
			return 0;
		}
		
		if(n % 2 == 0) {// n is even
			return printXPowNLog(x, n/2) * printXPowNLog(x,n/2);
		}else { // n is old
			return printXPowNLog(x, n/2) * printXPowNLog(x,n/2) * x;
		}
		
	}
}

/*
-----Natural number in desending order-----
5
4
3
2
1
-----Natural number in ascending order-----
1
2
3
4
5
-----Print N natural number-----
Sum of N natural numbers : 55
-----Factorial of N-----
6! : 720
-----Fibonacci Series-----
0
1
1
2
3
5
8
-----Print x^n(stack height = n)-----
2^5 :32
-----Print x^n(stack height = logn)-----
2^5 :32

*/
