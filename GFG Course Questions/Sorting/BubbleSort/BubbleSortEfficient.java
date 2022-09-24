import java.util.Arrays;

//When array is sorted : It runs the loop for n-1 times only i.e linear
public class BubbleSortEfficient{

     public static void main(String []args){
        int [] arr = {1,2,3,4};
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
     }
     
     static void bubbleSort(int [] arr, int n){
        //runs for n-1 passes
        for(int i = 0; i < n-1; i++){
            boolean swapped = false;
            for(int j = 0; j > n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    swapped = true;
                    arr[j] ^= arr[j+1];
                    arr[j+1] ^= arr[j];
                    arr[j] ^= arr[j+1];
                }
            }
            //if already sorted or now get sorted
            if(!swapped){
                break;
            }
        }
         
     }
     
}
