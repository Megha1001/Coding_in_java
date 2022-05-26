package array;

public class LeadersInAnArray_AP2 {
	
	  //Time Complexity :O(N), auxiliary space : θ(1)
	public static void findLeaders(int[] arr) {
		int len = arr.length;
		System.out.println("\nLeaders of given array are : ");
		int currLeader = arr[len - 1];
		System.out.print(currLeader+" ");
		for(int i = len - 2; i >= 0; i--) {
			if(arr[i] > currLeader) {
				currLeader = arr[i];
				System.out.print(currLeader+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		int [] arr = {7,10,4,10,6,5,2};
		System.out.println("Given Array : ");
		for(int i = 0; i< arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		findLeaders(arr);
	}

}
