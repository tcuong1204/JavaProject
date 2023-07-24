package sharing;

public class OOPAbstraction {

    public static void main(String[] args) {

        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);

        System.out.println(s1.printText());
        System.out.println(s2.printText());

    }


}

// Abstract classes are used to define a generic template for other classes to follow.
// They define a set of rules and guidelines that their subclasses must follow.
// By providing an abstract class, we can ensure that the classes that extend it have a consistent structure and behavior.
// This makes the code more organized and easier to maintain.

abstract class Shape {
    String color;

    // These are abstract methods
    abstract double area();
    public abstract String printText();

    // Abstract class can have the constructor
    public Shape(String color)
    {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // This is a concrete method
    public String getColor() {

        return color;

    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius)
        {
            // Calling Shape constructor
            super(color);
            System.out.println("Circle constructor called");
            this.radius = radius;
        }

    @Override double area()
        {
            return Math.PI * Math.pow(radius, 2);
        }

    @Override public String printText()
        {
            return "Circle with color " + super.getColor() + " have area is: " + area();
        }
}


class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String color, double length, double width)
        {
            // calling Shape constructor
            super(color);
            System.out.println("Rectangle constructor called");
            this.length = length;
            this.width = width;
        }

    @Override double area() { return length * width; }

    @Override public String printText()
    {
        return "Rectangle with color " + super.getColor() + " have area is: " + area();
    }
}
