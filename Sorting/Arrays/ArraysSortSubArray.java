package sorting;

import java.util.Arrays;

public class ArraysSortSubArray {

	public static void main(String[] args) {
		int[] arr= {5,30,20,10,8};
		Arrays.sort(arr,1,4); //[start, end)
		System.out.println(Arrays.toString(arr));

	}

}
