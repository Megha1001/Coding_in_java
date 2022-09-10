//Time complexity : O(No of bits)
public class CountSetsApp2{
    
    public static void main(String [] args){
        int n = 5;
        System.out.println("No of bits with Value 1 in "+n+" is :"+countNoOfBits(n));
    }
    
    static int countNoOfBits(int n){
        int res = 0;
        while(n >0){
            if((n & 1) == 1){
                ++res;
            }// res += (n & 1);
            n = n >>1;
        }
        return res;
    }
    
    
}

/*
OUTPUT :
No of bits with Value 1 in 5 is :2s
*/
