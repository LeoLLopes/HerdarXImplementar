package application;

import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(Color.BLACK, 3.0, 4.0);
        Circle circle = new Circle(Color.WHITE, 3.0);

        System.out.println("Rectangle data: ");
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Area: " + String.format("%.2f%n", rectangle.area()));

        System.out.println();
        System.out.println("Circle data: ");
        System.out.println("Color: " + circle.getColor());
        System.out.println("Area: "  + String.format("%.2f%n", circle.area()));
    }
}
