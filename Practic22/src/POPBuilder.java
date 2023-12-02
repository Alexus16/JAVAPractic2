import java.io.StringReader;
import java.util.*;

public class POPBuilder {
    public Operation create(String record)
    {
        Stack<String> operands = new Stack<>();
        Scanner scanner = new Scanner(new StringReader(record));
        while(scanner.hasNext())
        {
            operands.push(scanner.next());
        }
        return getOperationFromStack(operands);
    }

    private Operation getOperationFromStack(Stack<String> operands)
    {
        if(operands.empty()) throw new POPUnavailableException("Stack is empty");
        String operation = operands.pop();
        try
        {
            ValueOperation op = new ValueOperation();
            op.setValue(Double.parseDouble(operation));
            return op;

        }
        catch (NumberFormatException e)
        {
            BinaryOperation op = getOperationByString(operation);
            op.setRight(getOperationFromStack(operands));
            op.setLeft(getOperationFromStack(operands));
            return op;
        }
        catch (Exception e)
        {
            throw e;
        }
    }

    private BinaryOperation getOperationByString(String operation)
    {
        return switch (operation) {
            case "+" -> new SumOperation();
            case "-" -> new SubtractionOperation();
            case "*" -> new MultiplyOperation();
            case "/" -> new DivideOperation();
            case "%" -> new ModOperation();
            default -> throw new POPUnavailableException("Operation not found");
        };
    }
}
