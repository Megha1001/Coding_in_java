public class AdjacentDifferenceAtMostK {
	public static int search (int arr[], int n, int x, int k) {
        for(int i = 0; i < n ; ){
            if(arr[i] == x){
                return i;
            }
            int abs = Math.abs(arr[i] - x)/k;
            i = i+ Math.max(abs,1);
        }
        return -1;
    }
	public static void main(String[] args) {
		int [] input = {4, 5, 6, 7, 6};
		System.out.println(search(input, input.length, 6, 1));

	}

}
