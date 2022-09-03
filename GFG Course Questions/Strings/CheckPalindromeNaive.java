/*
APPROACH : Reverse string by creating copy of original String and using StringBuilder(mutable)
compare with original input string

TIME COMPLEXITY : O(N);
// always going to traverse to the string for reversing it
AUXILIARY SPACE : O(N);
*/


public class CheckPalindromeNaive {

    public static void main(String [] args) {
        String str = "ABCCBA";
        System.out.println("is given string palindrome :"+isPal(str));
    }

    static boolean isPal(String str) {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse(); //it is mutable, hence change the original string
        return str.equals(rev.toString()); // compare the content not reference like ==
    }
}

/*
OUTPUT :
is given string palindrome :true
*/
