package ss2_loop;

import java.util.Scanner;

public class Drawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (top-left)");
            System.out.println("3. Print the square triangle (top-right)");
            System.out.println("4. Print the square triangle (botton-left)");
            System.out.println("5. Print the square triangle (botton-right)");
            System.out.println("6. Print isosceles triangle");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSquareTriangleTopLeft();
                    break;
                case 3:
                    printSquareTriangleTopRight();
                    break;
                case 4:
                    printSquareTriangleBottonLeft();
                    break;
                case 5:
                    printSquareTriangleBottonRight();
                    break;
                case 6:
                    printIsoscelesTriangle();
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }

    public static void printRectangle() {
        int height = 5;
        int width = 10;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangleTopLeft() {
        int n = 5;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void printSquareTriangleTopRight() {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangleBottonLeft() {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangleBottonRight() {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printIsoscelesTriangle() {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
