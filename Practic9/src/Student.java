public class Student implements Comparable<Student>{
    private int iDNumber;
    public Student(int id)
    {
        iDNumber = id;
    }

    public int getiDNumber()
    {
        return iDNumber;
    }

    @Override
    public int compareTo(Student o) {
        if(o.getiDNumber() < iDNumber) return 1;
        if(o.getiDNumber() > iDNumber) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Студент с id %d", iDNumber);
    }
}
