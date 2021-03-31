package C1;

public class b20 {
    public int fibonacci(int n) {
        if (n == 0 || n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public void checkNum(int n) {
        if (n == 1) {
            System.out.println("K thuoc day fibonacci va thuoc vi tri thu 1, 2");
            return;
        }
        for (int i = 0; i <= n; ++i) {
            if (n == fibonacci(i)) {
                System.out.println("K thuoc day fibonacii, vi tri thu " + (i + 1));
                return;
            }
        }
        System.out.println("K khong thuoc day fibonacii");
    }
    public static void main(String[] args) {
        int k = 3;
        b20 obj = new b20();
        obj.checkNum(k);
    }
}
