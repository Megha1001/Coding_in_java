/*An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself.
Return "Yes" if it is a armstrong number else return "No".*/

class Armstrong {
    static String armstrongNumber(int n){
        int sum = 0;
        int i = n;
        while(i != 0){
            int temp = i % 10;
            sum += (temp * temp * temp);
            i = i /10;
        }
        
        return n == sum ? "Yes" : "No";
    }
  
  public static void main(String [] args){
    System.out.println(armstrongNumber(153));
}
