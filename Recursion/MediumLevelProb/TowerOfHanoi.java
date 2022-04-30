public class TowerOfHanoi {
	public static void main(String [] args) {
		System.out.println("Tower of Hanoi - O(2^N)");
		int n = 3;
		towerOfHanoi(n, "S", "H", "D");
	}
	
	public static void towerOfHanoi(int n, String source, String helper, String destination) {
		if(n == 1) {// base case
			System.out.println("Transfer disk "+n +" from "+ source+" to "+destination);
			return;
		}
		// transfer (n-1) disk to helper (S, H(D), D(H))
		towerOfHanoi(n-1, source, destination, helper);
		//transfer nth disk from source to destination
		System.out.println("Transfer disk "+n +" from "+ source+" to "+destination);
		towerOfHanoi(n-1, helper, source, destination);

	}
}
