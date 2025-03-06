package apna;

abstract class Animal{
	abstract void walk(); 
	 Animal() {
     System.out.println("you r creating a new animal");
	 }
	
	public void eat() {
		System.out.println("Animal eats");
	}
	
}

class Horse extends Animal{
	Horse(){
		System.out.println("you are created  gorse");
	}
	public void walk() {
		System.out.println("walks on 4 legs");
	}
}
class Chicken extends Animal{
	public void walk() {
		System.out.println("walks on 2 legs");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Horse h=new Horse();
//		h.walk();
//		h.eat();
		}

}
