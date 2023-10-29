public class SecondRootOfEqual implements MathOperation{
    @Override
    public double Calculate(double leftOperand, double rightOperand) {
        return (-leftOperand + Math.sqrt(Math.pow(leftOperand, 2) - 4.0 * rightOperand)) / 2.0;
    }
}
