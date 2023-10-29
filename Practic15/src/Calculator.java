import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class Calculator extends JFrame {
    private JLabel _resultLabel;
    private JTextField _leftOperandField;
    private JTextField _rightOperandField;
    private LinkedList<JButton> _operationBtns;

    public Calculator()
    {
        super();
        _resultLabel = new JLabel();
        _resultLabel.setSize(200, 25);
        _leftOperandField = new JTextField();
        _leftOperandField.setSize(140, 20);
        _rightOperandField = new JTextField();
        _rightOperandField.setSize(140, 20);
        _operationBtns = new LinkedList<>();
    }

    public void AddResultButton(CalculatorResultButton btn)
    {
        _operationBtns.add(btn.GetJButton(this));
    }

    public void Build()
    {
        super.setTitle("Calculator");
        placeItems();
    }

    private void placeItems()
    {
        var layout =  new GridBagLayout();
        layout.rowHeights = new int[] {40, 40, 200};
        var container = getContentPane();
        container.setLayout(layout);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridy = 0;
        container.add(_resultLabel, constraints);

        constraints.gridy = 1;
        container.add(getFieldsPanel(), constraints);

        constraints.gridy = 2;
        container.add(getResultButtonsPanel(), constraints);
    }

    private JPanel getFieldsPanel()
    {
        JPanel panel = new JPanel();
        var layout = new GridBagLayout();
        layout.columnWeights = new double[] {0.5, 0.5};
        panel.setLayout(layout);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        panel.add(_leftOperandField, constraints);

        constraints.gridx = 1;
        panel.add(_rightOperandField, constraints);
        return panel;
    }

    private JPanel getResultButtonsPanel()
    {
        JPanel panel = new JPanel();
        var layout = new FlowLayout();
        panel.setLayout(layout);
        for(var btn: _operationBtns)
        {
            panel.add(btn);
        }
        return panel;
    }

    public void SetResult(double res)
    {
        _resultLabel.setText(String.valueOf(res));
    }

    public double GetLeftOperand()
    {
        return Double.parseDouble(_leftOperandField.getText());
    }

    public double GetRightOperand()
    {
        return Double.parseDouble(_rightOperandField.getText());
    }
}
