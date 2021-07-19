package SeleniumBasics;

interface Interface1{
	public void print(String data);
}

class Student implements Interface1{

	@Override
	public void print(String data) {
		System.out.println("Student Name : "+data);		
	}
	
}

class Teacher implements Interface1{

	@Override
	public void print(String data) {
		System.out.println("Teacher Name : "+data);		
	}
	
}

public class Interface {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Teacher t1 = new Teacher();
		s1.print("Vivek");
		t1.print("Poonam");
		
		Interface1 it = s1;
		it.print("XX");
		it = new Teacher();
		it.print("XYZ");

	}

}
