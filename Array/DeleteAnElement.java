public class DeleteAnElement {
	
	//Time Complexity : O(N)
	public static int deleteElment(int[] arr, int toDelete, int capacity) {
		int i = 0;
		int index = -1;
		for(i = 0; i < capacity ; i++) {
			if(arr[i] == toDelete) {
				index = i;
				break;
			}
		}
		
		if(i == capacity) {
			return capacity;
		}
		
		for(i = index ; i < capacity - 1; i++) {
			arr[i] = arr[i+1];
		}
		arr[capacity - 1] = 0;
		return capacity - 1;
	}

	public static void main(String[] args) {
		int [] arr = {3,4,12,5,6};
		int toDelete = 12;
		int capacity = 5;
		System.out.println("Capacity of array after deleting element is : "+deleteElment(arr, toDelete, capacity));

	}

}
