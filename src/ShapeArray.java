//Driver class to instantiate and display information about different shapes
public class ShapeArray {
    public static void main(String[] args) {
        //Instantiate 1 triangle
        Triangle triangle = new Triangle(3.2, 4.31, 5.9);

        //Instantiate 1 circle
        Circle circle = new Circle(4.1);

        //Instantiate 1 rectangle
        Rectangle rectangle = new Rectangle(16.0, 12.0);

        //Store class instances into an array of shapes
        Shape[] shapeArray = {triangle, circle, rectangle};

        //Loop through the array and print out instance data of each object
        for (Shape shape : shapeArray)
            System.out.println(shape.toString());
    }
}