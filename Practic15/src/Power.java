public class Power implements MathOperation{
    @Override
    public double Calculate(double leftOperand, double rightOperand) {
        return Math.pow(leftOperand, rightOperand);
    }
}
