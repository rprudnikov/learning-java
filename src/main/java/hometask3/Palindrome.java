package hometask3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        System.out.println(IsPalindrome(inputString));
    }

    static String IsPalindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                return "Это не палиндром";
            }
        }
        return "Это палиндром";
    }
}
