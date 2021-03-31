package C1;

public class b8 {
    public void solveFunc(int n) {
        double s = 0;
        for(int i = 1; i <= n; i++){
            s += 1.0/i;
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        int n = 5;
        b8 obj = new b8();
        obj.solveFunc(n);
    }

    
}
