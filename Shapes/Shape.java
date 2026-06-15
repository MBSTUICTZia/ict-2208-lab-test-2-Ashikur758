
abstract class Shape {

    private String color;
    private boolean filled;

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Color : " + color + "\n" +
                "Filled : " + (filled ? "Yes" : "No");
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
}