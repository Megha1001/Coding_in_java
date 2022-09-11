/*
Find Power Set using bitwise operator/ subsets
Input : "abc"
Power sets : "", "a","b","c","ab","bc","abc"
For N length of string
    - Num of power sets : 2 ^ n = 2^3 =8
    
Using BITWISE OPERATOR

Counter(Decimal) | Counter (Binary) | Subsets
0                | 000              | ""
1                | 001              | "a"
2                | 010              | "b"
3                | 011              | "ab"
4                | 100              | "c"
5                | 101              | "ac"
6                | 110              | "bc"
7                | 111              | "abc"

TIME COMPLEXITY : O(n * 2^n)
*/

public class FindPowerSets{
    public static void main(String [] args) {
        String str = "abc";

        System.out.println("Power sets of input string are : ");
        findPowSet(str);
    }

    static void findPowSet(String str) {
        
        //len of string
        int n = str.length(); //3
        //find number of power sets
        int powSize = (int)Math.pow(2,n); //8
    
        //for each counter in column 'A'
        for(int counter = 0; counter < powSize ; counter++){ // run 2 ^n times
            
            // traverse each character of input string
            for(int j = 0; j < n; j++){ //run n times
                
                //check the set bits 1 by 1 if set print
                if((counter & (1 << j)) != 0){
                    System.out.print(str.charAt(j));
                }
                
            }
            System.out.println("");
            
        }
        
    }
}

/*
OUTPUT
Power sets of input string are : 
a
b
ab
c
ac
bc
abc
*/
