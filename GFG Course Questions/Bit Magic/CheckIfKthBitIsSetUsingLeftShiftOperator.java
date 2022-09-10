/*
Using left shift operator
-Get the number whose kth bit is 1 only -->  1 << k-1
-Use bitwise & with #1 result
-if != 0 --> return Yes, else return No
*/
public class CheckIfKthBitIsSetUsingLeftShiftOperator {

    public static void main(String []args) {
        int n = 5;
        int k = 3;
        System.out.println("is "+k+"th bit of "+n+" is set ? "+kthBit(n, k));
    }

    static String  kthBit(int n , int k) {
        if((n & (1 << (k-1))) != 0) {
            return "Yes";
        }
        return "No";
    }
}

/*
is 3th bit of 5 is set ? Yes
*/
