package OOPS;

abstract class Shape {
    private String name;

    public Shape() {
        this.name = "Unknown shape";
    }/*www  .j  ava 2 s  .c  om*/

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void draw();

    public abstract double getArea();

    public abstract double getPerimeter();
}

// A Rectangle Class, Which Inherits from the Shape Class

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        // Set the shape name as "Rectangle"
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    // Provide an implementation for inherited abstract draw() method
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }

    // Provide an implementation for inherited abstract getArea() method
    public double getArea() {
        return width * height;
    }

    // Provide an implementation for inherited abstract getPerimeter() method
    public double getPerimeter() {
        return 2.0 * (width + height);
    }
}

// A Circle Class, Which Inherits from Shape Class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // Provide an implementation for inherited abstract draw() method
    public void draw() {
        System.out.println("Drawing a circle...");
    }

    // Provide an implementation for inherited abstract getArea() method
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Provide an implementation for inherited abstract getPerimeter() method
    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }
}

// A ShapeUtil Class That Has Utility Methods to Draw Any Shapes and Print
// Details About Them

class ShapeUtil {
    public static void drawShapes(Shape[] list) {
        for (int i = 0; i < list.length; i++) {
            // Draw a shape, no matter what it is
            list[i].draw(); // Late binding
        }
    }

    public static void printShapeDetails(Shape[] list) {
        for (int i = 0; i < list.length; i++) {
            // Gather details about the shape
            String name = list[i].getName(); // Late Binding
            double area = list[i].getArea(); // Late binding
            double perimeter = list[i].getPerimeter();


            System.out.println("Name: " + name);
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
        }
    }
}

