package sorting;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortOnList {

	public static void main(String[] args) {
		// Collections.sort() --> apply on list interface --> ArrayList, LinkedList, Vector
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(0);
		list.add(8);
		list.add(78);
		
		//Natural order sorting
		Collections.sort(list);
		System.out.println(list);
		
		//reverse Order
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}

}
