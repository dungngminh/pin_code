package C1;

public class b13 {
    public int gcd(int a, int b) {
        while (a * b != 0) {
            if (a > b)
                a %= b;
            else
                b %= a;
        }
        return a + b;
    }

    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        int a = 4, b = 6;
        b13 obj = new b13();
        System.out.println("UCLN cua a va b la " + obj.gcd(a, b) + "\nBCLN cua a va b la " + obj.lcm(a, b));
    }
}
