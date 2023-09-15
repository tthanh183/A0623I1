package arrayandmethod;

import java.util.Scanner;

public class ConcatArray {
    public static int[] concatArray(int[] arr1, int[] arr2) {
        int[] tmp = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++) {
            tmp[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++) {
            tmp[i+arr1.length] = arr2[i];
        }
        return tmp;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng 1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Nhập vào các phần tử của mảng 1: ");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Nhập vào số phần tử của mảng 2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Nhập vào các phần tử của mảng 2: ");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
        int[] array3 = concatArray(array1, array2);
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i] + " ");
        }
    }
}
