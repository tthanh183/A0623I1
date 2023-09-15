package arrayandmethod;

import java.util.Scanner;

public class MatrixMaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của ma trận: ");
        int numRows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int numCols = scanner.nextInt();

        double[][] matrix = new double[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Nhập giá trị cho phần tử ở hàng " + (i + 1) + ", cột " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        double maxElement = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong ma trận là " + maxElement);
        System.out.println("Tọa độ của phần tử lớn nhất là hàng " + (maxRow + 1) + ", cột " + (maxCol + 1));

        scanner.close();
    }
}
