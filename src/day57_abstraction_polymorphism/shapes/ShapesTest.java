package day57_abstraction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();
        Shape circle = new Circle();
        circle.draw();
        Shape square = new Square();
        square.draw();

        /**
         * Create list of Shapes and store 10 different shapes
         * using a loop print out each shape
         */

        List<Shape> listOfShapes = new ArrayList<>();
        listOfShapes.add(triangle);
        listOfShapes.add(new Triangle());
        listOfShapes.add(new Square());
        listOfShapes.add(new Square());
        listOfShapes.add(new Circle());
        listOfShapes.add(new Circle());
        listOfShapes.add(new Square());
        listOfShapes.add(new Square());
        listOfShapes.add(new Circle());
        listOfShapes.add(new Circle());

        // System.out.println(listOfShapes); // prints HashCodes of objects

        for (Shape eachShape : listOfShapes)
        {
            eachShape.draw();
        }

        drawShape(new Circle());
        drawShape(new Square());
        drawShape(triangle);
        /**
         * static method: drawShape
         * accept object of shape
         * hen calls draw(0 method
         */


    }
//    public static void drawShape(Circle shape){
//        System.out.println("------Drawing shape ------");
//        shape.draw();
//    }
    public static void drawShape(Shape shape){
        System.out.println("------Drawing shape ------");
        shape.draw();
    }
}
