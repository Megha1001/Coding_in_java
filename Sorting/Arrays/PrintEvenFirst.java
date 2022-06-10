package sorting;

import java.util.Arrays;
import java.util.Comparator;

class MyComp implements Comparator<Integer>{
	
	public int compare(Integer a, Integer b) {
		return a%2 - b%2;
	}
}

public class PrintEvenFirst {

	public static void main(String[] args) {
		
		Integer [] arr = {5,20,10,3,12};
		Arrays.sort(arr, new MyComp());
		System.out.println(Arrays.toString(arr));

	}

}
