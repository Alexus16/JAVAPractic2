public class Main {
    public static void main(String[] args)
    {
        Matrix m1 = new Matrix(2, 3);
        Matrix m11 = new Matrix(2, 3);
        Matrix m2 = new Matrix(3, 4);
        m1.setValues(
                new double[][]
                        {{1, 1, 1},
                        {2, 2, 2}});
        m11.setValues(
                new double[][]
                        {{3, 3, 3},
                        {2, 2, 2}});
        m2.setValues(
                new double[][]
                        {{1, 1, 1, 1},
                        {3, 3, 3, 3},
                        {2, 2, 2, 2}});
        Matrix m3 = m1.add(m11);
        Matrix m4 = m1.mul(2.0);
        Matrix m5 = m1.mulMatrix(m2);
        m1.print();
        System.out.println();
        m11.print();
        System.out.println();
        m2.print();
        System.out.println();
        m3.print();
        System.out.println();
        m4.print();
        System.out.println();
        m5.print();
    }
}