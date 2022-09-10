/*
Use : Brian Kerningram's algo
Subtracting 1 from a decimal number flips all the bits after the rightmost set bit(which is 1) including the rightmost set bit.
    10-> 1010
    9-> 1001
    8-> 1000
So if we subtract a number by 1 & do it bitwise '&' with itself (n & (n - 1)) , we unset th rightmost
bit if we do 'n & (n-1)' in a loop and count the number of times loop executes, we get the set bit counts.

No of times its loops is executes = No. of bits in integer

TIME COMPLEXITY : Θ(No of sets bits in integer)
*/

public class CountSetsUsingBrianKerningramAlgo {
    public static void main(String [] args) {
        int n = 5;
        System.out.println("No of bits with Value 1 in "+n+" is :"+countNoOfBits(n));
    }

    static int countNoOfBits(int n) {
       int res = 0;
       while(n > 0){
           n = n & (n-1);
           ++res;
       }
       
       return res;
    }
}

/*
OUTPUT
No of bits with Value 1 in 5 is :2
*/
