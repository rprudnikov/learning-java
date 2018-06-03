package hometask2;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        System.out.print("Программа рисует сетку 4x4. Введите ширину ячейки сетки 3, 6 или 9:");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        for (int i = 0; i < 5; i++) {   //вызов метода сплошной линии 5 раз и метода линии с пробелами 4 раза
            drawLine(userInput);
            if (i < 4) {
                for (int j = 0; j < userInput / 3; j++) {
                    drawCell(userInput);
                }
            }
        }
    }

    static void drawLine(int userInput) {   //рисует сплошную линию

        for (int i = 0; i < 5 + (userInput * 4); i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void drawCell(int userInput) {   //рисует линию с пробелами

        for (int i = 0; i < 4; i++) {
            System.out.print("*");
            for (int j = 0; j < userInput; j++) {
                System.out.print(" ");
            }
        }
        System.out.println("*");
    }
}







