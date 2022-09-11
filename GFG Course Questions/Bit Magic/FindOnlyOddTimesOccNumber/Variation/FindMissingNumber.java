/*
Question : Given an array of n number that has value in range [1...n+1]. Every number appears exactly once.Find the missing number.
For ex : 
I/P : {1,4,3} , O/P : 2
I/P : {1,5,3,2}, O/P : 4

Solution : XOR(number from 1 to n+1) XOR (XOR(elements of array))

TIME COMPLEXITY : O(N);AUXILIARY SPACE : O(1)
*/

public class FindMissingNumber {

    public static void main(String [] args) {
        int [] arr = {1,4,3};
        System.out.println("Missing number is  "+findMissingNum(arr));

    }

    static int findMissingNum(int [] arr) {
        int missNum = 0; // x ^ 0 = x
        // XOR of numbers from 1 to n+1
        for(int i  = 1; i <= arr.length +1; i++){
            missNum ^= i;
        }
        
        // XOR of array elements
        for(int i = 0; i<arr.length; i++){
            missNum ^= arr[i];
        }
        
        return missNum;
    }

}

/*
OUTPUT :
Missing number is  2
*/
