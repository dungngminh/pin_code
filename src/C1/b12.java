package C1;

public class b12 {
    public void solveFunc(int n) {
        int s = 0;
        int p = 1;
        do {
            int temp = n % 10;
            s += temp;
            p *= temp;
            n /= 10;
        } while (n != 0);
        System.out.println("tong la " + s + " tich la " + p);
    }

    public static void main(String[] args) {
        int n = 234;
        b12 obj = new b12();
        obj.solveFunc(n);
    }
}
