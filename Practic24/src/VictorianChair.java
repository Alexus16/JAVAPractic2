public class VictorianChair implements Chair{
    private int _age;

    public VictorianChair(int age)
    {
        _age = age;
    }

    public void sitOnChair() {
        System.out.println("It's very old chair, its age is");
        printAge();
    }

    private void printAge()
    {
        System.out.println(_age);
    }
}
