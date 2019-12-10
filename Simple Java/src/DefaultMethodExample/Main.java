package DefaultMethodExample;

public class Main {
	
	public static void main(String[] args) {
		
		Cricketer cric = new Batsman();
		
		cric.bat();
		cric.ball();
		cric.field();
		
		Cricketer crot = new Allrounder();
		
		crot.ball();
		crot.bat();
		crot.field();
	}

}
