package C1;

public class b16 {
    public void checkNum(int n) {
        int _n = n, i, temp = 0;
        while (n != 0) {
            i = n % 10;
            temp = temp * 10 + i;
            n /= 10;
        }
        if (_n == temp)
            System.out.println("M la so doi xung");
        else
            System.out.println("M ko phai la so doi xung");
    }

    public static void main(String[] args) {
        int number = 122;
        b16 obj = new b16();
        obj.checkNum(number);
    }
}
