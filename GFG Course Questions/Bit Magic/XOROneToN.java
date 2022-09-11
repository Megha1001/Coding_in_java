/*
Question : Find XOR of numbers from 1 to N

Input : N = 6
Output : 7
// 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6  = 7

Input : N = 7
Output : 0
// 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 ^ 7 = 0

Solution : 
Find the remainder of N by moduling it with 4.
    If rem = 0, then xor will be same as N.
    If rem = 1, then xor will be 1.
    If rem = 2, then xor will be N+1.
    If rem = 3 ,then xor will be 0.
    
Explaination
When we do XOR of numbers, we get 0 as XOR value just before a multiple of 4. This keeps repeating before every multiple of 4.
Number Binary-Repr  XOR-from-1-to-n
1         1           [0001]
2        10           [0011]
3        11           [0000]  <----- We get a 0
4       100           [0100]  <----- Equals to n
5       101           [0001]
6       110           [0111]
7       111           [0000]  <----- We get 0
8      1000           [1000]  <----- Equals to n
9      1001           [0001]
10     1010           [1011]
11     1011           [0000] <------ We get 0
12     1100           [1100] <------ Equals to n
*/

public class XOROneToN{
    
    public static void main(String [] args){
       int n = 7;
       System.out.println("XOR from 1 to "+n +" is : ");
       
       int rem  = n % 4;
       
       if(rem == 0){
           System.out.print(n);
       }else if(rem == 1){
            System.out.print(1);
       }else if(rem == 2){
            System.out.print( n + 1);
       }else{
            System.out.print(0);
       }
       
    }
}
