package sorting;

public class IntersectionOf2SortedArraysNaive {

	public static void main(String[] args) {
		/*
		 * TCs :- 1. int[] arr1 = { 3, 5, 10, 10, 10, 15, 20 }; int[] arr2 = { 5, 10,
		 * 10, 15, 20 }; 2. int[] arr1 = { 1,1,3,3,3}; int[] arr2 = { 1,1,1,1,3,5,7 };
		 */
		int[] arr1 = { 0, 1, 3, 3, 3 };
		int[] arr2 = { 1, 1, 1, 1, 3, 5, 7 };
		int len1 = arr1.length;
		int len2 = arr2.length;
		// result array length will be minimum of two given arrays
		int[] result = (len1 < len2) ? new int[len1] : new int[len2];

		int count = 0;
		System.out.println("GIVEN ARRAYS : ");
		System.out.print("1 : ");
		//print 1st array
		for (int i = 0; i < len1; i++) {
			System.out.print(arr1[i] + " ");
		}
		//print 2nd array
		System.out.print("\n2 : ");
		for (int i = 0; i < len2; i++) {
			System.out.print(arr2[i] + " ");
		}

		for (int i = 0; i < len1; i++) {
			if (count != 0) {
				boolean flag = false;

				// is that element already seen?
				for (int j = 0; j < count; j++) {
					if (arr1[i] == result[j]) {
						flag = true;
						break;
					}
				}
				//if we are seeing that element for 1st time and it is not present in result array
				if (!flag) {
					for (int k = 0; k < len2; k++) {
						if (arr1[i] == arr2[k]) {
							result[count] = arr1[i];
							++count;
							break;
						}

					}
				}
			} else {
				//if we are seeing that element for 1st time and result array is empty
				for (int k = 0; k < len2; k++) {
					if (arr1[i] == arr2[k]) {
						result[count] = arr1[i];
						++count;
						break;
					}
				}
			}
		}
		System.out.print("\nINTERSECTION IS : ");
		for (int i = 0; i < count; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
