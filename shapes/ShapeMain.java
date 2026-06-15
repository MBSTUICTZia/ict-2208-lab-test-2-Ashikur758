package shapes;

import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String type = sc.next().toLowerCase();
            String color = sc.next();
            boolean filled = sc.nextBoolean();

            Shape shape;

            if (type.equals("rectangle")) {

                double width = sc.nextDouble();
                double length = sc.nextDouble();

                shape = new Rectangle(color, filled, width, length);

            } else {

                double radius = sc.nextDouble();

                shape = new Circle(color, filled, radius);
            }

            System.out.println(shape.toString());
            System.out.printf("Area: %.2f%n", shape.getArea());
            System.out.printf("Perimeter: %.2f%n", shape.getPerimeter());
            System.out.println();
        }

        sc.close();
    }
}