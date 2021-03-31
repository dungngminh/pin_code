package C1;

public class b9 {

    public int giaithua(int i) {
        if (i == 1) {
            return 1;
        }
        return i * (giaithua(i - 1));
    }

    public void solveFunc(int n) {
        double s = 15;
        for (int i = 1; i <= n; i++) {
            s += Math.pow((-1), i) * 1.0 / giaithua(i);
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        int n = 10;
        b9 obj = new b9();
        obj.solveFunc(n);
    }
}
