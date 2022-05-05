public class FloorInSortedArrBruteForce {
	public static int findFloorIdx(int [] input, int key) {
		if(key > input[input.length -1]) {
			return input.length -1;
		}
		if(key == input[0]) {
			return 0;
		}
		for(int i = 1; i < input.length ;i++) {
			if(input[i] == key) {
				return i;
			}
			System.out.println(input[i]+":"+(key < input[i]) + ":" +input[i]);
			if(input[i - 1] <= key && key < input[i]) {
				return i -1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int [] input = {1, 2, 8, 10, 10, 12, 19};
		int k = 9;
		int idx = findFloorIdx(input, k);
		if(idx == -1) {
			System.out.println("Floor doesn't exist in array");
		}else {
			System.out.println("Floor for element "+k+" :"+input[idx]);
		}
	}

}
