package Java8Features;

//External iteration - in this, some for-loop/loop outside of the object is trying to fetch the data from the object
//Internal iteration - what if in your collection u have a method through which u can increment and fetch the data. and we can achieve this using stream api

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExternalIteration {

	public static void main(String[] args) {

		// Functional programming in java 8 - means u don't have to focus how to
		// do things, u just focus on what to do

		List<Integer> l = Arrays.asList(2, 5, 1, 8, 6, 4);

		// all these loops are called as external iteration

		for (Integer i : l) {
			System.out.println(i);
		}

		// for(int j=0; j<=l.size(); j++) {
		// System.out.println(j);
		// }
		//
		// Iterator<Integer> i1 = l.iterator();
		//
		// while(i1.hasNext()) {
		// System.out.println(i1.next());
		// }

	}

}
