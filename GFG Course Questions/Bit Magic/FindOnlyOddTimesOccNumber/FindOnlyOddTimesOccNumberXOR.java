/*find the only odd number of time occuring number
For example :
I/P : arr[] = {4,3,4,4,4,5,5}, O/P : 3
I/P : arr[] = {8,7,7,8,8} , O/P : 7

Efficient Approach : Using XOR
Properties
x ^ 0 = x;
x ^ y = y ^ x; --> commutative
x ^ (y ^ z) = (x ^ y) ^ z; --> associative
x ^ x = 0;

XOR of all numbers = gives only number occuring odd number of time in given array
arr[] = {8,7,7,8,8}
8^7 = u; ('u' is anything)
8^7^7 = 8
8^8 = 0;
0^8 = 8;

TIME COMPLEXITY : O(N);AUXILIARY SPACE : O(1)
*/

public class FindOnlyOddTimesOccNumberXOR {

    public static void main(String [] args) {
        int [] arr = {8,7,7,8,8};
        System.out.println("The only odd number of times occuring number in given array is "+findOnlyOddNumberOfTimesOccNum(arr));

    }

    static int findOnlyOddNumberOfTimesOccNum(int [] arr) {
        int res = 0; // since, x ^ 0 = x
        for(int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }
        return res;
    }

}
