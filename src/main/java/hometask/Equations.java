package hometask;

public class Equations {
    public static void main(String[] args) {
        Equations.lng();
        Equations.nt();
        Equations.flt();
        Equations.dbl();
    }

    static void lng() {
        long x = 1;
        long y = 2;
        long z = 3;
        long n = 4;
        long equation = x - (y + 123) / z * n;
        System.out.printf("Решение уравнения для long x - (y + 123) / z * n: %d%n", equation);

    }

    static void nt() {
        int x = 1;
        int y = 2;
        int z = 3;
        int n = 4;
        int equation = x - (y + 123) / z * n;
        System.out.printf("Решение уравнения для int x - (y + 123) / z * n: %d%n", equation);
    }

    static void flt() {
        float x = 1;
        float y = 2;
        float z = 3;
        float n = 4;
        float equation = x - (y + 123) / z * n;
        System.out.printf("Решение уравнения для float x - (y + 123) / z * n: %f%n", equation);
    }

    static void dbl() {
        double x = 1;
        double y = 2;
        double z = 3;
        double n = 4;
        double equation = x - (y + 123) / z * n;
        System.out.printf("Решение уравнения для double x - (y + 123) / z * n: %f%n", equation);
    }
}