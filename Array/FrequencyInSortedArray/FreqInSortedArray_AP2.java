package array;

public class FreqInSortedArray_AP2 {
	
	public static void printFreq(int[] arr, int n) {
		System.out.println("Frequency of elements are as follows");
		int freq = 1; 
		int i = 1; //second element
		
		while(i < n) {
			while(i < n && arr[i - 1] == arr[i]) { // when last element is same as second last --> it falls here. For example - {10,10,10,30,30,30}
				++freq;
				++i;
			}
			System.out.println(arr[i - 1] +":"+freq);
			++i;
			freq = 1;
		}
		
		if(n == 1 || arr[n-1] != arr[n-2]) {// when last element != second last --> it falls here. For example - {10,10,10,30,30,40}
			System.out.println(arr[n-1]+":"+1);
		}
	}
	
	public static void main(String[] args) {
		int [] arr = {10,10,10,30,30,40};
		System.out.println("Given Array : ");
		for(int i = 0; i< arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		printFreq(arr,arr.length);
	}

}
