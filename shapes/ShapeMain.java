package shapes;

import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Shape[] shapes = new Shape[n];

        for (int i = 0; i < n; i++) {

            String type = sc.next().toLowerCase();
            String color = sc.next();
            boolean filled = sc.nextBoolean();

            if (type.equals("rectangle")) {

                double width = sc.nextDouble();
                double length = sc.nextDouble();

                shapes[i] = new Rectangle(color, filled, width, length);

            } else if (type.equals("circle")) {

                double radius = sc.nextDouble();

                shapes[i] = new Circle(color, filled, radius);
            }
        }

        for (int i = 0; i < n; i++) {

            Shape s = shapes[i];

            System.out.println(s.toString());

            if (s instanceof Rectangle) {

                Rectangle r = (Rectangle) s;

                System.out.printf("Area: %.2f%n", r.getArea());
                System.out.printf("Perimeter: %.2f%n", r.getPerimeter());

            } else if (s instanceof Circle) {

                Circle c = (Circle) s;

                System.out.printf("Area: %.2f%n", c.getArea());
                System.out.printf("Perimeter: %.2f%n", c.getPerimeter());
            }

            System.out.println();
        }

        sc.close();
    }
}