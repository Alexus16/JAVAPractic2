import java.util.Random;

public class Main {
    private static final int arr_len = 5;
    public static void main(String[] args) {
        double[] arr1 = generateByMath();
        double[] arr2 = generateByRandom();
        printArr(arr1);
        printArr(arr2);
        sort(arr1);
        sort(arr2);
        printArr(arr1);
        printArr(arr2);
    }

    static double[] generateByMath()
    {
        double[] arr = new double[arr_len];
        for(int i = 0; i < 5; i++)
        {
            arr[i] = Math.random();
        }
        return arr;
    }

    static double[] generateByRandom()
    {
        Random rand = new Random(0);
        double[] arr = new double[arr_len];
        for(int i = 0; i < arr_len; i++)
        {
            arr[i] = rand.nextDouble();
        }
        return arr;
    }

    static void sort(double[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(arr[j] > arr[i])
                {
                    double inserting = arr[i];
                    for(int k = i; k > j; k--)
                    {
                        arr[k] = arr[k-1];
                    }
                    arr[j] = inserting;
                }
            }
        }
    }

    static void printArr(double[] arr)
    {
        System.out.print("{ ");
        for(double el : arr)
        {
            System.out.print(String.format("%.5f, ", el));
        }
        System.out.println("}");
    }
}