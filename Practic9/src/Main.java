public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student(1),
                new Student(331),
                new Student(1241),
                new Student(112),
                new Student(999),
                new Student(142),
                new Student(111),
        };

        System.out.println("Initial");
        for(var student: students)
        {
            System.out.println(student);
        }

        sort(students);

        System.out.println();
        System.out.println("Sorted");
        for(var student: students)
        {
            System.out.println(student);
        }
    }

    static void sort(Comparable[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(arr[j].compareTo(arr[i]) > 0)
                {
                    Comparable inserting = arr[i];
                    for(int k = i; k > j; k--)
                    {
                        arr[k] = arr[k-1];
                    }
                    arr[j] = inserting;
                }
            }
        }
    }
}