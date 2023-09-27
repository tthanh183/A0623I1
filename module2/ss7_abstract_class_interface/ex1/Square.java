package ss7_abstract_class_interface.ex1;

public class Square extends Shape implements Resizeable {
    private double side;
    public Square(){

    }
    public Square(double side) {
        this.side = side;
    }
    @Override
    public void resize(double percent) {
        this.side *= percent;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }
}
