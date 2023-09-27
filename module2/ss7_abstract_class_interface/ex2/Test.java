package ss7_abstract_class_interface.ex2;

public class Test {
    public static void main(String[] args) {
        Shape[] shapeArr = new Shape[10];
        shapeArr[0] = new Rectangle(2,3);
        shapeArr[1] = new Square(2);
        for(int i = 0 ; i < 2; i++) {
            System.out.println(shapeArr[i] + "có diện tích là: " + shapeArr[i].getArea());
            if(shapeArr[i] instanceof Colorable) {
                Colorable colorable = (Colorable)  shapeArr[i];
                System.out.println(colorable.howToColor());
            }
        }
    }   
}
