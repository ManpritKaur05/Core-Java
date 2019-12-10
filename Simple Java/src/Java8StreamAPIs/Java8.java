package Java8StreamAPIs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8 {
	public static void main(String[] args) {
		
		List<Integer>l1 = Arrays.asList(1,2,3,4,7,6);
		
	/*	Consumer<Integer> c = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer i) {

				System.out.println(i);
				
			}
		};*/
		
		
//	Consumer<Integer> c = (Integer i)->System.out.println(i);
//				
//					
		
	//	l1.forEach((i)->System.out.println(i));
		//l1.forEach(System.out::println);
		
		
		l1.forEach(Java8StreamAPIs.Java8::doubleit);
		
		
		
		
	

}
	
	public static void doubleit(int i)
	{
		
		System.out.println(i*2);
		
	}
	
	
	
}

