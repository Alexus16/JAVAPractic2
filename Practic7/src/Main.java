public class Main {
    public static void main(String[] args) {
        MathCalculable[] funcs = new MathCalculable[]
                {
                        new LinePoly(1, 1),
                        new LinePoly(-10, 1),
                        new LinePoly(1, 33),
                        new QuadPoly(1, 1, 1),
                        new QuadPoly(0, 1, 1),
                        new QuadPoly(2, -4, 3),
                        new QuadPoly(1, -2, 1),
                };
        double[] arg = new double[]
                {
                        1.0,
                        2.0,
                        -1.0,
                        0.0,
                        12.0,
                        1.1121,
                };

        for(var sarg : arg)
        {
            System.out.println();
            System.out.printf("ARG: %.3f\n\r", sarg);
            for (var f : funcs)
            {
                System.out.printf("%s = %.3f\n\r", f, f.Calculate(sarg));
            }
        }
    }
}