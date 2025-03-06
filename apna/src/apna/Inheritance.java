package apna;


class Shape{
	public void area() {
		System.out.println("Displays area");
	}
}

class Triangle extends Shape{
	public void area(int l,int h) {
		System.out.println(0.5*l*h);
	}
}

class Circle extends Shape{
	public void area(int r) {
		System.out.println((3.14)*r*r);
	}
}

class EquilateralTriangle extends Triangle{
	public void area(int l,int h) {
		System.out.println(l*h);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1=new Triangle();
		t1.area();
		t1.area(6,9);
		
		EquilateralTriangle eq=new EquilateralTriangle();
		eq.area();
		eq.area(90,100);
		
		Circle c=new Circle();
		c.area(56);
		
	}

}
