package C1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b14 {
    public void checkNumber(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                count += 1;
        if (count > 1)
            System.out.println("Khong phai so nguyen to");
        else
            System.out.println("La so nguyen to");
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Nhap vao so m:");
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(inStream);
        String line = stdin.readLine();
        int m = Integer.parseInt(line);
        b14 obj = new b14();
        obj.checkNumber(m);
    }
}
