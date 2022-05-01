public class BinarySearch {
	public static int binarySearch(int [] input, int start, int end, int search) {
		
		if(start < end) {
			int mid = start + (end - start)/2;
			
			if(input[mid] == search) {
				return mid;
			}
			
			if(input[mid] > search) {
				return binarySearch(input, start, mid - 1, search);
			}else {
				return binarySearch(input, mid + 1, end, search);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int [] input = { 2, 3, 4, 10, 40 };
		int search = 2;
		int index = binarySearch(input, 0, input.length - 1, search);
		if(index == -1) {
			System.out.println("Element not present in array");
		}else {
			System.out.println("Element present in array at index : "+index);
		}
	}
}
