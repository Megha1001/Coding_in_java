/*
Pivot index is given and requirement is to partition the array based on that pivot index

TIME COMPLEXITY : O(N), and one traversal - Better than LOMUTO's PARTITION

Approach :HOARES PARTITION ALGO
*/
import java.util.Arrays;

public class PartitionHoaresAlgo{
    
    public static void main(String args[]) {
        int[] arr = {60,80,30,90,40,50,70};
        
        partition(arr, 0, arr.length-1);
        System.out.println("Array after partition is : "+Arrays.toString(arr));
    }
    
    
    static int partition(int[] arr, int l, int h){
    
        int pivot = arr[l];
        
        int i = l-1;
        int j = h+1;
        
        do{
            ++i;
        }while(arr[i] < pivot);
        
        
        do{
            --j;
        }while(arr[j] > pivot);
        
        
        if(i >= j){
            return j; //pivot index
        }
        
        
        //swap
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        return -1;
    }
    
    
}
