package SeleniumBasics;

class Parent{
	public void printDetails(Parent obj) {
		System.out.println("Person Name : "+((Student1)obj).name);
	}
	
}

class Student1 extends Parent{
	String name = "Vivek";
	
	public void print1(String data) {
		System.out.println("Student Name : "+data);		
	}
	
}

class Teacher1 extends Parent{

	String name = "Poonam";
	
	public void print1(String data) {
		System.out.println("Teacher Name : "+data);		
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		
		Student1 s1 = new Student1();
		Teacher1 t1 = new Teacher1();
		s1.print1("Vivek");
		t1.print1("Poonam");
		
		Parent it = s1;
		it.printDetails(s1);
		Student1 stud = (Student1)it;
		stud.print1("aaa");
		//it.printDetails(t1);
		

	}

}