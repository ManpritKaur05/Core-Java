package CollectionFramework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//Key,Value pair e.g string,string or integer,string or anything
//no sequence maintained
//maps doesn'duplicate keys but duplicate values are allowed

public class Mapp {

	public static void main(String[] args) {

		// Map<String, String> m1 = new HashMap();
		//
		// //keys are internally Sets
		//
		// m1.put("MyName", "Manu");
		// m1.put("Cricketer", "Rohit");
		// m1.put("Captain", "Marvel");
		// m1.put("Cricketer", "Dhoni"); //it will override/unsynchronized the
		// first one
		//
		// System.out.println(m1);
		//
		// System.out.println(m1.get("Captain"));
		//
		// m1.put("MyName", "Manu");
		// m1.put("Cricketer", "Rohit");
		// m1.put("Captain", "Manu");
		// m1.put("Cricketer", "Dhoni"); //duplicate values are allowed but
		// duplicate keys are not allowed
		//
		// m1.put(" ", "Manu"); //null key not possible
		// m1.put("Kaur", " "); //null value is possible
		//
		// System.out.println(m1);
		//
		// //HashTable don't allow null key or value.
		// Map<String, String> m3 = new Hashtable(); //hashtable is synchronised
		// but hashmap is not
		//
		// Map<Integer, Integer> m4 = new LinkedHashMap<Integer, Integer>();
		// //prints in order
		//
		// m4.put(3, 86);
		// m4.put(56, 6);
		// m4.put(1, 76);
		// m4.put(34, 89);
		// m4.put(32, 82);
		// m4.put(35, 341);
		// m4.put(4, 67);
		// m4.put(90, 34);
		//
		// Set<Integer> keys = m4.keySet();
		//
		// for(Integer x: keys) {
		// System.out.println(x + " " + m4.get(x));
		// }

		Map<String, String> m1 = new LinkedHashMap<>();
		m1.put("MyName", "Manu");
		m1.put("Cricketer", "Rohit");
		m1.put("Captain", "Manu");
		m1.put("Cricketer", "Dhoni");

		System.out.println(m1);

		// Map<Integer, String> m5 = new TreeMap();
		//
		// m5.put(3, "MAnu");
		// m5.put(56, "Amit");
		// m5.put(1, "jhsd");
		// m5.put(34, "sfdag");
		// m5.put(32, "dqaf");
		// m5.put(35, "wfgfgs");
		// m5.put(4, "sdfa");
		// m5.put(90, "sdfaf");
		//
		//// Set<Integer> keys = m5.keySet();
		////
		//// for(Integer x: keys) {
		//// System.out.println(x + " " + m5.get(x));
		//// }
		//
		// Set<Map.Entry<Integer, String>> values = m5.entrySet(); // entry is a
		// // concatenated
		// // interface
		// // which is
		// // inside map
		// // interface and
		// // entrySet()
		// // function
		// // inside Entry
		//
		// for (Map.Entry<Integer, String> x : values) {
		//
		// System.out.println(x.getKey() + " " + x.getValue());
		// }

	}

}
