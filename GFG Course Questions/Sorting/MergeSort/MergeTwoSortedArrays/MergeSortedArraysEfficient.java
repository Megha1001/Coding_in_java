//Time Complexity : O(M+N)
import java.util.Arrays;
public class MergeSortedArraysEfficient{

    public static void main(String []args){
        int [] arr1 = {1};
        int [] arr2 = {1,2,3};
        int m = arr1.length;
        int n = arr2.length;
        int [] res = new int[n+m];
        mergeSortedArray(arr1, arr2, res, m, n, res.length);
      
    }
    
    static void mergeSortedArray(int [] arr1, int [] arr2, int [] res, int m, int n, int l){
        
        //first array
        int i = 0;
        
        //second array
        int j = 0;
        
        //res array
        int k = 0;
        
        while(i < m && j < n){
            if(arr1[i] <= arr2[j]){// '=' is for stability
                res[k++] = arr1[i++];
            }else{
                res[k++] = arr2[j++];
            }
        }
        
        //copy of remaining elements of arr1 if any
        while(i < m){
            res[k++] = arr1[i++];
        }
        
        //copy of remaining elements of arr2 if any
        while(j < n){
            res[k++] = arr2[j++];
        }
        
        System.out.println(Arrays.toString(res));
        
    }
}
