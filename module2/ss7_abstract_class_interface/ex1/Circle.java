package ss7_abstract_class_interface.ex1;

public class Circle extends Shape implements Resizeable{
    private double radius;
    public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        this.radius *= percent;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
