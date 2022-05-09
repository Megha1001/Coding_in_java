import java.util.*;

public class BestAverage {
	static String data[][] = new String[][] { { "Bob", "87" }, { "Mike", "35" }, { "Bob", "52" }, { "Jason", "35" },
			{ "Mike", "55" }, { "Jessica", "99" } };

	public static int getBestAverage() {
		int best = -1;
		
		Map<String, int[]> map = new HashMap<>();
		
		for(String[] d : data) {
			String name = d[0];
			int score = Integer.parseInt(d[1]);
			
			if(!map.containsKey(name)) {
				map.put(name, new int[] {1, score});
			}else {
				map.get(name)[0]++;
				map.get(name)[1] += score;
			}
		}
		
		for(int[]score : map.values()) {
			best = Math.max(best, score[1]/score[0]);
		}
		
		return best;
	}
	public static void main(String[] args) {
		System.out.println(getBestAverage());
	}
}
