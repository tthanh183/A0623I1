package ss3_arrayandmethod;

import java.util.Arrays;
import java.util.Scanner;

public class CountChar {
    public static int count(String str, char c) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                count ++;
            }
        }
        return count ;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi:");
        String str = scanner.nextLine();
        System.out.println("Nhập vào một ký tự:");
        char character = scanner.next().charAt(0);
        System.out.println("Số lần xuất hiện của kí tự: " + count(str, character));
        String[] a = {"Jonh", "Mary", "Caly", "Tomy"};
        Arrays.sort(a);
        System.out.println(a[3]);
    }
}
