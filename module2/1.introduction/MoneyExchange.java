package introduction;

import java.util.Scanner;

public class MoneyExchange {
    public  static double exchangeMoney(double money) {
        final double rate = 23000;
        return money * rate;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền USD");
        double money = scanner.nextDouble();
        System.out.println(exchangeMoney(money) + "VND");
    }
}
