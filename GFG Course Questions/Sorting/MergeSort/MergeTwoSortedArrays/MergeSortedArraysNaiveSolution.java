//Time Complexity : O((m+n)log(m+n))

import java.util.Arrays;
public class MergeSortedArraysNaiveSolution{

    public static void main(String []args){
        int [] arr1 = {1};
        int [] arr2 = {1,2,3};
        mergeSortedArray(arr1, arr2, arr1.length, arr2.length);
      
    }
    
    static void mergeSortedArray(int [] arr1, int [] arr2, int m, int n){
        int [] res = new int [m+n];
        
        //copy 1st array into result array
        for(int i = 0; i < m; i++){ //O(M)
            res[i] = arr1[i];
        }
        
        //copy 2nd array into result array
        for(int i = 0; i < n; i++){ //O(n)
            res[i+m] = arr2[i];
        }
        
        //sort the array
        Arrays.sort(res); //O((m+n)log(m+n))
        
        System.out.println(Arrays.toString(res));
        
    }
}
