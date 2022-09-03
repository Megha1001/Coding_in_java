// Find the left most repeating character
/*
APPROACH :
For every character
  - search if it appears in the rest of the successding string if yes return the index of character
 if no return -1
 
 TIME COMPLEXITY : O(N*N)
 AUXILIARY SPACE : O(1)
*/

public class FindLeftMostRepeatingCharNaive{
    
    public static void main(String []args){
        String s1 = "abccb"; //result :a
        System.out.println("Leftmost repeating character in given string is "+findLeftMostRepChar(s1));
        
    }
    
    static int findLeftMostRepChar(String s1){
         for(int i = 0; i < s1.length(); i++){
            for(int j = i+1 ; j < s1.length(); j++){
                if(s1.charAt(i) == s1.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }
}

/*
OUTPUT :
Leftmost repeating character in given string is 1
*/
