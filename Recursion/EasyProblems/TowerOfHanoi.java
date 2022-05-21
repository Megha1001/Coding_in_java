public class TowerOfHanoi {

	public static void towerOfHanoi(int n, String source, String helper, String destination) {
		
		if(n == 0) return;
		
		towerOfHanoi(n - 1, source, destination, helper);
		System.out.println("Move disc "+n+" from "+source+" to " +destination);
		towerOfHanoi(n - 1, helper, source, destination);
	}
	public static void main(String[] args) {
		 int n = 3;
		 towerOfHanoi(n, "S", "H", "D");
	}

}
