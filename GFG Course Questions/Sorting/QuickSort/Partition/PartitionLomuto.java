/*
Pivot index is given and requirement is to partition the array based on that pivot index

TIME COMPLEXITY : O(N), and one traversal

Algo : Lomuto partition
*/
import java.util.Arrays;

public class PartitionLomuto{
    
    public static void main(String args[]) {
        int[] arr = {10,80,30,90,40,50,70};
        
        partition(arr, 0, arr.length-1);
        System.out.println("Array after partition is : "+Arrays.toString(arr));
    }
    
    
    static void partition(int[] arr, int l, int h){
        
        //assumping pivot is last element
        int pivot = arr[h];
        
        //for making place for elements smaller than pivot
        int i = l - 1;
        
        //partition element and placing them according except placing pivot(last element)
        for(int j = l; j <= h-1; j++){
            
            if(arr[j] < pivot){
                //make place for smaller element
                ++i;
                
                //swap the elements
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        
        //placing pivot at correct position
        ++i;
        int temp = arr[i];
        arr[i] = arr[h]; //arr[h] is pivot
        arr[h] = temp;
    }
    
    
}
