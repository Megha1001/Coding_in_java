//Question : https://www.geeksforgeeks.org/min-cost-path-dp-6/
public class MinCostPath {

	public static int min(int x, int y, int z) {
		if(x < y) {
			return x < z ? x : z;
		}else {
			return y < z ? y : z;
		}
		
	}
	public static int minCost(int[][]cost, int m, int n) {
		
		if(m < 0 || n < 0) {
			return Integer.MAX_VALUE;
		}
		if(m==0 && n ==0) {
			return cost[0][0];
		}
		return cost[m][n] +min(minCost(cost, m -1, n), minCost(cost, m -1, n -1), minCost(cost, m, n-1));
		
		
	}
	public static void main(String[] args) {
		int cost[][] = { {1, 2, 3},
                {4, 8, 2},
                {1, 5, 3} };
                 
		System.out.print(minCost(cost, 2, 2));

	}

}
