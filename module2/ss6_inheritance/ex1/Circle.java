package ss6_inheritance.ex1;

public class Circle {
    private double radius;
    private String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.pow(this.radius,2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle with radius: " + this.getRadius()+ " color: " + this.getColor();
    }
    public Circle() {
    }
    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }
}
