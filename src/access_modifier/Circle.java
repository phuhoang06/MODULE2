package access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double r) {
        this.radius = r;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
