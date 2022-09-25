/*
Pivot index is given and requirement is to partition the array based on that pivot index

TIME COMPLEXITY : O(N), and one traversal

Approach :
1. swap the pivot elment with last element
2. Apply Lumoto's partition
*/
import java.util.Arrays;

public class PartitionLomutoWithGivenPivotIndex{
    
    public static void main(String args[]) {
        int[] arr = {10,80,30,90,40,50,70};
        int pidx = 4; //pivot index
        partition(arr, 0, arr.length-1,pidx);
        System.out.println("Array after partition is : "+Arrays.toString(arr));
    }
    
    
    static void partition(int[] arr, int l, int h, int p){
       
       //swap pivot element with last
       int temp1 = arr[p];
       arr[p] = arr[h];
       arr[h] = temp1;
       
       
       //Standard lomuto's partition
       int pivot = arr[h];
       
       //for smaller element
       int i = l-1;
       
       for(int j = l; j <= h-1; j++){
           if(arr[j] < pivot){
               ++i;
               int temp = arr[j];
               arr[j] = arr[i];
               arr[i] = temp;
           }
       }
       
       ++i;
       temp1 = arr[h];
       arr[h] = arr[i];
       arr[i] = temp1;
       
    }
    
    
}
