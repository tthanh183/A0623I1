package ss15_exception;


import java.util.Scanner;

public class IllegalTriangleException extends Throwable {
    public static void input() throws IllegalTriangleException{
        Scanner scanner = new Scanner(System.in);
        int sideA, sideB, sideC;
        System.out.println("Nhập cạnh A: ");
        sideA = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cạnh B: ");
        sideB = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cạnh C: ");
        sideC = Integer.parseInt(scanner.nextLine());
        if(sideA < 0 || sideB < 0 || sideC < 0) {
            throw new IllegalTriangleException();
        }else if(sideA + sideB <= sideC || sideB + sideC <= sideA || sideC + sideA <= sideB) {
            throw new IllegalTriangleException();
        }
    }
    public static void main(String[] args) {
        try{
            input();
        }catch (IllegalTriangleException e) {
            System.out.println("Error!");
        }
    }
}
