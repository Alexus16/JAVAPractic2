import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        PhoneNumberFormatter formatter = new PhoneNumberFormatter();
        while (true)
        {
            input = scanner.next();
            if(input == "exit") return;
            System.out.printf("Number: %s\n\r", formatter.FormatNumber(input));
        }
    }
}