package ss6_inheritance.ex4;

import java.util.Scanner;

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        // Sử dụng công thức Heron để tính diện tích
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Tam giac co do dai ba canh lan luot la " + side1 + ", " + side2 + ", " + side3 +
                "\nChu vi cua tam giac la " + getPerimeter() +
                "\nDien tich cua tam giac la " + getArea();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài cạnh 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Nhập độ dài cạnh 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Nhập độ dài cạnh 3: ");
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);

        scanner.nextLine();
        System.out.print("Nhập màu sắc của tam giác: ");
        String color = scanner.nextLine();

        triangle.setColor(color);

        System.out.println(triangle.toString());

        scanner.close();
    }
}