package ss4_classobject;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị cho a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập giá trị cho b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập giá trị cho c: ");
        double c = scanner.nextDouble();
        scanner.close();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double discriminant = equation.getDiscriminant();

        if (discriminant > 0) {
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.println("Có 2 nghiệm thực:");
            System.out.println("Nghiệm 1: " + root1);
            System.out.println("Nghiệm 2: " + root2);
        } else if (discriminant == 0) {
            double root = equation.getRoot1();
            System.out.println("Có một nghiệm thực:");
            System.out.println("Nghiệm: " + root);
        } else {
            System.out.println("Phương trình không có nghiệm thực.");
        }
    }
}
