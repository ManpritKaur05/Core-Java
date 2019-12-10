package DefaultMethodExample;

public interface Cricketer {
	
	void bat();
	void field();
	
	default void ball() {
		
		System.out.println("I can do balling if required");
	}

}
