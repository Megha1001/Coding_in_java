class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
        
        int pos = 1;
        while(n > 0){
            
            if((n & 1) != 0){
                return pos;
            }
            pos++;
            n = n >> 1;
            
        }
     
        return 0;
    }
}
