package hometask4;

import java.util.Scanner;

public class Point {
    float xStart;
    float yStart;

    public Point(float xInput, float yInput) {
        xStart = xInput;
        yStart = yInput;
    }

    float distance(float xDest, float yDest) {
        float xResult = xStart - xDest;
        float yResult = yStart - yDest;
        float resultDest = (float) Math.sqrt(xResult * xResult + yResult * yResult);
        return resultDest;
    }

    public static void main(String[] args) {
        System.out.print("Введите x начальной точки: ");
        Scanner input = new Scanner(System.in);
        float xInput = input.nextInt();
        System.out.print("Введите y начальной точки: ");
        float yInput = input.nextInt();
        System.out.print("Введите x конечной точки: ");
        float xDest = input.nextInt();
        System.out.print("Введите y конечной точки: ");
        float yDest = input.nextInt();

        Point p = new Point(xInput, yInput);
        System.out.println("Расстояние между точками: " + p.distance(xDest, yDest));
    }
}