package arrayandmethod;

import java.util.Scanner;

public class AddElement {
    public static int[] addElement(int[] arr, int value, int index) {
        int[] tmp = new int[arr.length+ 1];
        if(index < 0 || index > arr.length ) {
            System.out.println("Vị trí không hợp lệ");
        }else {
            for(int i = 0; i < index; i++) {
                tmp[i] = arr[i];
            }
            for(int i = index + 1; i < tmp.length; i++) {
                tmp[i] = arr[i-1];
            }
            tmp[index] = value;
        }
        return tmp;
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
        System.out.println("Mảng trước khi thêm: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println("Nhập vào giá trị muốn thêm vào mảng: ");
        int value = scanner.nextInt();
        System.out.println("Nhập vào vị trí muốn thêm vào mảng: ");
        int index = scanner.nextInt();
        array = addElement(array, value, index);
        System.out.println("Mảng sau khi thêm: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
