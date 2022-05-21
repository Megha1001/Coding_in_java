//Problem description: https://leetcode.com/problems/find-the-winner-of-the-circular-game/

public class JosephusProblem {

	public static int findSurvivor(int n, int k) {
		if(n == 1) {
			return 0;
		}
		
		return (findSurvivor(n-1, k) +k)% n;
	}
	
	public static void main(String[] args) {
		int n =5, k =3;
		System.out.println("Survivor for "+n+" persons after killing every "+k+"th position person is : "+findSurvivor(n,k));
	}

}


/************
class Solution {
    public static int find(int n, int k){
         if(n == 1){
            return 0;
        }
        
        return  (find(n-1,k) +k) %n;
    }
    
    public int findTheWinner(int n, int k) {
        
       int result = find(n,k);
        System.out.println(result);
        return result + 1;
    }

    
}








*******************/
