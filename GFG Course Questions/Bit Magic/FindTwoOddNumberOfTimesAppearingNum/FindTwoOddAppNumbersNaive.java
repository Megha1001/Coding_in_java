/*
Find two odd appearing elements
I/P : {3,4,3,4,5,4,4,6,7,7} , O/P : 5,6

NAIVE SOLUTION : 
- for each number count its occurence and if count % 2 != 0 --> print

TIME COMPLEXITY : O(N*N)
*/

public class FindTwoOddAppNumbersNaive{
    public static void main(String [] args){
        int []input = {3,4,3,4,5,4,4,6,7,7};
        
        System.out.println("Number that appears odd number of times are : ");
        findOddAppNumbers(input, input.length);
    }
    
    static void findOddAppNumbers(int [] arr, int n){
        //for each number count it's occurence in whole array
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j]){
                    ++count;
                }
            }
            
            if(count%2 != 0){
                System.out.print(arr[i]+" ");
            }
        }
        
    }
}

/*
OUTPUT
Number that appears odd number of times are : 
5 6 
*/
