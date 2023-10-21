public class Main {
    public static void main(String[] args) {
        print(1200000000);
    }

    public static void print(int n)
    {
        if(n == 0) return;
        print(n - 1);
        int x;
        for(x = 0; n > 0; x++) n-= x;
        System.out.printf("%40d", x-1);
    }
}