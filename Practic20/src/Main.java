public class Main {
    public static void main(String[] args) {
        GenericClass<Integer, String, Double> g = new GenericClass<>(1, "aaaa", -12.2);
        g.printVars();
    }
}