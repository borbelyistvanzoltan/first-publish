package List;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingAndUnboxing {

	public static List makeAList() {
		List<Integer> li = new ArrayList<>();
		for (int i = 1; i < 50; i += 2)
			li.add(i);
		return (li);
	}

	public static void getAllElementsFromAList(List<Integer> li) {
		for (int s : li)
			System.out.println("A lista " + s + ". eleme: " + s);
	}

	public static void main(String[] args) {

		getAllElementsFromAList(makeAList());

	}

}
