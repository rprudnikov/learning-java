package hometask5;

public class Calculator {


    public double calculate(double val1, double val2, String operator) {
        BinaryOperation operation = getOperationFor(operator);

        if (operation == null) {
            System.out.println("Неизвестный оператор " + operator);
            return Double.NaN;
        }

        return operation.resultFor(val1, val2);
    }

    private BinaryOperation getOperationFor(String operator) {
        if ("*".equals(operator)) {
            return new Multiplication();
        } else if ("-".equals(operator)) {
            return new Substraction();
        } else if ("+".equals(operator)) {
            return new Addition();
        } else if ("/".equals(operator)) {
            return new Division();
        } else if ("^".equals(operator)) {
            return new Powering();
        } else if ("log".equals(operator)) {
            return new Logarithmation();
        } else if ("sqrt".equals(operator)) {
            return new Extraction();
        }

        return null;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.calculate(15.0, 15.0, "*"));
        System.out.println(calculator.calculate(15.0, 15.0, "-"));
        System.out.println(calculator.calculate(15.0, 15.0, "+"));
        System.out.println(calculator.calculate(15.0, 15.0, "/"));
        System.out.println(calculator.calculate(15.0, 15.0, "^"));
        System.out.println(calculator.calculate(256.0, 2, "log"));
        System.out.println(calculator.calculate(9, 2, "sqrt"));
    }
}