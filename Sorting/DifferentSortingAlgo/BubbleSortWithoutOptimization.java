package sorting;

public class BubbleSortWithoutOptimization {

	//Time complexity : O(N^2)
	public static void main(String[] args) {
		int[] input = {4,3,2,1};
		int size = input.length;
		for(int i = 0; i < size - 1; i++) { // n-1 pass
//			System.out.println(" i  "+i);
			for(int j = 0; j < size - 1 - i; j++) {
				//out of order
				if(input[j] > input[j+1]) {
//					System.out.println("j---"+j);
					//swap
					int temp 	= input[j+1];
					input[j+1] 	= input[j];
					input[j] 	= temp;
				}
			}
		}
		for(int i = 0; i < size; i++) {
			System.out.print(input[i]+" ");
		}
	}

}
