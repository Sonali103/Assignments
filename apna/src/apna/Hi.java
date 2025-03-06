package apna;

interface Animals {
	int eyes=2;
	void walk();
}
interface Herbivore{
	
}
class Horses implements Animals,Herbivore{
	public void walk() {
		System.out.println("walks on 4 legs ");
	}
}
//class Studentds{
//	String name;
//    static String school;
//    
//    public static void  changeSchool() {
//    	school="new school";
//    }
//}

public class Hi{
	public static void main(String args[]) {
		Horses h=new Horses ();
		h.walk();
//		Student.school="JVM";
		Student student1=new Student();
		student1.name="hehe";
		
	}
}