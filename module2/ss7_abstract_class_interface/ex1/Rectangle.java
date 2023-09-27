package ss7_abstract_class_interface.ex1;

public class Rectangle extends Shape implements Resizeable{
    private double width;
    private double height;

    public Rectangle() {

    }
    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }
    @Override
    public void resize(double percent) {
        this.height *= percent;
        this.width *= percent;
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }
}
