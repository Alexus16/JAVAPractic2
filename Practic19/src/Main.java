import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        INNChecker checker = new INNChecker();
        while(input != "exit")
        {
            try
            {
                checker.ensureINNCorrect(input);
                System.out.println("INN is correct");
            }
            catch (INNFormatException e)
            {
                System.out.println("Entered INN is incorrect");
            }
            input = scanner.next();
        }
    }
}