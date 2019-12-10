package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {
		// List <String> a1= new ArrayList<>();
		// a1.add("Manu");
		// a1.add("Ammy");
		// a1.add("Varun");

		// List <String> a1= new LinkedList<>();
		// a1.add("Manu");
		// a1.add("Ammy");
		// a1.add("Varun");
		// a1.add("Manu");
		//
		//
		// for(String val: a1)
		// {
		//
		// System.out.println(val);
		//
		// }

		List<Integer> s = new LinkedList<>();

		s.add(9);
		s.add(90);
		s.add(10);
		s.add(17);
		s.add(14);
		
		Collections.sort(s); // to sort list

		for (Integer val : s) {
			System.out.println(val);
		}
	}
}
