package array;

public class FreqInSortedArray_AP1 {
	
	public static void printFreq(int[] arr, int n) {
		System.out.println("Frequency of elements are as follows");
		if(arr[0] == arr[n -1]) {
			System.out.println(arr[0] +":"+n);
		}
		
		int prev = arr[0];
		int count = 1;
		
		for(int i = 1; i < n; i++) {
			if(arr[i] != prev) {
				System.out.println(prev +":"+count);
				prev = arr[i];
				count = 1;
			}else {
				++count;
			}
		}
		if(n > 1) {
			System.out.println(prev +":"+count);
		}
	}

	public static void main(String[] args) {
		int [] arr = {10};
		System.out.println("Given Array : ");
		for(int i = 0; i< arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		printFreq(arr,arr.length);
	}

}
