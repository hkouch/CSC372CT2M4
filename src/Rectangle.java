//Rectangle class extending the Shape class
public class Rectangle extends Shape {
    //Attributes
    private double width;
    private double length;

    //Parameterized constructor
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    //Override toString method to display formatted area and perimeter
    @Override
    public String toString() {
    	return String.format("Rectangle - Area: %.2f, Perimeter: %.2f",
    			area(), perimeter());
    }

    //Implement abstract method for area of a rectangle
    @Override
    public double area() {
        return width * length;
    }

    //Implement abstract method for perimeter of a rectangle
    @Override
    public double perimeter() {
        return 2 * (width + length);
    }
}