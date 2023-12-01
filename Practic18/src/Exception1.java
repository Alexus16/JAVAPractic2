public class Exception1 {
    public void exceptionDemo() {
        System.out.println( 2 / 0 );
    }

    public void exceptionDemo2() {
        System.out.println( 2.0 / 0.0 );
    }

    public void exceptionDemo3() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) { System.out.println("Attempted division by zero");
        }
    }
}