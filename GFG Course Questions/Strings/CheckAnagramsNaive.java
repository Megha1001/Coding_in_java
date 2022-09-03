//Find Anagrams(permutations of each other)

/*
APPROACH : sort both of the strings
compare by equals method

TIME COMPLEXITY : O(nlogN) // due to sort function and it requires two traversal
AUXILIARY SPACE : O(1)
*/


import java.util.*;

public class CheckAnagramsNaive{
    
    public static void main(String [] args){
        String str1 = "listen";
        String str2 = "silent";
        
        System.out.println("Are both strings anagrams ? "+areAnagrams(str1, str2));
        
    }
    
    static boolean areAnagrams(String str1, String str2){
        
        if(str1.length() != str2.length()){
            return false;
        }
        
        //sort first String
        char [] c1 = str1.toCharArray();
        Arrays.sort(c1); //nlogn. - 1st traversal
        str1 = new String(c1);
        
        
        //sort second String
        char [] c2 = str2.toCharArray();
        Arrays.sort(c2); //nlogn - 2nd traversal
        str2 = new String(c2);
        
        return str1.equals(str2);
    }
}
