package C1;

public class b10 {
    public int giaithua(int i) {
        if (i == 1) {
            return 1;
        }
        return i * (giaithua(i - 1));
    }

    public void solveFunc(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s += 1.0/giaithua(2*i-1);
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        int n = 10;
        b10 obj = new b10();
        obj.solveFunc(n);
    }
}
