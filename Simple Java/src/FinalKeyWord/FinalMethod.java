package FinalKeyWord;

//final class A1
class A1
{
	
	public A1() {
		System.out.println("Yiepeeee");
	}

	// public final void show()
	
	public void show()
	
	{
		System.out.println("mana pad raha hai ");
	}
	
	public void test()
	{
		System.out.println("mana nachega");
		
	}

}

class B extends A1
{
	
	public B() {

		
		System.out.println("Nopieeee");
	}
	
public void show()
{

	
	
	System.out.println("Mana mere sath pad raha hai ");
	
}

public void disp()
{
System.out.println("Mana mere sath khelega ");	
}

}



public class FinalMethod 
{
	
	public static void main(String[] args) {
		
		A1 obj = new B();
		obj.test();
		obj.show();
		
		
		
	}

}
