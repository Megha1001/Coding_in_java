package sorting;

import java.util.Arrays;
import java.util.Comparator;

class Points{
	int x;
	int y;
	
	Points (int x,  int y){
		this.x = x;
		this.y = y;
	}
}

class MyCmp implements Comparator<Points>{

	@Override
	public int compare(Points p1, Points p2) {
		return p1.x - p2.x; // ascending order
	}
	
	//descending order
	//return p2.x - p1.x; 
	
}

public class ComparatorExample1 {

	public static void main(String[] args) {
		
		Points [] arr = {new Points(10,20), new Points(3,12), new Points(5,7)};
		
		Arrays.sort(arr,new MyCmp());
		for(int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i].x+" "+arr[i].y);
		}

	}

}
