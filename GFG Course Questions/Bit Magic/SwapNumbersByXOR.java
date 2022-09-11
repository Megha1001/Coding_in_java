/*
Question : Swap two numbers without using third number
Solution : Using XOR
*/

public class SwapNumbersByXOR{
    
    public static void main(String [] args){
        int a = 2;
        int b = 3;
        System.out.println("Given numbers : "+a+" "+b);
        System.out.println("After swapping numbers are : ");
        swapNum(a,b);
    }
    
    static void swapNum(int a, int b){
        /*
        a = 10
        b = 11
        a = a ^ b = 10 ^ 11 = 01
        b = b ^ a = 11 ^ 01 = 10 => a
        a = a ^ b = 01 ^ 10 = 11 => b
        */
        a ^= b;
        b ^= a;
        a ^= b;
        
        System.out.print(a +" "+b);
    }
}

/*
OUTPUT:
Given numbers : 2 3
After swapping numbers are : 3 2
*/
