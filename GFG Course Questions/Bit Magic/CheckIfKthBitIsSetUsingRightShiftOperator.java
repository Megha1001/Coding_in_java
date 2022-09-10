/*
Using right shift operator
-Shift n by k-1 to the right using right shift operator --> get the value of that bit at 1 position from left
-do bitwise & of 1 with #1
    - if result != 0 then return Yes
    else return No
*/

public class CheckIfKthBitIsSetUsingRightShiftOperator{
    
    public static void main(String [] args){
        int n = 5;
        int k = 3;
        
        System.out.println("is "+k+"th bit of "+n+" is set ? "+kthBit(n, k));

    }
    
    static String kthBit(int n , int k){
        
        if(((n >> (k - 1)) & 1) != 0){
            return "Yes";
        }
        return "No";
        
    }
}

/*
Output :
is 3th bit of 5 is set ? Yes
*/
