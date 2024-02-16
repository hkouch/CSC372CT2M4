// Circle class extending the Shape class
public class Circle extends Shape {
    //Attribute
    private double radius;

    //Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //Override toString method to display formatted area and perimeter
    @Override
    public String toString() {
    	return String.format("Circle - Area: %.2f, Perimeter: %.2f",
    			area(), perimeter());
    }

    //Implement abstract method for area of a circle
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    //Implement abstract method for perimeter of a circle
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}