package hometask5;

public class Powering implements BinaryOperation {
    @Override
    public double resultFor(double left, double right) {
        return Math.pow(left, right);
    }
}
