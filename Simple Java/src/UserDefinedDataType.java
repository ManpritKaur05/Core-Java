import java.util.ArrayList;
import java.util.List;

class Stud {
	
	private int rollNo;
	private int Marks;
	private String name;
	//private Lap laptop;
	private List<Lap> laptop = new ArrayList<>();
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		
		this.rollNo=rollNo;
	}
	
	public int getMarks() {
		return Marks;
	}
	
	public void setMarks(int Marks) {
		
		this.Marks=Marks;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		
		this.name=name;
	}
	
//	public Lap getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop (Lap laptop) {
//		
//		this.laptop = laptop;
//	}
	
	public List<Lap> getLaptop() {
		return laptop;
	}
	
	public void setLaptop(List<Lap> laptop) {
		
		this.laptop=laptop;
	}

	@Override
	public String toString() {
		return "Stud [rollNo=" + rollNo + ", Marks=" + Marks + ", name=" + name + ", laptop=" + laptop + "]";
	}

}

class Lap {
	
	private int lid;
	private String brand;
	
	public int getLid() {
		return lid;
	}
	
	public void setLid(int lid) {
		this.lid=lid;
	}
	
	public String getBrand() {
		return brand;
	}
	
	@Override
	public String toString() {
		return "Lap [lid=" + lid + ", brand=" + brand + "]";
	}

	public void setBrand(String brand) {
		this.brand=brand;
	}
}

public class UserDefinedDataType {
	
	public static void main(String[] args) {
		
		Stud st = new Stud();
		Lap lapy = new Lap();
		Lap lapy1 = new Lap();
		
		lapy.setLid(101);
		lapy.setBrand("Dell");
		
		lapy1.setLid(102);
		lapy1.setBrand("Acer");
		
		st.setRollNo(1);
		st.setName("Manu");
		st.setMarks(98);
		//st.setLaptop(lapy);
		
		st.getLaptop().add(lapy);
		st.getLaptop().add(lapy1);
		
		System.out.println(st);
	}

}
