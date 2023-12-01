import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1, 2, 3, 4, 5,};
        LinkedList<Integer> list = convertArrToList(arr);
        for(var e : list)
        {
            System.out.println(e);
        }
        System.out.println(getElementByIndex(arr, 1));
    }

    private static <T> LinkedList<T> convertArrToList(T[] array)
    {
        LinkedList<T> res = new LinkedList<>();
        for(var elem : array)
        {
            res.add(elem);
        }
        return res;
    }

    private static <T> T getElementByIndex(T[] array, int index)
    {
        return array[index];
    }
}