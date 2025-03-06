package apna;

class pen{
	String color;
	String type;
	
	public  void write() {
		System.out.println("Writing something");
	}
	public void printcolor() {
		System.out.println(this.color);
	}
}
class Student{
	String name;
	int age;
	
//	public void printInfo() {
//		System.out.println(this.name);
//		System.out.println(this.age);
//	}
//	Parameterized constructor
//	Student(String name,int age){
//    this.name=name;
//    this.age=age;
//	}
	public void printInfo(String name) {
		System.out.println(name);
	}
	public void printInfo(int age) {
		System.out.println(age);
	}
	public void printInfo(String name,int age)
	{
		System.out.println(name+ " " +age);
	}	
}

public class OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		pen pen1=new pen();
		pen1.color="blue";
		pen1.type="gel";
		pen1.write();
		pen1.printcolor();
		
		pen pen2=new pen();
		pen2.color="black";
		pen2.type="ballpoint";
		
		pen2.printcolor();
		
		Student student1=new Student();
		student1.name="hi";
		student1.age=22;
		Student s2=new Student(student1);
//		student1.printInfo();
		s2.printInfo();*/
		Student student=new Student();
		student.name="hi";
		student.age=22;
		student.printInfo(student.age);
		student.printInfo(student.name,student.age);
		
	}

}
