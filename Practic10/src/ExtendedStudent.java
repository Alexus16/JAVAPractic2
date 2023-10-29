import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtendedStudent extends Student{
    private Date born;

    public ExtendedStudent(String name, String surname, String group, int finalScore, Date born)
    {
        super(name, surname, group, finalScore);
        this.born = born;
    }

    public ExtendedStudent(String name, String surname, String group, int finalScore, String born)
    {
        super(name, surname, group, finalScore);
        DateFormat df = new SimpleDateFormat("dd.mm.yyyy");
        try
        {
            this.born = df.parse(born);
        }
        catch (Exception e)
        {
            this.born = new Date();
        }
    }

    public String toString(String dateFormat)
    {
        return toString() + " " + processDate(dateFormat);
    }

    private String processDate(String dateFormat)
    {
        return new SimpleDateFormat(dateFormat).format(born);
    }
}
