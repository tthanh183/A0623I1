package ss13_search_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecurrence {
    public static int binarySearch(int[] arr, int left, int right, int value) {
        Arrays.sort(arr);
        int middle = (left + right) /2;
        while(left < right) {
            if(arr[middle] == value) {
                return middle;
            }else if(arr[middle] > value) {
                return binarySearch(arr,left,middle-1,value);
            }else {
                return binarySearch(arr,middle+1,right,value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int arr[] = new int[length];
        for(int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int value = Integer.parseInt(scanner.nextLine());
        System.out.println(binarySearch(arr,0,length-1,value));
    }
}
