import java.util.Comparator;

public class SortingStudentByScore implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getFinalScore() > o2.getFinalScore()) return 1;
        if(o1.getFinalScore() < o2.getFinalScore()) return -1;
        return 0;
    }
}
