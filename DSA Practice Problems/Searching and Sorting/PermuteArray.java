import java.util.Arrays;
public class PermuteArray {
	
public static boolean isPossible(long a[], long b[], long n, long k) {
        
        Arrays.sort(a);
        Arrays.sort(b);
        for(long i = 0 ; i< n; i++){
            if(!(a[(int) i] + b[(int) (n -1-i)] >=k)){
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		long a []= { 1, 2, 3 };
		long b [] = {7,8,9};
		int n = 3;
		int k = 10;
		System.out.println(isPossible(a,b,n,k));

	}

}
