import java.util.*;

class FoundLeftCeilingNaiveApp{
	
	public static void main(String[] args){
	int [] input = {2,8,30,15,25,12};
	printCeling(input, input.length);
    }

	public static void printCeling(int[] input, int n){
	System.out.println(-1);
	
	for(int i = 0; i < n; i++){
	    int temp = Integer.MAX_VALUE;
	    for(int j = 0; j < i; j++){
	        if(input[j] >= input[i]){
	        temp = Math.min(temp, input[j]);
            }
        }

        if(temp == Integer.MAX_VALUE){
	        System.out.println(-1);
        }else{
	        System.out.println(temp);
        }
    }
    }
}

/*

-1
-1
-1
-1
30
30
15

*/
