package string;


/*
 * https://practice.geeksforgeeks.org/problems/change-the-string3541/1/?page=2&company[]=Oracle&sortBy=submissions#
 */
public class ChangeTheString {

	public static String changeTheString(String s) {
		if(s.charAt(0)>= 'a' && s.charAt(0) <= 'z') {
			return s.toLowerCase();
		}else {
			return s.toUpperCase();
		}
	}
	
	public static void main(String[] args) {
		String input = "abCDEA";
		System.out.println("Original String : "+input);
		System.out.println("Changed String : "+changeTheString(input));
		
	}

}
