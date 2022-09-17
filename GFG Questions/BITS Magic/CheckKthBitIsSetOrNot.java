//Question : https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-BitMagic/problem/check-whether-k-th-bit-is-set-or-not-1587115620
class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
       
       return (n & (1 << (k))) != 0;
    }
    
}
