package CollectionFramework;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

//stack is subclass of Vector. It implements Last In First Out

public class StackCollection {
	
	public static void main(String[] args) {
		
		//List<String> li = new Stack<String>();
		//Vector<String> v = new Stack<String>();
		Stack<String> st = new Stack<String>();
		
		st.push("Manu");
		st.push("Nonu");
		st.push("Varun");
		
		st.pop();
		
//		Iterator<String> itr = st.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		for(String x : st) {
			System.out.println(x);
		}
		
		
	}

}
