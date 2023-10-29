import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorResultButton {
    private MathOperation _operation;
    private String _title;
    public CalculatorResultButton(MathOperation operation, String title)
    {
        _operation = operation;
        _title = title;
    }

    public JButton GetJButton(Calculator calculator)
    {
        JButton btn = new JButton();
        btn.setSize(12, 12);
        btn.setText(_title);
        btn.addActionListener(getActionListenerForJButton(calculator));
        return btn;
    }

    private ActionListener getActionListenerForJButton(Calculator calculator)
    {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.SetResult(_operation.Calculate(calculator.GetLeftOperand(), calculator.GetRightOperand()));
            }
        };
    }
}
