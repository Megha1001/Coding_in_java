//TIME COMPLEXITY : O(M+N)
import java.util.Arrays;
public class InsertionOfTwoSortedArrayEfficient{
    
    public static void main(String [] args){
        
        int a[] = new int[]{3,5,10,10,10,15,15,20};
        int b[] = new int[]{5,10,10,15,30};
        
        int n1 = a.length;
        int n2 = b.length;
        printIntersectedElements(a, b, n1, n2);
    }
    
    static void printIntersectedElements(int[] a, int []b, int n1, int n2){
        
        // use merge function
        int i = 0;
        int j = 0;
        
        while(i < n1 && j < n2){
            //avoid duplicates
            if(i > 0 && a[i-1] == a[i]){
                ++i;
                continue;
            }else if(a[i] > b[j]){
                //if a[i] > b[j] then b[j] can never be appear in a's array since it is sorted
                ++j;
            }else if(a[i] < b[j]){
                //if b[j] > a[i] then a[i] can never be appear in b's array since it is sorted
                ++i;
            }else { //equals
                System.out.print(a[i]+" ");
                ++i;
                ++j;
            }
            
        }
        
    }
}
