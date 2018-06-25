package hometask4;

import java.util.Random;
import java.util.Scanner;

public class TriangleApp {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int arraySize = 1000000;

        Triangle[] array = new Triangle[arraySize];
        for (int i = 0; i < array.length; i++) {
            Point a = new Point(rand.nextInt(100), rand.nextInt(100));
            Point b = new Point(rand.nextInt(100), rand.nextInt(100));
            Point c = new Point(rand.nextInt(100), rand.nextInt(100));
            Triangle newTriangle = new Triangle(a, b, c);
            array[i] = newTriangle;

        }
        System.out.println("Выберите тип треугольника для поиска");
        System.out.println("1. Равнобедренный");
        System.out.println("2. Равносторонний");
        System.out.println("3. Прямоугольный");
        System.out.println("4. Произвольный");

        int userChoice = sc.nextInt();

        for (int i = 0; i < arraySize; i++) {
            if (array[i].getTriangleType() == userChoice) {
                System.out.println("Мы нашли ваш треугольник!");
                System.out.println("Индекс: " + i);
                System.out.println("Треугольник: " + array[i].getTriangleInfo());
                System.out.println("Периметр: " + array[i].calculatePerimeter());
                System.out.println("Площадь: " + array[i].calculateSquare());
                break;
            }
        }
    }
}