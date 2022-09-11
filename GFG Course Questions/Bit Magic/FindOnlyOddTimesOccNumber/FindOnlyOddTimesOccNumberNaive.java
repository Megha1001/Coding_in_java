/*find the only odd number of time occuring number
For example :
I/P : arr[] = {4,3,4,4,4,5,5}, O/P : 3
I/P : arr[] = {8,7,7,8,8} , O/P : 7

Naive approach : count the occurence of each number and if the module with 2 is not 0 then return the number.
TIME COMPLEXITY : O(N*N)
*/

public class FindOnlyOddTimesOccNumberNaive{
    
    public static void main(String [] args){
        int [] arr = {8,7,7,8,8};
        System.out.println("The only odd number of times occuring number in given array is "+findOnlyOddNumberOfTimesOccNum(arr));
        
    }
    
    static int findOnlyOddNumberOfTimesOccNum(int [] arr){
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    ++count;
                }
            }
            if(count % 2 != 0){
                return arr[i];
            }
        }
        return -1;
    }
    
}


/*
OUTPUT:
The only odd number of times occuring number in given array is 8
*/
