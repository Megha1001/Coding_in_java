public class MobileNumKeyPadSeqAP2 {
	public static String printSequence(String input, String [] arr) 
    { 
        String result = "";
        for(int i = 0 ; i < input.length() ; i++) {
        	if(input.charAt(i) ==' ') {
        		result += "0";
        	}else {
        		int position = input.charAt(i) - 'A';
        		result += arr[position];
        	}
        }
        return result;
    }
	public static void main(String[] args) {
		String [] arr = {"2","22","222",
						"3","33","333",
						"4","44","444",
						"5","55","555",
						"6","66","666",
						"7","77","777","7777",
						"8","88","888",
						"9","99","999","9999"};
		System.out.println(printSequence("HEY U",arr));
	}

}
