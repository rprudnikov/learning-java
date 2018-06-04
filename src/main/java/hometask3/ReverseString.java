package hometask3;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        String[] splitString = inputString.split(" ");  //формируем новый массив с разбитыми по " " словами, передаем каждое слово в reverseString()
        for (int i = 0; i < splitString.length; i++) {
            reverseString(splitString[i]);
        }
    }

    static void reverseString(String input) {
        String reversedString = new StringBuilder(input).reverse().toString();  //переворачиваем входящее слово
        System.out.print(reversedString+" ");

    }
}
