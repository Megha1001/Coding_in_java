/*
Question : Find Most Significant Bit (MSB)
For ex : 
n = 10 --> binary representation - 1010
MSB : 8 (1st position from right)

Solution  : 
- find the log base 2 (N) --> 3
- find Math.pow(2, #1 ans) --> Math.pow(2,3) = 8
log2 N = loge N / loge 2
*/

public class MostSignificantBit{
    
    public static void main(String [] args){
       int n = 10;
       System.out.println("MSB of given number "+n+" is : ");
       int res = (int)Math.pow(2, (int)(Math.log(n)/Math.log(2)));
       System.out.print(res);
    }
}

/*
OUTPUT
MSB of given number 10 is : 
8
*/
