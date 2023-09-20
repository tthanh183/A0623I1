package ss6_inheritance.ex1;

public class Cylinder extends Circle{
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder() {
        super();
    }
    public Cylinder(double radius, String color, double height) {
        super(radius,color);
        this.height = height;
    }
    public  double getVolume() {
        return super.getArea() * this.height;
    }
    @Override
    public String toString() {
        return "Cylinder with radius: " + super.getRadius() + " color: " + super.getColor() + "height: " + this.getHeight();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2,"Red");
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        Cylinder cylinder = new Cylinder(3, "Blue", 5);
        System.out.println(cylinder.toString());
        System.out.println("Area: " + cylinder.getArea());
    }
}

