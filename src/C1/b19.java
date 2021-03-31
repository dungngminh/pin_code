package C1;

public class b19 {
    public int fibonacci(int n) {
        if(n == 0 || n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public void printFibo(int n){
        for(int i = 0; i < n; i++){
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println(fibonacci(n));
    }
    public static void main(String[] args) {
        int n = 10;
        b19 obj = new b19();
        obj.printFibo(n);
    }
}
