package array;

public class MaxNumberOfZeroes {
	
	static String maxZero(String arr[], int N)
    {
         int maxZero = 0;
         String res = "-1";
         
         for(int i = 0; i < N; i++){
             String curr = arr[i];
             int count = 0;
             for(int j = 0; j < curr.length() ;j++){
                 char ch = curr.charAt(j);
                 if(ch == '0'){
                     ++count;
                 }
             }
             if(maxZero < count){
                 maxZero = count;
                 res = curr;
             }else if(maxZero == count && count!=0){
                 if(res.length() == curr.length()){
                     res = res.compareTo(curr) >0 ? res:curr;
                 }else{
                     res = (res.length() > curr.length()) ? res : curr;
                 }
             }
         }
         
         return res;
    }
	
	
	public static void main(String[] args) {
		String [] input = {"10", "20", "3000", "9999", "200"};
		System.out.println("Maximum number of zeroes present in input array are : "+maxZero(input, input.length));
	}

}

