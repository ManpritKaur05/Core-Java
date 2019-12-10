package SingletonClass;

//singleton means you can create only one instance of that class

//steps to create a singleton class
//1. create a static instance of same class
//2. do not allow user to create a instance using default constructor
//3. you have to create method which should be static which will return a instance of your class

class ABC {
	
	//step1
	
	static ABC obj = new ABC(); //eager approach
	
	//step2
	
	private ABC() {
		
	}
	
	//step3
	
	public static ABC instance() {
		
		return obj; 
	}
	
}

public class Singleton {
	
	public static void main(String[] args) {
		
		ABC obj1 = ABC.instance();
		ABC obj2 = ABC.instance();
	}

}
