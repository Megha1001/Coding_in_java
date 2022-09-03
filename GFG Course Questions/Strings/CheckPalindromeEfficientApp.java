/*
APPROCH:
Maintain two index - begin and end
Initialize begin=0, and end=len-1;
compare begin and end if not matches , return false;
if matches do begin++ and end--;
End return true;

TIME COMPLEXITY : O(N);

AUXILIARY SPACE : O(1);
*/

public class CheckPalindromeEfficientApp {

    public static void main(String [] args) {
        String str = "ABCCBA";
        System.out.println("is given string palindrome :"+isPal(str));
    }

    static boolean isPal(String str) {
        int begin = 0;
        int end = str.length() - 1;
        
        while(begin < end){
            if(str.charAt(begin) != str.charAt(end)){
                return false;
            }
            
            begin++;
            end--;
        }
        return true;
    }
}

/*
OUTPUT:
is given string palindrome :true
*/
