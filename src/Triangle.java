//Triangle class extending the Shape class
public class Triangle extends Shape {
    //Attributes are the 3 sides
    private double side1;
    private double side2;
    private double side3;

    //Parameterized constructor = only constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //Override toString method to display formatted area and perimeter
    @Override
    public String toString() {
    	return String.format("Triangle - Area: %.2f, Perimeter: %.2f",
    			area(), perimeter());
    }

    //Implement abstract method for area of a triangle
    @Override
    public double area() {
        return side1 * side2 * 0.5;
    }

    //Implement abstract method for perimeter of a triangle
    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}