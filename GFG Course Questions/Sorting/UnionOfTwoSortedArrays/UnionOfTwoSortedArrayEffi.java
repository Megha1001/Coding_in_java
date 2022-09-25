//TIME COMPLEXITY : O(M+N)
import java.util.Arrays;

public class UnionOfTwoSortedArrayEffi{
    public static void main(String args[]) {
        int[] a1 = {3,5,8};
        int[] a2 = {2,8,9,10,15};
        
        printUnion(a1, a2, a1.length,  a2.length);
    }
    
    static void printUnion(int[] a1, int [] a2, int m, int n){
        
      //Merge Sort function
      
      int i = 0, j = 0;
      
      while(i < m && j < n){
          
          //duplicate in array a1 --> not to print
          if(i > 0 && a1[i] == a1[i-1]){
              ++i;
              continue;
          }
          
          //duplicate in array a2 --> not to print
          else if(j > 0 && a2[j] == a2[j-1]){
              ++j;
              continue;
          } 
          
          else if(a1[i] > a2[j]){
              System.out.print(a2[j]+" ");
              ++j;
          }
          
          else if(a1[i] < a2[j]){
              System.out.print(a1[i]+" ");
              ++i;
          }
          
          else{
              System.out.print(a1[i]+" ");
              ++i;
              ++j;
          }
          
      }
      
      while(i < m){
          if(i > 0 && a1[i] != a1[i-1]){
              System.out.print(a1[i]+" ");
              ++i;
          }
      }
      
      while(j < n){
          if(j > 0 && a2[j] != a2[j-1]){
              System.out.print(a2[j] +" ");
              ++j;
          }
      }
        
    }
}
