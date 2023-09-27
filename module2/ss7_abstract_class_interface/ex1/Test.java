package ss7_abstract_class_interface.ex1;

public class Test {
    public static void main(String[] args) {
        Shape[] shapeArr = new Shape[10];
        shapeArr[0] = new Circle(2.5);
        shapeArr[1] = new Rectangle(2,4);
        shapeArr[2] = new Square(7);
        for(int i = 0 ; i < 3; i++) {
            System.out.println(shapeArr[i] + "có diện tích ban đầu là: " + shapeArr[i].getArea());
        }
        for(int i = 0 ; i < 3; i++) {
            Resizeable sizeableShape = (Resizeable) shapeArr[i];
            sizeableShape.resize(1.5);
        }
        for(int i = 0 ; i < 3; i++) {
            System.out.println(shapeArr[i] + "có diện tích lúc sau là: " + shapeArr[i].getArea());
        }
    }
}
