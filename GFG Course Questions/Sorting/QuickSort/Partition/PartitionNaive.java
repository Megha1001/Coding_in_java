/*
Pivot index is given and requirement is to partition the array based on that pivot index

TIME COMPLEXITY : O(N), AUXILIARY SPACE : O(N), Require tree traversal of input array
*/
import java.util.Arrays;

public class PartitionNaive{
    
    public static void main(String args[]) {
        int[] arr = {5,13,6,9,2,8};
        
        partition(arr, 0, arr.length-1,5);
        System.out.println("Array after partition is : "+Arrays.toString(arr));
    }
    
    
    static void partition(int[] arr, int l, int h, int p){
        //temp array
        int [] temp = new int[h-l+1];
        int index = 0;
        
        //copy elements that are less than pivot
        for(int i = l; i <= h; i++){
            if(arr[i] <= arr[p]){
                temp[index] = arr[i]; 
                index++;
            }
        }
        
        //copty elements that are greater than pivot
        for(int i = l ; i <= h; i++){
            if(arr[i] > arr[p]){
                temp[index] = arr[i];
                index++;
            }
        }
        
        //copy to original array
        for(int i = l; i <= h; i++){
            arr[i] = temp[i-l];
        }
    }
    
    
}
