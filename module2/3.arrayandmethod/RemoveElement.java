package arrayandmethod;

import java.util.Scanner;

public class RemoveElement {
    public  static  int findElement(int[] arr, int x) {
        for(int i = 0; i < arr.length; i++ ) {
            if(arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public  static void  removeElement(int[] arr, int index) {
        if(index == -1 ) {
            System.out.println("Không tồn tại!");
        }
        else {
            for(int i = index; i < arr.length; i++) {
                if(i == arr.length -1 ) {
                    arr[i] = 0;
                }else {
                    arr[i] = arr[i+1];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        }

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
        System.out.println("Nhập vào giá trị phần tử cần xóa: ");
        int value = scanner.nextInt();
        int index = findElement(array,value);
        removeElement(array, index);
    }
}
