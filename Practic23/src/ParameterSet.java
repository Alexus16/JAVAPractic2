import java.util.HashMap;
import java.util.Map;

public class ParameterSet {
    private Map<String, Double> _vars = new HashMap<>();
    public double GetValueOfVariable(String varName)
    {
        if(!_vars.containsKey(varName)) throw new VariableNotSetException(varName);
        return _vars.get(varName);
    }

    public void SetValueOfVariable(String varName, double value)
    {
        _vars.put(varName, value);
    }
}
