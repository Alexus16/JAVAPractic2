public class Student {
    private String name;
    private String surname;
    private String group;
    private int finalScore;

    public Student(String name, String surname, String group, int finalScore)
    {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.finalScore = finalScore;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getGroup()
    {
        return group;
    }

    public int getFinalScore()
    {
        return finalScore;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public void setGroup(String group)
    {
        this.group = group;
    }

    public void setFinalScore(int finalScore)
    {
        this.finalScore = finalScore;
    }

    @Override
    public String toString() {
        return String.format("%s %s [%s]: %d", name, surname, group, finalScore);
    }
}
