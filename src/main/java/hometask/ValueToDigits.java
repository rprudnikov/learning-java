package hometask;

public class ValueToDigits {
    public static void main(String[] args) {
        int value=45685;

        System.out.println(value/10000);
        System.out.println(value/1000%10);
        System.out.println(value/100%10);
        System.out.println(value/10%10);
        System.out.println(value/1%10);
    }
}
