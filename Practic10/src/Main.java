import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Student> scoreStudentComparator = new SortingStudentByScore();
        TreeSet<ExtendedStudent> integratedStudents = new TreeSet<>(scoreStudentComparator);
        integratedStudents.add(new ExtendedStudent("Peter", "Petrov", "XXXX-XX-XX", 1, "12.12.2022"));
        integratedStudents.add(new ExtendedStudent("Ivan", "Ivanov", "XXXX-XX-XX", 1000, "12.12.2022"));
        integratedStudents.add(new ExtendedStudent("Nikolai", "Nikolaev", "XXXX-XX-XX", 102, "12.12.2022"));
        integratedStudents.add(new ExtendedStudent("Konstantin", "Konstantinov", "XXXX-XX-XX", 312, "12.12.2022"));
        integratedStudents.add(new ExtendedStudent("Vasiliy", "Vasiliev", "XXXX-XX-XX", 45, "12.12.2022"));
        integratedStudents.add(new ExtendedStudent("Vladimir", "Vladimirov", "XXXX-XX-XX", 133, "12.12.2022"));
        integratedStudents.add(new ExtendedStudent("Vyacheslav", "V", "XXXX-XX-XX", 122, "12.12.2022"));

        Scanner consoleScanner = new Scanner(System.in);
        TreeSet<ExtendedStudent> inputStudents = new TreeSet<>(scoreStudentComparator);
        String exitToken = "";
        while (true)
        {
            exitToken = consoleScanner.next();
            if(exitToken.equals("exit")) break;
            inputStudents.add(new ExtendedStudent(exitToken, consoleScanner.next(), consoleScanner.next(), consoleScanner.nextInt(), consoleScanner.next()));
        }

        TreeSet<ExtendedStudent> allStudents = new TreeSet<>(scoreStudentComparator);
        for(var s : integratedStudents)
        {
            allStudents.add(s);
        }
        for(var s : inputStudents)
        {
            allStudents.add(s);
        }
        for(var s : allStudents)
        {
            System.out.println(s.toString("dd.mm.yyyy"));
        }
    }
}