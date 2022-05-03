public class PrintDuplicates {

	public static void main(String[] args) {
		String input = "meghaverma";
		int [] alphabets = new int[26];
		for(char i : input.toCharArray()) {
			alphabets[i -'a'] ++;
		}
		for(int i = 0 ; i < 26 ; i++) {
			if(alphabets[i] > 1) {
				System.out.println("count['"+(char)(i+97)+"']"+"="+alphabets[i]);
			}
		}
//		char i = 's';
//		int p = i - 'a';
//		char o = (char)(p + 97);
//		System.out.println(o);

	}

}
