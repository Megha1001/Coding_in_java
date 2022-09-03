/*
APPROACH :
1. match from last character of string and decrement both by 1 if matches otherwise decrement ptr only to original string

TIME COMPLEXITY : O(M+N)
AUXILIARY SPACE : O(M+N)
*/

public class CheckSubSequenceRecursive {

    public static void main(String [] args) {
        String str1 = "ABCDEFGH";
        String str2 = "ABCDEFGH";
        System.out.println("is second string subSequence of first? :"+isSubSeqRec(str1,str2, str1.length(), str2.length()));
        
    }

    //Recursive approach
    //Use length instead of variables like i,j --> so there will be no need to maintain and change it
    static boolean isSubSeqRec(String str1,String str2, int len1, int len2) {
        
        if(len2 == 0){
            return true;
        }
        // this condition should be the second one otherwise it will return false for same set of Strings
        if(len1 == 0){
            return false;
        }
        
        if(str1.charAt(len1 -1) == str2.charAt(len2 -1)){
            //if matches decrease length of both by 1
            return isSubSeqRec(str1, str2, len1 - 1, len2 -1);
        }else{
            // otherwise increment the original string by 1
            return isSubSeqRec(str1, str2, len1 -1, len2);
        }

    }

}

/*
OUTPUT
is second string subSequence of first? :true
*/
