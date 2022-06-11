package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PointsToCompare{
	int x;
	int y;
	
	PointsToCompare(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class MyComparator implements Comparator<PointsToCompare>{
	
	public int compare(PointsToCompare p1,PointsToCompare p2) {
		return p1.x - p2.x;
	}
}

public class CollectionsSortOnListForUserDefinedTypeUsingComparator {

	public static void main(String[] args) {
		
		List<PointsToCompare> list = new ArrayList<PointsToCompare>();
		list.add(new PointsToCompare(10,7));
		list.add(new PointsToCompare(0,9));
		list.add(new PointsToCompare(-1,8));
		
		Collections.sort(list, new MyComparator());
		for(PointsToCompare p: list) {
			System.out.println(p.x+" "+p.y);
		}
	}

}
