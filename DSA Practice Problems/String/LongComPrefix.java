//leetcode link : https://leetcode.com/problems/longest-common-prefix/submissions/
public class LongComPrefix {
	public static String longestCommonPrefix(String [] strs) {
        String result ="";
        if(strs.length == 1){
            return strs[0];
        }
        for(int i = 0; i < strs.length -1; i++){
            String temp = "";
            for(int j = 0, k = 0 ; j < strs[i].length() && k < strs[i+1].length(); j++,k++){
                if(strs[i].charAt(j) == strs[i+1].charAt(k)){
                    temp += String.valueOf(strs[i].charAt(j));
                }else {
                	break;
                }
            }
            if(temp == "" ){
                result  = "";
                break;
            }else if(result.length() > temp.length() || result == ""){
                result  = temp;
            }
        }
        return result;   
    }

	public static void main(String[] args) {
		String [] input = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(input));

	}

}
