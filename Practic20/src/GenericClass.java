public class GenericClass<T extends Object, V, K> {
    private T _t;
    private V _v;
    private K _k;
    public GenericClass(T t, V v, K k)
    {
        _t = t;
        _v = v;
        _k = k;
    }

    public void printVars()
    {
        System.out.printf("T var is %s\n\r", _t.toString());
        System.out.printf("V var is %s\n\r", _v.toString());
        System.out.printf("K var is %s\n\r", _k.toString());
    }
}
