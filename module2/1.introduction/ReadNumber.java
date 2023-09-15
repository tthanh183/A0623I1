package introduction;

import java.util.Arrays;
import java.util.Scanner;

public class ReadNumber {
    public static String lessThanTen(int num) {
        String result = "";
        switch (num) {
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
            case 0:
                result = "zero";
                break;
        }
        return result;
    }
    public static String lessThanTwenty(int num) {
        String result = "";
        switch (num) {
            case 10:
                result = "ten";
                break;
            case 11:
                result = "eleven";
                break;
            case 12:
                result = "twelve";
                break;
            case 13:
                result = "thirteen";
                break;
            case 14:
                result = "fourteen";
                break;
            case 15:
                result = "fifteen";
                break;
            case 16:
                result = "sixteen";
                break;
            case 17:
                result = "seventeen";
                break;
            case 18:
                result = "eighteen";
                break;
            case 19:
                result = "nineteen";
                break;
            case 20:
                result = "twenty";
                break;
        }
        return result;
    }
    public static String twoDigits(int num) {
        String[] tensWords = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] onesWords = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if (num % 10 == 0) {
            return tensWords[num / 10];
        } else {
            return tensWords[num / 10] + " " + onesWords[num % 10];
        }
    }
    public static String threeDigits(int num) {
        String[] tensWords = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] onesWords = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if(num % 100  == 0) {
            return lessThanTen(num/100) + " hundred";
        }
        else if ((num % 100) < 10) {
            return lessThanTen(num/100) + " hundred and " + lessThanTen(num %100);
        } else if((num % 100) < 20) {
            return lessThanTen(num/100) + " hundred and " + lessThanTwenty(num %  100);
        }else {
            return lessThanTen(num / 100) + " hundred and " + twoDigits(num % 100);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean rightFormat = false;
        int num = 0 ;
        do {
            System.out.println("Nhập vào một số (tối đa 3 kí tự):");
            num = scanner.nextInt();
            if (num >= 1000 || num < 0) {
                System.out.println("out of ability");
                rightFormat = false;
            } else {
                rightFormat = true;
            }
        } while (!rightFormat);

        if (num < 10) {
            System.out.println(lessThanTen(num));
        } else if (num < 20) {
            System.out.println(lessThanTwenty(num));
        } else if (num < 100) {
            System.out.println(twoDigits(num));
        } else {
            System.out.println(threeDigits(num));
        }
    }
}
