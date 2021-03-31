package C1;

public class b15 {
    public void solveFunc(int p){
        double i = Math.sqrt(p);
        if(i * i == p)
            System.out.println("P la so chinh phuong");
        else System.out.println("P ko phai la so chinh phuong");
    }
    public static void main(String[] args) {
        int p = 576;
        b15 obj = new b15();
        obj.solveFunc(p);
    }
}
