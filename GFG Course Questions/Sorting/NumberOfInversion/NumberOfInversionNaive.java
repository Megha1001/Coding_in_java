/*
INVERSION : A pair (arr[i], arr[j]) forma an inversion when i < j and arr[i] > arr[j]

for Example : {2,4,1,3,5}
Inversion count : 3 [(2,1),(4,1),(4,3)]
TIME COMPLEXITY : O(N*N)
*/

public class NumberOfInversionNaive{
    public static void main(String args[]) {
        int[] arr = {2,4,1,3,5};
        
        System.out.println("Number of inversion in given array are : "+countNumOfInversion(arr,arr.length));
    }
    
    static int countNumOfInversion(int [] arr, int n){
        
        int res = 0;
        
        for(int i = 0; i < n-1; i++){// upto n-1, since for last element there is no element present on its right
            for(int j = i+1; j< n; j++){
                if(arr[i] > arr[j]){
                    ++res;
                }
            }
        }
    
        return res;        
    }
    
}
