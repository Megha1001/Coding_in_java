package sorting;

import java.util.Arrays;
import java.util.Collections;// it is Collections (Utility class) not Collection(interface)

public class ReverseOrderWithCollectionAndArrays {

	public static void main(String[] args) {
		Integer [] arr = {6,3,9,0,2,7};
		
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));

	}

}
