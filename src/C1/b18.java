package C1;

public class b18 {
    public void checkNum(int n) {
        int temp = 0;
        for (int i = 1; i <= n / 2; ++i) {
            if (n % i == 0)
                temp += i;
        }
        if (n == temp)
            System.out.println(n);
    }
    public static void main(String[] args) {
        b18 obj = new b18();
        for (int i = 1; i <= 1000; ++i)
            obj.checkNum(i);
    }
}
