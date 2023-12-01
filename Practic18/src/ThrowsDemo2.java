import java.util.Scanner;

public class ThrowsDemo2 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        boolean correctInput = false;
        while(!correctInput)
        {
            String key = myScanner.next();
            try
            {
                printDetails( key );
                correctInput = true;
            }
            catch (Exception e)
            {
                System.out.println("Try again");
            }
        }
    }
    public void printDetails(String key) throws Exception {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if(key == "") { throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }
}