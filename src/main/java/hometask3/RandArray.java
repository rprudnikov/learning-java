package hometask3;

import java.util.Arrays;
import java.util.Scanner;

public class RandArray {
    public static void main(String[] args) {

        int arrayLength = 0;
        while (arrayLength < 10 || arrayLength > 100) {    //Повторяем запрос на ввод до корректного ввода
            System.out.print("Введите длину массива от 10 до 100: ");
            Scanner sc = new Scanner(System.in);
            arrayLength = sc.nextInt();
        }

        int randArray[] = new int[arrayLength];    //Передаем длину массива, заполняем random'ом от 1 до 10 и выводим
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = (int) (Math.random() * 10);
        }
        System.out.println("Ваш массив: " + Arrays.toString(randArray));

        StringBuilder finalStr = new StringBuilder();   //Создаем новую строку и записываем в нее числа, кратные 3
        for (int i = 0; i < randArray.length; i++) {
            if (randArray[i] % 3 == 0) {
                finalStr.append(randArray[i]);
            }
        }

        System.out.print("Числа в массиве, кратные 3: ");
        for (int i = 0; i < finalStr.length(); i++) {   //Выводим числа, кратные 3, через запятую
            System.out.print(finalStr.charAt(i));
            if (i < finalStr.length() - 1) {
                System.out.print(", ");
            }
        }
    }
}


