public class SecondSmallestO_N {

	public static void findSecondSmall(int[] arr) {
		if(arr.length < 2) {
			System.out.println("Second smallest elemnent not exists");
			return;
		}
		
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < first) {
				second = first;
				first = arr[i];
			}
			System.out.println(arr[i] +": "+first+":" +second);
			if(arr[i] < second  && arr[i] != first) {
				System.out.println("inside");
				second = arr[i];
			}
		}
		if(second == Integer.MAX_VALUE) {
			System.out.println("Second smallest elemnent not exists");
			return;
		}else {
			System.out.println("Second smallest element : "+second);
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 0, 10, 10};
		findSecondSmall(arr);
	}

}
