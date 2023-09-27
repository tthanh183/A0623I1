package ss2_loop;

import java.util.Scanner;

public class First20PrimeNumbers {
    Scanner sc = new Scanner(System.in);
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a  = 0;
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                a++;
            }
            if( a == 20){
                break;
            }
        }
    }
}
