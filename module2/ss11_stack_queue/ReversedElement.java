package ss11_stack_queue;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ReversedElement {
    public static void revereInteger(ArrayList<Integer> arrays) {
        Stack<Integer> stack = new Stack<Integer>();
        for (Integer i: arrays) {
            stack.push(i);
        }
        arrays.clear();
        while (!stack.isEmpty()) {
            arrays.add(stack.pop());
        }
    }
    public static String reverseString(String str) {
        String[] strings = str.split("(?!^)");
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử");
        int n = scanner.nextInt();
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        System.out.println("Nhập vào mảng số nguyên");
        for (int i = 0; i < n; i++) {
            integerArrayList.add(scanner.nextInt());
        }
        ReversedElement.revereInteger(integerArrayList);
        System.out.println(integerArrayList);
        System.out.println("Nhập vào chuỗi");
        String str = scanner.nextLine();
        System.out.println(ReversedElement.reverseString(str));
    }
}
