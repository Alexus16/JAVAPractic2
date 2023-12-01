import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        POPBuilder builder = new POPBuilder();
        while(input != "exit")
        {
            if(input != "")
            {
                try
                {
                    var res = builder.create(input);
                    System.out.printf("Result: %.3f\n\r", res.getValue());
                }
                catch (POPUnavailableException e)
                {
                    System.out.printf("POP can't be created: %s\n\r", e.getMessage());
                }
                catch (Exception e)
                {
                    System.out.printf("Exception: %s\n\r", e.getMessage());
                }
            }
            input = scanner.nextLine();
        }
    }
}