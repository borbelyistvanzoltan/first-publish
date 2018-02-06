package sandbox;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ForEachMapAndList {
	
	static void filter(Collection c) {
		Iterator itr = c.iterator();
		while(itr.hasNext()){
		        System.out.println("Removed element: " + itr.next());
		        itr.remove();
		    }
	}
	
	static void printer(Collection c) {
	    
    
}

private static boolean cond(Object next) {
		// TODO Auto-generated method stub
		return false;
	}

//	static boolean cond(Object obj) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	public static void main(String[] args) {

		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		
		
		
		
		
//		Iterator<String> iterator = set.iterator();
//	    while(iterator.hasNext()) {
//	        System.out.println("Iterator" + iterator);
//	    }

		filter(set);
		printer(set);
		
		/*
		 * Normal way to loop a MAP
		 */
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}

		System.out.println("*******************");

		/*
		 * In Java 8, you can loop a Map with forEach + lambda expression
		 */
		items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));
		
		System.out.println("///////////////////");
		
		List<String> itemsList = new ArrayList<>();
		itemsList.add("A");
		itemsList.add("B");
		itemsList.add("C");
		itemsList.add("D");
		itemsList.add("E");

		//lambda
		//Output : A,B,C,D,E
		itemsList.forEach(item->System.out.println(item));
		
		//Output : C
		itemsList.forEach(item->{
			if("C".equals(item)){
				System.out.println("I found C: " + item);
			}
		});
		
		

	}

}
