public class MobileNumKeyPadSeq {
	public static String printSequence(String S) 
    { 
        String result = "";
        for(char c : S.toCharArray()){
            if(c == 'A'){
                result +="2";
            }else if(c == 'B'){
                result +="22";
            }else if(c == 'C'){
                result +="222";
            }else if(c == 'D'){
                result +="3";
            }else if(c == 'E'){
                result +="33";
            }else if(c == 'F'){
                result +="333";
            }else if(c == 'G'){
                 result +="4";
            }else if(c == 'H'){
                 result +="44";
            }else if(c == 'I'){
                 result +="444";
            }else if(c == 'J'){
                result +="5";
            }else if(c == 'K'){
                result +="55";
            }else if(c == 'L'){
                result +="555";
            }else if(c == 'M'){
                 result +="6";
            }else if(c == 'N'){
                 result +="66";
            }else if(c == 'O'){
                 result +="666";
            }else if(c == 'P'){
                result +="7";
            }else if(c == 'Q'){
                result +="77";
            }else if(c == 'R'){
                result +="777";
            }else if(c == 'S'){
                result +="7777";
            }else if(c == 'T'){
                result +="8";
            }else if(c == 'U'){
                result +="88";
            }else if(c == 'V'){
                result +="888";
            }else if(c == 'W'){
                result +="9";
            }else if(c == 'X'){
                result +="99";
            }else if(c == 'Y'){
                result +="999";
            }else if(c == 'Z'){
                result +="9999";
            }else if(c == ' '){
                result +="0";
            }
        }
        
        return result;
    }
	public static void main(String[] args) {
		System.out.println(printSequence("HEY U"));
	}

}
