/*
Find two odd appearing elements
I/P : {3,4,3,4,5,4,4,6,7,7} , O/P : 5,6

EFFICIENT SOLUTION: Using XOR

- do XOR of all the elements
    - 5^6
- Find the rightmost set bit of result of XOR found in #1
    - 3 = 011 using XOR & ~(XOR -1)
- Divide the given elements in two groups to seperate elements of XOR result in two different group
    - one that has set bit set(1) -- 5 comes here
        - {3,3,5,7,7}
    - other that has set bit unset(0) -- 6 comes here
        - {4,4,4,4,6}

- XOR of these two groups individually will give us result
    - XOR{3,3,5,7,7} = 5
    - XOR{4,4,4,4,6} = 6

TIME COMPLEXITY : O(N); AUXILIARY SPACE : O(1)
*/

public class FindTwoOddAppNumbersEff {
    public static void main(String [] args) {
        int []input = {3,4,3,4,5,4,4,6,7,7};

        System.out.println("Number that appears odd number of times are : ");
        findOddAppNumbers(input, input.length);
    }

    static void findOddAppNumbers(int [] arr, int n) {
        //find XOR of all elements
        int XOR = 0 ; // x ^ 0 = x
        for(int i = 0; i < n; i++) {
            XOR ^= arr[i]; //3
        }

        //find rightmost set bit
        int rb = XOR & ~(XOR-1); //1

        //divide into two groups
        int res1 = 0, res2 = 0;
        for(int i = 0 ; i < n; i++) {
            //bit is set(1)
            if((arr[i] & rb) != 0) {
                res1 ^= arr[i];
            } else { //bit is unset(0)
                res2 ^= arr[i];
            }

        }
        System.out.println(res1 +" "+res2);
    }
}

/*
OUTPUT
Number that appears odd number of times are : 
5 6
*/
