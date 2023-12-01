public class VariableNotSetException extends RuntimeException{

    public  VariableNotSetException(String varName)
    {
        super(String.format("Variable %s not set exception", varName));
    }
}
