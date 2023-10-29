import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CalculatorResultButton[] resultButtons = new CalculatorResultButton[]
                {
                        new CalculatorResultButton(new Addition(), "+"),
                        new CalculatorResultButton(new Substraction(), "-"),
                        new CalculatorResultButton(new Multiplication(), "*"),
                        new CalculatorResultButton(new Division(), "/"),
                        new CalculatorResultButton(new Power(), "^"),
                        new CalculatorResultButton(new FirstRootOfEqual(), "1st"),
                        new CalculatorResultButton(new SecondRootOfEqual(), "2nd"),
                };
        Calculator c = new Calculator();
        for(var r : resultButtons)
        {
            c.AddResultButton(r);
        }
        c.Build();
        c.setVisible(true);
    }
}