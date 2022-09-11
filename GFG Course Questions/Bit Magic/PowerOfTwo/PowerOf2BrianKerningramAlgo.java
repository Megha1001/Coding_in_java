/*
Using Brian kerningram's algorithm
logic : In power of 2 , only 1 bit is set

TIME COMPLEXITY : Theta(No. of bits)
*/


public class PowerOf2BrianKerningramAlgo {
    public static void main(String [] args) {
        int n = 16;
        System.out.println("is given number : "+n+" is power of 2 ? "+powerOfTwo(n));
        System.out.println("is given number : "+n+" is power of 2 ? "+powerOfTwoRef(n));
        System.out.println("is given number : "+n+" is power of 2 ? "+powerOfTwoRef2(n));
    }

    static boolean powerOfTwo(int n) {
        int res = 0;
        while( n > 0) {
            n = n & (n-1);
            res++;
        }
        return res == 1 ? true:false;
    }

    static boolean powerOfTwoRef(int n) {
        if(n == 0) return false;
        //after unsetting rightmost set bit , power of 2 number should become 0, except for 0 itself
        return ((n & (n-1) )== 0);
    }

    static boolean powerOfTwoRef2(int n) {
        return n != 0 && ((n & (n-1) )== 0);
    }
}

/*
OUTPUT
is given number : 16 is power of 2 ? true
is given number : 16 is power of 2 ? true
is given number : 16 is power of 2 ? true
*/
