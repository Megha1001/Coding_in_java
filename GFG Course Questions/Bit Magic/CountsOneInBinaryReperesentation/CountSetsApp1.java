public class CountSetsApp1{
    
    public static void main(String [] args){
        int n = 5;
        System.out.println("No of bits with Value 1 in "+n+" is :"+countNoOfBits(n));
    }
    
    static int countNoOfBits(int n){
        int res = 0;
        while(n >0){
            if(n % 2 != 0){
                ++res;
            }
            n = n/2;
        }
        return res;
    }
    
    
}

/*
OUTPUT
No of bits with Value 1 in 5 is :2
*/
