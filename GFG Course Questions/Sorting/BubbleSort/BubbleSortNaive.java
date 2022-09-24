/*
TIME COMPLEXITY : O(N^2)
*/

import java.util.Arrays;

public class BubbleSortNaive{

     public static void main(String []args){
        int [] arr = {10,8,20,5};
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
     }
     
     static void bubbleSort(int [] arr, int n){
         
         //runs for n-1 passes
         for(int i = 0; i < n-1; i++){
             //after every pass largest element will come at its original position
             for(int j  = 0 ; j < n-1-i ; j++){
                 if(arr[j] > arr[j+1]){
                     //swap using XOR
                    arr[j] ^= arr[j+1];
                    arr[j+1] ^= arr[j];
                    arr[j] ^= arr[j+1];
                 }
             }
         }
         
     }
}
