//Question : Check a string subsquence of other
/*
APPROACH : Maitain two variable i and j for the given strings respectively
Increment both i and j if charAt(i) ==charAt(j) else increment i until i < len1 && j < len2
return j == len2

TIME COMPLEXITY : O(LEN1 + LEN2)
AUXILIARY SPACE : O(1)
*/

public class CheckSubSequenceIterativeApproach {

    public static void main(String [] args) {
        String str1 = "ABCDEFGH";
        String str2 = "ADGI";
        System.out.println("is second string subSequence of first? :"+isSubSeqIterAp1(str1,str2, str1.length(), str2.length()));
        System.out.println("is second string subSequence of first? :"+isSubSeqIterAP2(str1,str2, str1.length(), str2.length()));
    }

    //Iterative solution - AP1
    static boolean isSubSeqIterAp1(String str1,String str2, int len1, int len2) {
        //for optimization
        if(len2 > len1) return false;

        int i = 0;
        int j = 0;
        while(i < len1 && j < len2) {
            if(str1.charAt(i) == str2.charAt(j)) {
                ++i;
                ++j;
            } else {
                ++i;
            }
        }

        // if subsequence
        return (j == len2);

    }

    //Iterative solution - AP2
    static boolean isSubSeqIterAP2(String str1, String str2, int len1, int len2){
        //for optimization
        if(len2 > len1) return false;
        
        int j = 0;
        for(int i = 0; i < len1 && j < len2; i++){
            if(str1.charAt(i) == str2.charAt(j)) {
                ++j;
            }
        }
        
        return j == len2;
    }

}
