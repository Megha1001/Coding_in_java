package array;

//Find Leader : Leader of array are those elements for which there is no element on RHS of array which is >= to the element
public class LeadersInAnArray_AP1 {
	
  //Time Complexity :O(N^2), auxiliary space : θ(1)
	public static void findLeaders(int [] arr) {
		System.out.println("\nLeaders of given array are : ");
		for(int i = 0; i < arr.length -1 ; i++) {
			int flag = 0;
			for(int j = i+1; j < arr.length ; j++) {
				if(arr[i] <= arr[j]) {
					flag++;
					break;
				}
			}
			if(flag == 0) {
				System.out.print(arr[i] +" ");
			}
		}
		//last element will always be leader
		System.out.print(arr[arr.length - 1]);
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
