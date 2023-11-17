import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)
    {
        Pattern datePattern = Pattern.compile("(((0[^0])|([1-2]\\d)|(3[0-1]))/((0[^0])|(1[0-2]))/((19\\d\\d)|[^0-1]\\d\\d\\d))");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        var matcher = datePattern.matcher(input);
        System.out.printf("%s", matcher.matches() ? "yes" : "no");
    }
}