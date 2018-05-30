package hometask2;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Введите кол-во программистов: ");
        Scanner sc = new Scanner(System.in);
        int programmersNum = sc.nextInt();
        int finalres = recurs(programmersNum);
        System.out.printf("Всего в стенах компании провели %d собеседований", finalres);
    }

    static int recurs(int programmersNum) {
        int result;
        if (programmersNum == 1) {
            return 1;
        } else {
            result = recurs(programmersNum - 1) * programmersNum;
            return result;
        }
    }
}
