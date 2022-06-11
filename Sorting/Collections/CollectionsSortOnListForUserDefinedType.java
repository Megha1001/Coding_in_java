package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PointToSort implements Comparable<PointToSort>{
	int x ;
	int y;
	
	PointToSort(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(PointToSort p1) {
		return this.x - p1.x;
	}
}

public class CollectionsSortOnListForUserDefinedType {

	public static void main(String[] args) {
		List<PointToSort> list = new ArrayList<PointToSort>();
		list.add(new PointToSort(0, 0));
		list.add(new PointToSort(10, 4));
		list.add(new PointToSort(4, 8));
		
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).x + " "+list.get(i).y);
		}

	}

}
