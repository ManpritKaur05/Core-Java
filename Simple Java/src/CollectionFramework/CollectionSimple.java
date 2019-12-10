package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionSimple {

	public static void main(String[] args) {
		Collection values = new ArrayList();
	
		values.add(10);
		values.add("Manu");
		values.add(30);
		values.add("Amit");
		
//		System.out.println(values);
		
//		for(int i =0; i<2;i++)
//		{
//			
//		System.out.println(((ArrayList) values).get(i));
//			
//		}
//		
//		for(Object valu: values)
//		{
//			System.out.println(valu);
//			
//		}
		
		
		Iterator itr= values.iterator();
	
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
			
		}
		
		
	}
	
}
