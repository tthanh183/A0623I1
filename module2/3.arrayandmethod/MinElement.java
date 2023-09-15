package arrayandmethod;

import java.util.Scanner;

public class MinElement {

    public static int findMinElement(int[] arr) {
        int min = arr[0];
        for(int i = 1 ; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Nhập vào các phần tử của mảng: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Giá trị nhỏ nhất của mảng: " + findMinElement(array));
    }
}
