package hometask5;

public class Logarithmation implements BinaryOperation {
    @Override
    public double resultFor(double left, double right) {
        return Math.log(left) / Math.log(right);
    }
}
