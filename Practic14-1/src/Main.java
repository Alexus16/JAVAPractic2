import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Pattern control = Pattern.compile("abcdefghijklmnopqrstuv18340");
        var matcher = control.matcher(input);
        System.out.printf("This string%s match abcdefghijklmnopqrstuv18340", matcher.matches() ? "" : " not");
    }
}