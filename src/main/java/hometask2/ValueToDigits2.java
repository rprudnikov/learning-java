package hometask2;

import java.util.Scanner;

public class ValueToDigits2 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        long userInput = sc.nextLong();
        long result = 0;
        long i = userInput;
        while (i > 0) {
            result = result + (i % 10);
            i = i / 10;
        }
        System.out.printf("Сумма цифр числа %d => %d", userInput, result);
    }

}


