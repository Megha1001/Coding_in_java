import java.util.*;

/*
TIME COMPLEXITY : O(N+CHAR)
AUXILIARY SPACE : O(CHAR)
*/

public class FindLeftMostRepeatingCharEfficient2{
    public static int CHAR = 256;
    public static void main(String []args){
        String input = "abccb"; //output : b
        
        System.out.println("Leftmost repeating character first index is: "+findLeftRepCharFirstIndex(input));
        
    }
    
    static int findLeftRepCharFirstIndex(String str){
        
        int [] findex = new int[CHAR];
        // intialize all the values by -1
        Arrays.fill(findex, -1);
        int result = Integer.MAX_VALUE;
        for(int  i = 0; i < str.length(); i++){
            int fi = findex[str.charAt(i)]; // get the first occurence index 
            
            if(fi == -1){ //first occurence
                findex[str.charAt(i)] = i;
            }else{ // compare first occurence index with already discovered first repeating character occurence
                result = Math.min(result, fi);
            }
        }
     return result;   
    }
}
