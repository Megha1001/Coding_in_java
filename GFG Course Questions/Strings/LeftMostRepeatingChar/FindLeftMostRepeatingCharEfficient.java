/*
APPROACH :
- Maintain a count array of size 256 and calculate the frequency of every character in input string
- then traverse through count array to get the char with frequency > 1

TIME COMPLEXITY : O(N + CHAR)
AUXILIARY SPACE : O(CHAR)

*/

public class FindLeftMostRepeatingCharEfficient{
    static final int CHAR = 256;
    public static void main(String []args){
        String s1 = "abccb"; //result :a
        System.out.println("Leftmost repeating character in given string is "+findLeftMostRepChar(s1));
        
    }
    
    static int findLeftMostRepChar(String s1){
        int [] count = new int[CHAR];
        //count the frequencies
        for(int i = 0; i < s1.length(); i++){
            count[s1.charAt(i)]++;
        }
        
        //find the index with frequency >1
        for(int i = 0; i < CHAR; i++){
            if(count[s1.charAt(i)] > 1){
                return i;
            }
        }
        
        return -1;
    }
    
}
