package ss7_abstract_class_interface.ex2;

public class Square extends Shape implements Colorable {
    private double side;
    public Square(){

    }
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public String howToColor() {
        return "Color all four sides";
    }
}
