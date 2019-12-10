package ObjectCloning;

//object cloning means to make duplicate object

//3 Approaches of object copying
//1. Shallow Copy
//2. Deep Copy
//3. Object Clonning


//Cloneable interface is a marker interface

//Marker interface is used when we want some permission

class Student implements Cloneable {

	int rollNo;
	String name;
	int marks;

	// toString method is used to print values of object
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}

}

public class Cloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		// Shallow Copy - here we are not creating a different object, we jest
		// creating one more reference that is assigned to the same object

//		//Student st = new Student();
//		st.rollNo = 101;
//		st.name = "Manu";
//		st.marks = 98;
//
//		Student st1 = st;
//
//		System.out.println(st);
//		System.out.println(st1);

		// Deep Copy - here we are creating a new object and we are taking all
		// the values from first object and putting the values to the second
		// object
		
//		Student st = new Student();
//		
//		st.rollNo = 101;
//		st.name = "Manu";
//		st.marks = 98;
//		
//		Student st1 = new Student();
//		
//		st1.rollNo=st.rollNo;
//		st1.name=st.name;
//		st1.marks=st.marks;
//		
//		System.out.println(st);
//		System.out.println(st1);
		
		//Problem with deep copy - it is time consuming
		
		//Object Clonning - it is the combination of both deep and shallow copying
		
		Student st = new Student();
		
		st.rollNo = 101;
		st.name = "Manu";
		st.marks = 98;
		
		Student st1 = (Student) st.clone();
		
		System.out.println(st);
		System.out.println(st1);
		

	}

}
