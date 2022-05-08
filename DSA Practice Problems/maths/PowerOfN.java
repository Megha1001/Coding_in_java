
public class PowerOfN {

	public static boolean isPowerOfN(long num, long powOf) {
		
		//base cases
		if(powOf == 0) {
			return false;
		}
		
		if(powOf == 1 && num!=1) {
			return false;
		}
		
		if(powOf == 1 && num == 1) {
			return true;
		}
		
		long i = 1;
		while(i < num) {
			i *= powOf;
		}
		return i == num ;
	}
	public static void main(String[] args) {
		long powOf = 3;
		long num = 100000001;
		
		System.out.println(isPowerOfN(num, powOf));
	}

}
