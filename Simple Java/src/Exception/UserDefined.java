package Exception;

public class UserDefined
{
	public static void main(String[] args) {
		
	
	int i =8;
	int j=9;
	
	try 
	{
	int k = i/j;
	
	if(k==0)
	{
		//throw new Exception();
			throw new AmmyException("this is zero ");
	}
	
	System.out.println(k);
	
	}
	
	
	catch(AmmyException e)
	{
		
		System.out.println("error " + e.getMessage());
	}

}
}



