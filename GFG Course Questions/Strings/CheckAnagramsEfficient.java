//Find Anagrams(permutations of each other)

/*
APPROACH : Maintain count array of size 256
increment it by 1 for first every character in 1st string and decrement by 1 for every character at second string
traverse the count array if any element found whose value !=1 return false
else return true;  

TIME COMPLEXITY : O(N + CHAR) // due to sort function and it requires two traversal
AUXILIARY SPACE : O(CHAR)
*/


import java.util.*;

public class CheckAnagramsEfficient{
    static final int CHAR = 256;
    public static void main(String [] args){
        String str1 = "listen";
        String str2 = "silent";
        
        System.out.println("Are both strings anagrams ? "+areAnagrams(str1, str2));
        
    }
    
    static boolean areAnagrams(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        
        //matain the count array to calculate the occurence of character
        int [] count = new int[CHAR];
        
        for(int i = 0; i < str1.length(); i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        
        for(int i = 0; i < CHAR; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
}

