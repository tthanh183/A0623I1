package _5accessmodifier;

public class Circle {
    private double radius;
    private String color;

    Circle() {

    }
    Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return Math.pow(this.radius,2) * Math.PI;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("Radius: " + circle.getRadius() + "Area: " + circle.getArea());
    }
}
