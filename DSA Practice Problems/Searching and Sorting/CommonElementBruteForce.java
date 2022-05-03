public class CommonElementBruteForce {
	public static void findCommonElementInSortedArr(int [] ar1, int [] ar2, int [] ar3) {
		System.out.println("Inside func");
		for(int i =0; i < ar1.length ;i++) {
			boolean flag = false;
			int element = -1;
			for(int j =0; j < ar2.length ;j++) {
				if(ar1[i] == ar2[j]) {
					element = ar1[i];
				}
			}
			for (int k = 0; k < ar3.length; k++) {
				if (element == ar3[k]) {
					flag = true;
				}
			}
			if(flag) {
				System.out.print(ar1[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int[] ar1 = {1, 5, 5} ;
		int[] ar2 = {3, 4, 5, 5, 10}  ;
		int[] ar3 = {5, 5, 10, 20}  ;
		findCommonElementInSortedArr(ar1,ar2,ar3);

	}

}
