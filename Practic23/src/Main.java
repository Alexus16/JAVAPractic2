public class Main {
    // (x + y) / 3 + 12x - 11y - 7
    // x = 0; y = 0: -7
    public static void main(String[] args) {
        Operation op =
                new SubtractionOperation(
                        new SubtractionOperation(
                                new SumOperation(
                                        new DivideOperation(
                                                new SumOperation(
                                                        new VariableOperation("x"),
                                                        new VariableOperation("y")),
                                                new ValueOperation(3)),
                                        new MultiplyOperation(
                                                new ValueOperation(12),
                                                new VariableOperation("x"))),
                                new MultiplyOperation(
                                        new ValueOperation(11),
                                        new VariableOperation("y"))),
                        new ValueOperation(7));
        ParameterSet set = new ParameterSet();
        set.SetValueOfVariable("x", 1);
        set.SetValueOfVariable("y", 0);
        System.out.printf("Result: %.3f", op.getValue(set));
    }
}