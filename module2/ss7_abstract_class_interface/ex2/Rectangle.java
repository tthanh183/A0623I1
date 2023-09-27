package ss7_abstract_class_interface.ex2;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle() {

    }
    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }
}
