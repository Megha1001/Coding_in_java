// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class ParenthesisChecker
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack <Character> s = new Stack<Character>();
        
        for(int i =0; i < x.length(); i++){
            char c = x.charAt(i);
            
            if(c == '{' || c =='[' ||c =='('){
                s.push(c);
                continue;
            }
            
            if(s.isEmpty()){
                return false;
            }
            
            char check;
            switch(c){
                case ')' :
                    check = s.pop();
                    if(check == '[' || check == '{')
                    return false;
                    break;
                case '}':
                    check = s.pop();
                    if(check =='(' || check == '[')
                    return false;
                    break;
                case ']':
                    check = s.pop();
                    if(check == '{' || check == '(')
                    return false;
                    break;
            }
        }
        
        return (s.isEmpty());
    }
}
