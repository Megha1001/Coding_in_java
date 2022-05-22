class Solution
{
    public static int countNonZeroNum(int n){
         if( n == 0) return 0;
         if(n == 1)return 1;
         return 1 + countNonZeroNum(n/10);
    }
    public static int countDigits(int n)
    {
     
      if( n == 0) return 1;
      return countNonZeroNum(n);

    }
}

