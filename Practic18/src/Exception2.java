import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo1() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2/i );
    }

    public void exceptionDemo2() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try
        {
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
        catch (NumberFormatException e)
        {
            System.err.println("Not a correct number");
        }
        finally {
            System.out.println("Processing input complete");
        }
    }
}