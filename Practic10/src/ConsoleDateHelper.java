import java.awt.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ConsoleDateHelper {
    private Scanner inputScanner;
    private Pattern datePattern;
    public ConsoleDateHelper(Scanner inputScanner)
    {
        this.inputScanner = inputScanner;
        this.datePattern = Pattern.compile("(?<day>\\d+).(?<month>\\d+).(?<year>\\d+) (?<hour>\\d{2}):(?<minute>\\d{2})");
    }

    public Calendar GetCalendar()
    {
        String inputString = inputScanner.next();
        var m = datePattern.matcher(inputString);
        int year = Integer.parseInt(m.group("year"));
        int month = Integer.parseInt(m.group("month"));
        int day = Integer.parseInt(m.group("day"));
        int hour = Integer.parseInt(m.group("hour"));
        int minute = Integer.parseInt(m.group("minute"));
        Calendar calendar = new GregorianCalendar(year, month, day, hour, minute);
        return calendar;
    }

    public Date GetDate()
    {
        String inputString = inputScanner.next();
        var m = datePattern.matcher(inputString);
        int year = Integer.parseInt(m.group("year"));
        int month = Integer.parseInt(m.group("month"));
        int day = Integer.parseInt(m.group("day"));
        int hour = Integer.parseInt(m.group("hour"));
        int minute = Integer.parseInt(m.group("minute"));
        Date date = new Date(year, month, day, hour, minute);
        return date;
    }
}
