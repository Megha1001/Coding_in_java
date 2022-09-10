/*
Naive approach :
Repetedly divide by 2, at any point if we get odd number(except 1) then it is not power of 2.
*/


public class PowerOf2Naive {
    public static void main(String [] args) {
        int n = 16;
        System.out.println("is given number : "+n+" is power of 2 ? "+powerOfTwo(n));
    }

    static boolean powerOfTwo(int n) {
        if(n == 0) return true;

        while(n != 1) {
            //odd number checking other than 1
            if(n%2 != 0) {
                return false;
            }
            n = n/2;
        }
        return true;
    }
}

/*
OUTPUT
is given number : 16 is power of 2 ? true
*/
