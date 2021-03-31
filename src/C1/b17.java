package C1;

public class b17 {
    public void checkNumber(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                count += 1;
        if (count <= 1)
            System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        b17 obj = new b17();
        for (int i = 1; i <= n; ++i) {
            obj.checkNumber(i);
        }
    }
}
