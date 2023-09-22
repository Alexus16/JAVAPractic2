public class Main {
    public static void main(String[] args) {
        Double d1 = Double.valueOf("12341123123.123");
        System.out.println(d1);
        Double d2 = Double.valueOf("11231232");
        System.out.println(d2);
        Double d3 = Double.valueOf("-3.333");
        System.out.println(d3);
        Double d4 = Double.valueOf(1234.0);
        System.out.println(d4);
        String sd1 = "3.1415926";
        Double pi = Double.parseDouble(sd1);
        System.out.println(pi);

        int intv = d1.intValue();
        System.out.println(intv);
        byte bytev = d1.byteValue();
        System.out.println(bytev);
        long longv = d1.longValue();
        System.out.println(longv);
        boolean boolv = Boolean.parseBoolean(d1.toString());
        System.out.println(boolv);
        char charv = (char)d1.shortValue();
        System.out.println(charv);
        short shortv = d1.shortValue();
        System.out.println(shortv);

        String piS = Double.toString(3.14);
        System.out.println(piS);
    }
}