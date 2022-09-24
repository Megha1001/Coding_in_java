//TIME COMPLEXITY : O(M*N)
import java.util.Arrays;
public class InsertionOfTwoSortedArrayNaive{
    
    public static void main(String [] args){
        
        int a[] = new int[]{3,5,10,10,10,15,15,20};
        int b[] = new int[]{5,10,10,15,30};
        
        int n1 = a.length;
        int n2 = b.length;
        printIntersectedElements(a, b, n1, n2);
    }
    
    static void printIntersectedElements(int[] a, int []b, int n1, int n2){
        
        //for every element in 1st array , check whether it is present in second array but dont print duplicates
        for(int i = 0; i < n1; i++){
            //check for duplicate
            if(i > 0 && a[i] == a[i-1]){
                //already discovered
                continue;
            }
            for(int j = 0; j < n2; j++){
                if(a[i] == b[j]){
                    System.out.print(a[i]+" ");
                    //once found to avoid duplicates
                    break;
                }
            }
        }
        
    }
}
