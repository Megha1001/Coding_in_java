//Time Complexity : O((M+N)log(M+N))
import java.util.Arrays;

public class UnionOfTwoSortedArrayNaive {
    public static void main(String args[]) {
        int[] a1 = {3,5,8};
        int[] a2 = {2,8,9,10,15};
        
        printUnion(a1, a2, a1.length,  a2.length);
    }
    
    static void printUnion(int[] a1, int [] a2, int m, int n){
        
        //populate auxiliary array
        int [] c = new int[m+n];
        
        for(int i = 0; i < m; i++){
            c[i] = a1[i];
        }
        
        for(int i = 0; i < n; i++){
            c[m+i] = a2[i];
        }
        
        //sort the array
        Arrays.sort(c);
        
        //print without printing duplicates
        for(int i = 0; i < m+n; i++){
            
            if(i == 0 || c[i] != c[i-1]){
                System.out.print(c[i]+" ");
            }
        }
        
    }
}
