
public class PowerOfNWithMathLib {

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
		 return (Math.log10(num)/Math.log10(powOf)) % 1 == 0;
	}
	public static void main(String[] args) {
		long powOf = 3;
		long num = 100000001;
		
		System.out.println(isPowerOfN(num, powOf));
	}

}
