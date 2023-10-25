package ss14_sorting_algorithm;

import java.util.Scanner;

public class InsertionSortIllustrator {
    public static void insertionSort(int[] arr) {
        int pos, value;
        for(int i = 1; i < arr.length; i++) {
            value = arr[i];
            pos = i;
            while(pos > 0 && arr[pos-1] > value ) {
                arr[pos] = arr[pos-1];
                pos--;
            }
            arr[pos] = value;
            System.out.println("Bước " + (i -1));
            for(int index = 0; index < arr.length; index ++) {
                System.out.print(arr[index] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int length = Integer.parseInt(scanner.nextLine());
        int[] intArr = new int[length];
        for(int i = 0; i < length; i++) {
            intArr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Trước khi sắp xếp: ");
        for(int index = 0; index < intArr.length; index ++) {
            System.out.print(intArr[index] + "\t");
        }
        System.out.println("Sau khi sắp xếp: ");
        insertionSort(intArr);
    }
}
