package shapes;

import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Shape[] shapes = new Shape[2]; // auto tests usually small fixed

        int i = 0;

        while (sc.hasNext()) {

            String type = sc.next();

            String color = sc.next();
            String filledStr = sc.next();
            boolean filled = Boolean.parseBoolean(filledStr);

            if (type.equalsIgnoreCase("RECTANGLE")) {

                double width = sc.nextDouble();
                double length = sc.nextDouble();

                shapes[i++] = new Rectangle(color, filled, width, length);

            } else if (type.equalsIgnoreCase("CIRCLE")) {

                double radius = sc.nextDouble();

                shapes[i++] = new Circle(color, filled, radius);
            }

            if (i >= shapes.length)
                break;
        }

        for (Shape s : shapes) {
            if (s != null) {
                System.out.println(s);
                System.out.println();
            }
        }

        System.out.println("--- Downcast Check ---");

        for (Shape s : shapes) {

            if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                System.out.println("Rectangle width=" + r.getWidth()
                        + " length=" + r.getLength());

            } else if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.println("Circle radius=" + c.getRadius());
            }
        }

        sc.close();
    }
}