public class RunLengthEncodingO_N {
	public static StringBuilder countAlphabets(String input) {
		StringBuilder result = new StringBuilder();
		if(input.length() == 0) {
			return result;
		}
		if(input.length() < 2) {
			return result.append(input).append(1);
		}
		int count = 1;
		for(int i = 0; i < input.length(); i++) {
			
			if((i+1) < input.length() && input.charAt(i) == input.charAt(i+1)) {
				count++;
			}else {
				result.append(input.charAt(i));
				result.append(count);
			}
			
		}
		
		return result;
		
	}
	public static void main(String[] args) {
		String input = "";
		System.out.println(countAlphabets(input));
	}
}
