//Question : https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-BitMagic/problem/rightmost-different-bit-1587115621

class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            return findRightMostSetBit(m ^ n);
            
    }
    
    static int findRightMostSetBit(int n){
        
        if(n == 0){
            return -1;
        }
        int pos = 1;
        
        while(n > 0){
            
            if((n & 1) != 0){
                return pos;
            }
            pos++;
            n = n >> 1;
        }
        return -1;
    }
}
